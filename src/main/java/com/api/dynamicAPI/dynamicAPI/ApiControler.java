package com.api.dynamicAPI.dynamicAPI;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ApiControler {

    private final ApiRepository apiRepository;

    public ApiControler(ApiRepository apiRepository) {
        this.apiRepository = apiRepository;
    }

    @GetMapping("/route")
    public List<Api> getMethodName(String param) {
        return apiRepository.findAll();
    }

    @PostMapping("/route")
    public String postMethodName(@RequestBody Api api) {
        // TODO: process POST request
        System.out.println("\n\n\n\n\nReceived API: " + api.getEmail() + " - " + api.getRoute() +
                "\n\n\n\n\n");
        apiRepository.save(api);
        return "API created successfully 2";
    }

}