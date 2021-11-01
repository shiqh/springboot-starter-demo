package cn.shiqh.springboot.starter.bean;

import cn.shiqh.springboot.starter.config.StarterDemoProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author shiqianghai
 * @date 2021/11/1 21:27
 */
public class StartDemoSource {

    @Autowired
    private StarterDemoProperties starterDemoProperties;

    public String test() {
        return starterDemoProperties.toString();
    }
}