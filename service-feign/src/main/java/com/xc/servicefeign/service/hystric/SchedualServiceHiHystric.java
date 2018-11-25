package com.xc.servicefeign.service.hystric;

import com.xc.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author xucong
 * @date 2018/11/22
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
