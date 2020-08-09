package com.lsm.scc.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RefreshScope注解加在需要动态读取配置的类或方法上
@RefreshScope
public class ConfigController {

    @Value("${data.env}")
    private String env;
    @Value("${data.user.username}")
    private String username;
    @Value("${data.user.password}")
    private String password;

    @GetMapping(value = "getConfig")
    public String getConfig() {
        return env + "," + username + "," + password;
    }

}
