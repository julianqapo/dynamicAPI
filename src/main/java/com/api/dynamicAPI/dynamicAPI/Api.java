package com.api.dynamicAPI.dynamicAPI;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// @Document(collection = "route")
@Document(collection = "route")
public class Api {
    @Id
    private String id;
    private String email;
    private String route;

    public Api(String email, String route) {
        this.email = email;
        this.route = route;
    }

    // IMPORTANT: Spring needs this getter to read the value from JSON
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // You need this for the JSON to be parsed correctly
    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}