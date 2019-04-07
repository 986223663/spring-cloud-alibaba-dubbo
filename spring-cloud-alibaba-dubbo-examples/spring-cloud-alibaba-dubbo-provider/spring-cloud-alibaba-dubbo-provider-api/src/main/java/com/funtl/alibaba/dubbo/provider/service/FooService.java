package com.funtl.alibaba.dubbo.provider.service;

import com.funtl.alibaba.dubbo.provider.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("provider")
public interface FooService {
    @GetMapping("/foo")
    String foo();
    @GetMapping("/user")
    User getUser();
}
