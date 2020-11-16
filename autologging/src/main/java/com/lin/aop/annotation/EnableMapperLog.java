package com.lin.aop.annotation;


import com.lin.aop.aspect.MapperLogAspect;
import com.lin.aop.configuration.AutoLogConfig;
import com.lin.aop.handler.CommonLogJoinPointHandler;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 开启 Mapper 切面
 *
 * @author dadiyang
 * @since 2020/3/1
 */
@Documented
@EnableSerializer
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({AutoLogConfig.class, CommonLogJoinPointHandler.class, MapperLogAspect.class})
public @interface EnableMapperLog {
}
