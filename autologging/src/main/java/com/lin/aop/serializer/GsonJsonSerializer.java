package com.lin.aop.serializer;


import com.google.gson.Gson;
import com.lin.aop.condition.ConditionalOnClass;
import com.lin.aop.condition.ConditionalOnMissingBean;

/**
 * 基于 gson 的 json 序列化器，仅在类路径中有 Gson 并且没有注册其他的 json 序列化器时使用
 *
 * @author dadiyang
 * @since 2019/3/1
 */
@ConditionalOnMissingBean(JsonSerializer.class)
@ConditionalOnClass(name = "com.google.gson.Gson")
public class GsonJsonSerializer implements JsonSerializer {
    private static final Gson GSON = new Gson();

    @Override
    public String serialize(Object object) {
        return GSON.toJson(object);
    }

}
