package com.lsm.scc.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    private Config config;

    @GetMapping(value = "getConfig")
    public Config getConfig() {
        return config;
    }
}
