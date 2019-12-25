package com.konglei;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="springcloud-client")
public interface TestService {
    @RequestMapping("/test")
    public String testLoadBalance();
}
