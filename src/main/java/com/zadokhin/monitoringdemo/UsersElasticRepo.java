package com.zadokhin.monitoringdemo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface UsersElasticRepo extends ElasticsearchRepository<UserElastic, String> {
    List<UserElastic> findByName(String name);
}
