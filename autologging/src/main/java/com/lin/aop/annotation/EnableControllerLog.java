package com.lin.aop.annotation;

import com.lin.aop.aspect.SpringMvcControllerLogAspect;
import com.lin.aop.configuration.AutoLogConfig;
import com.lin.aop.handler.ControllerLogJoinPointHandler;
import com.lin.aop.handler.DefaultRequestContextProvider;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @program: lin
 * @description: 开启controller层日志
 * @author: lin
 * @create: 2020-11-14 22:44
 */
@Documented
@EnableSerializer
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({AutoLogConfig.class, DefaultRequestContextProvider.class,
       ControllerLogJoinPointHandler.class, SpringMvcControllerLogAspect.class})
public @interface EnableControllerLog {
}