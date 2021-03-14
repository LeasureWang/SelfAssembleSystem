package net.leasure.sc.assemblesystemservice.consumer.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck implements net.leasure.sc.assemblesystem.apis.consumer.HealthCheck {

    @Override
    public String echo() {
        return "SUCCESS";
    }
}
