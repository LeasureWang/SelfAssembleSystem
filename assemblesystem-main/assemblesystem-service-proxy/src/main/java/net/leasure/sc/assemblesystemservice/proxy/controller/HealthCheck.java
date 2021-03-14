package net.leasure.sc.assemblesystemservice.proxy.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck implements net.leasure.sc.assemblesystem.apis.proxy.HealthCheck {

    @Override
    public String echo() {
        return "SUCCESS";
    }
}
