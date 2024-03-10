package com.zadokhin.monitoringdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MonitoringDemoController {

    private final UsersElasticRepo usersElasticRepo;
    private final UsersMongoRepo usersMongoRepo;

    @GetMapping("/elastic-johns")
    public List<UserElastic> queryElastic() {
        return usersElasticRepo.findByName("John");
    }

    @GetMapping("/mongo-johns")
    public List<UserMongo> queryMongo() {
        return usersMongoRepo.findByName("John");
    }

    @GetMapping("/all-johns")
    public AggregateUsersResult queryBoth() {
        return new AggregateUsersResult(usersElasticRepo.findByName("John"), usersMongoRepo.findByName("John"));
    }

    @Data
    @AllArgsConstructor
    static class AggregateUsersResult {
        private List<UserElastic> elasticUsers;
        private List<UserMongo> mongoUsers;
    }

}
