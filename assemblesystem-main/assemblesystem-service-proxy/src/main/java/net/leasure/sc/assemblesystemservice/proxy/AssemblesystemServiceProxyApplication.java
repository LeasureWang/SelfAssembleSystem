package net.leasure.sc.assemblesystemservice.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"net.leasure.sc"})
public class AssemblesystemServiceProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssemblesystemServiceProxyApplication.class, args);
    }

}
