package com.zhang.boot;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by zhanglijun on 17-3-27.
 */
@EnableZuulProxy
@SpringCloudApplication
public class GateWayApplication {
    public static void main(String[] args){
        new SpringApplicationBuilder(GateWayApplication.class).web(true).run(args);
    }
}
