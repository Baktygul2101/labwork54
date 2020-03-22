package com.example.lab.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Document(collection="subscriptions")
public class Subscription{
    @Id
    String id;
    @DBRef
    private Event event;
    String email;
    LocalDate regTime;

}