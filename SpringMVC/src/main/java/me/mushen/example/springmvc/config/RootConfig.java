package me.mushen.example.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Desc
 * @Author Remilia
 * @Create 2017-07-27
 */
@Configuration
@ComponentScan(
        basePackages = {
            "me.mushen.example.springmvc"
        },
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)}
)
public class RootConfig {
}
