package com.example.reactivemongo.repository;
import com.example.reactivemongo.document.Post;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends ReactiveMongoRepository<Post,String> {
}
