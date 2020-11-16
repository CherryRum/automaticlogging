package com.lin.aop.annotation;


import com.lin.aop.aspect.HttpApiInvokerLogAspect;
import com.lin.aop.configuration.AutoLogConfig;
import com.lin.aop.handler.CommonLogJoinPointHandler;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 开启基于 http-api-invoker 框架的接口日志
 *
 * @author dadiyang
 * @since 2020/3/1
 */
@Documented
@EnableSerializer
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({CommonLogJoinPointHandler.class, HttpApiInvokerLogAspect.class, AutoLogConfig.class})
public @interface EnableHttpApiInvokerLog {
}
