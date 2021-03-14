package net.leasure.sc.assemblesystem.apis.proxy;

import org.springframework.web.bind.annotation.GetMapping;

public interface HealthCheck {

    @GetMapping("/echo")
    String echo();
}
