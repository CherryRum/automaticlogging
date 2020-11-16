package com.lin.aop.annotation;

import java.lang.annotation.*;

/**
 * @program: lin
 * @description: 标记不需要打印日志的类或方法
 * @author: lin
 * @create: 2020-11-14 22:30
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
public @interface IgnoreLog {
}