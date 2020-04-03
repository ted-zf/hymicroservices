package com.huayue.role;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 西安华越
 */
@EnableSwagger2
@SpringBootApplication
@EnableDiscoveryClient
public class RoleApplication {
    public static void main(String[]args){
        SpringApplication.run(RoleApplication.class,args);
    }
}
