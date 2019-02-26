package com.paloit.profiler.controller;

import com.paloit.profiler.configuration.EnvConfiguration;
import com.paloit.profiler.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/profiles")
public class RestController {

    RestService restService;

    @Autowired
    public RestController(RestService restService) {
        this.restService = restService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    String getProfiles() {
        return restService.getConfig();
    }
}
