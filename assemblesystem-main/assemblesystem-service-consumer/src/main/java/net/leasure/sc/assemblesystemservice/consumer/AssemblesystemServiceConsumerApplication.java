package net.leasure.sc.assemblesystemservice.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"net.leasure.sc"})
public class AssemblesystemServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssemblesystemServiceConsumerApplication.class, args);
    }
}
