package com.api.dynamicAPI.dynamicAPI;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApiRepository extends MongoRepository<Api, String> {

}
