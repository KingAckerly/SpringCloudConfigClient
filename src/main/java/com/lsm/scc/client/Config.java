package com.lsm.scc.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Config {
    @Value("${data.env}")
    public String env;
    @Value("${data.user.username}")
    public String username;
    @Value("${data.user.password}")
    public String password;
}
