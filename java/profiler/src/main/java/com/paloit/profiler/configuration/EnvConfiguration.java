package com.paloit.profiler.configuration;

import org.springframework.stereotype.Component;

@Component
public abstract class EnvConfiguration {

    public abstract String getConfig();
}
