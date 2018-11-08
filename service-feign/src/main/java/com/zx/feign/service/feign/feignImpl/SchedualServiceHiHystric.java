package com.zx.feign.service.feign.feignImpl;

import com.zx.feign.service.feign.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClienOne(String name) {
        return "sorry,"+name;
    }
}
