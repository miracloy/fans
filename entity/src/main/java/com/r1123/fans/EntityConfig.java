package com.r1123.fans;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by helloqdz on 2018/11/1.
 */
@EntityScan(basePackages = "com.r1123.fans.entity")
@Configuration
public class EntityConfig {
}
