package com.lin.aop.serializer;

import com.alibaba.fastjson.JSON;
import com.lin.aop.condition.ConditionalOnClass;
import com.lin.aop.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

/**
 * 基于 FastJson 的序列化器，仅在类路径中有 fastjson 且没有其他 Json 序列化器时使用
 * <p>
 * 默认首选的序列化器
 *
 * @author dadiyang
 * @since 2019/3/1
 */
@Component
@ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
@ConditionalOnMissingBean(JsonSerializer.class)
public class FastJsonSerializer implements JsonSerializer{
    @Override
    public String serialize(Object object) {
        if (object == null) {
            return "";
        }
        return JSON.toJSONString(object);
    }

}
