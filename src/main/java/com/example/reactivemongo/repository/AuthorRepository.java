package com.example.reactivemongo.repository;

import com.example.reactivemongo.document.Author;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends ReactiveMongoRepository<Author,String> {
}
