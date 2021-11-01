package cn.shiqh.springboot.starter;

import java.lang.annotation.*;

/**
 * @author shiqianghai
 * @date 2021/11/1 21:17
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface EnableDemoConfiguration {
}