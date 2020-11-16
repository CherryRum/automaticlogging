package com.lin.aop.annotation;

import java.lang.annotation.*;

/**
 * @program: autologging-aop-jvm-sandbox
 * @description: 表示该接口是http接口
 * @author: lin
 * @create: 2020-11-15 22:27
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface HttpApi {
    /**
     * when  {@link #prefix} is empty, this value will be used
     *
     * @return the same as prefix
     */
    String value() default "";

    /**
     * @return the prefix
     */
    String prefix() default "";
}
