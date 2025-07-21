package com.spring.bean.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author demussong
 * @describe
 * @date 2025/7/22 00:01
 */
@Component
public class Demus {
    @Autowired
    private Szh szh;
}
