package com.zadokhin.monitoringdemo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.time.LocalDate;

@Data
@Document(indexName = "users")
public class UserElastic {
    @Id
    private String id;
    private String name;
    private LocalDate birthday;
}
