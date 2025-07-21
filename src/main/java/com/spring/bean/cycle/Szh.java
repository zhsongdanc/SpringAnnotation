package com.spring.bean.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @author demussong
 * @describe
 * @date 2025/7/22 00:01
 */
@Component
//@Conditional({Zyy.class})
public class Szh {
    @Autowired
    private Demus demus;
}
