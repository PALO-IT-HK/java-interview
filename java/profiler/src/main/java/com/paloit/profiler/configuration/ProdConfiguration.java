package com.paloit.profiler.configuration;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdConfiguration extends EnvConfiguration {

    @Override
    public String getConfig() {
        return "PROD";
    }
}
