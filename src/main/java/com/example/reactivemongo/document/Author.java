package com.example.reactivemongo.document;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Author {

    @Id
    private String Id;

    @Indexed
    private String rut;

    private String name;

    private String surname;

    private List<Post> posts;

}
