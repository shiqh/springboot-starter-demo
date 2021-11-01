package cn.shiqh.springboot.starter.config;

import cn.shiqh.springboot.starter.EnableDemoConfiguration;
import cn.shiqh.springboot.starter.bean.StartDemoSource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shiqianghai
 * @date 2021/11/1 21:32
 */
@Configuration
@ConditionalOnBean(annotation = EnableDemoConfiguration.class)
@EnableConfigurationProperties(StarterDemoProperties.class)
public class StarterDemoAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public StartDemoSource startDemoSource() {
        return new StartDemoSource();
    }
}