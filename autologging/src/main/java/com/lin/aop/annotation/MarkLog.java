package com.lin.aop.annotation;

import java.lang.annotation.*;

/**
 * @program: lin
 * @description: 开启类中所有方法或者方法的日志功能
 * @author: lin
 * @create: 2020-11-14 22:40
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface MarkLog {
}
