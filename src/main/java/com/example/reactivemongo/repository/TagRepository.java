package com.example.reactivemongo.repository;
import com.example.reactivemongo.document.Tag;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends ReactiveMongoRepository<Tag,String> {
}
