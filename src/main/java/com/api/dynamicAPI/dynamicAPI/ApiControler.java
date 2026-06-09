package com.api.dynamicAPI.dynamicAPI;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

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
}