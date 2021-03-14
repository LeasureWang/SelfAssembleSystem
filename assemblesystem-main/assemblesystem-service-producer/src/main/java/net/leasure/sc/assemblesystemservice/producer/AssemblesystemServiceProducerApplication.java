package net.leasure.sc.assemblesystemservice.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"net.leasure.sc"})
public class AssemblesystemServiceProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssemblesystemServiceProducerApplication.class, args);
    }

}
