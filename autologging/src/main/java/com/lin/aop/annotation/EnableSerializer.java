package com.lin.aop.annotation;


import com.lin.aop.serializer.FastJsonSerializer;
import com.lin.aop.serializer.GsonJsonSerializer;
import com.lin.aop.serializer.JacksonJsonSerializer;
import com.lin.aop.serializer.ToStringSerializer;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 注册序列化器
 *
 * @author dadiyang
 * @since 2019/3/1
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({FastJsonSerializer.class, JacksonJsonSerializer.class, GsonJsonSerializer.class, ToStringSerializer.class})
public @interface EnableSerializer {
}
