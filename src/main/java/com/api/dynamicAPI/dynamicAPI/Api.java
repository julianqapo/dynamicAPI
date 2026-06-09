package com.api.dynamicAPI.dynamicAPI;

public class Api {
    private String email;
    private String route;

    public Api(String email, String route) {
        this.email = email;
        this.route = route;
    }

    public void setRoute(String newRoute) {
        this.route = newRoute;
    }
}
