package com.paloit.profiler.service;

import com.paloit.profiler.configuration.EnvConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestServiceImpl implements RestService {

    EnvConfiguration envConfiguration;

    @Autowired
    public RestServiceImpl(EnvConfiguration envConfiguration) {
        this.envConfiguration = envConfiguration;
    }

    @Override
    public String getConfig() {
        return envConfiguration.getConfig();
    }
}
