package com.lin.aop.annotation;

import com.lin.aop.aspect.MarkLogAspect;
import com.lin.aop.configuration.AutoLogConfig;
import com.lin.aop.handler.CommonLogJoinPointHandler;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 开启 @Log 注解对应的日志切面
 *
 * @author dadiyang
 * @since 2019/3/1
 */
@Documented
@EnableSerializer
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Import({AutoLogConfig.class, CommonLogJoinPointHandler.class, MarkLogAspect.class})
public @interface EnableMarkLog {
}
