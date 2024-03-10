package com.zadokhin.monitoringdemo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "users")
@Data
public class UserMongo {
    @Id
    private String id;
    private String name;
    private String email;
    private LocalDate birthday;
}
