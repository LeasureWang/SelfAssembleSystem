package net.leasure.sc.assemblesystemservice.producer.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck implements net.leasure.sc.assemblesystem.apis.producer.HealthCheck {

    @Override
    public String echo() {
        return "SUCCESS";
    }
}
