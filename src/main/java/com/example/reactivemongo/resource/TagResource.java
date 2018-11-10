package com.example.reactivemongo.resource;

import com.example.reactivemongo.document.Tag;
import com.example.reactivemongo.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.awt.*;

@RestController
public class TagResource {

    @Autowired
    private TagService tagService;

    @GetMapping(value = "/serverSendEvents",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Tag> sendServerEventResourceTest(){
        return tagService.findAllServerSendEventsExample();
    }

}
