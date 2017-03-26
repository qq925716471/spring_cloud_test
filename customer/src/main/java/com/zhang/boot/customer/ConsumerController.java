package com.zhang.boot.customer;

import com.zhang.boot.customer.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Created by zhanglijun on 17-3-25.
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    ComputeService computeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
    }

    @RequestMapping(value = "/add2", method = RequestMethod.GET)
    public String add2() {
        return computeService.addService();
    }

}
