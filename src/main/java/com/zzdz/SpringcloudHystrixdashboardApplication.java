package com.zzdz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * HystrixDashboard
 *
 * url:http://localhost:20000/hystrix/
 *
 * provider:http://localhost/actuator/hystrix.stream
 * turbine: http://localhost:20001/turbine.stream
 */
@EnableHystrixDashboard
@SpringBootApplication
public class SpringcloudHystrixdashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHystrixdashboardApplication.class, args);
    }

}
