package com.example.reactivemongo.service;

import com.example.reactivemongo.document.Tag;
import com.example.reactivemongo.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;
import java.time.Duration;


@Service
public class TagService {

    @Autowired
    private TagRepository tagRepository;


    public Flux<Tag> findAll() {
        return tagRepository.findAll();
    }

    public Mono<Tag> save(Tag tag) {
        return tagRepository.save(tag);
    }

    public Mono<ResponseEntity<Tag>> findById(String id) {
        return tagRepository.findById(id)
                .map(tag -> ResponseEntity.ok(tag))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    public Flux<Tag> findAllServerSendEventsExample() {
        Flux<Tag> tags = tagRepository.findAll();

        Flux<Long> interval = Flux.interval(Duration.ofSeconds(1));

        return Flux.zip(interval,tags).map(Tuple2::getT2);
    }


}
