package cn.shiqh.springboot.starter.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author shiqianghai
 * @date 2021/11/1 21:20
 */
@Data
@ToString
@ConfigurationProperties(prefix = "starter.demo")
public class StarterDemoProperties {

    private String name;

    private String url;
}