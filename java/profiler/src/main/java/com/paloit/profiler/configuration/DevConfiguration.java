package com.paloit.profiler.configuration;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevConfiguration extends EnvConfiguration {

    @Override
    public String getConfig() {
        return "dev";
    }
}
