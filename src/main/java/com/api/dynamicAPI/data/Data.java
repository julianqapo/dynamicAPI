package com.api.dynamicAPI.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "data")
public class Data {
    @Id
    private String id;
    private String email;
    // private
}
