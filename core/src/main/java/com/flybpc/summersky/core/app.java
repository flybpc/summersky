package com.flybpc.summersky.core;

/**
 * Created by WenJie on 2017/1/7.
 */
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableEurekaServer
@SpringBootApplication
public class app {

    public static void main(String[] args) {
        new SpringApplicationBuilder(app.class).web(true).run(args);
    }

}
