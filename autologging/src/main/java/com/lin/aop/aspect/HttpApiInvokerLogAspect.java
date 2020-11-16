package com.lin.aop.aspect;


import com.lin.aop.annotation.HttpApi;
import com.lin.aop.condition.ConditionalOnClass;
import com.lin.aop.util.ArgsUtils;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 切所有的 http-api-invoker 代理的接口，即所有打了 @HttpApi 注解的类
 *
 * @author dadiyang
 * @since 2020/3/1
 */
@Aspect
@ConditionalOnClass(name = "com.lin.aop.annotation.HttpApi")
public class HttpApiInvokerLogAspect extends AbstractCommonLogAspect {
    private static final String HTTP_API = "HttpApi";

    @Override
    @Pointcut("@within(com.github.dadiyang.httpinvoker.annotation.HttpApi)")
    public void pointcut() {

    }

    @Override
    protected String getAspectName() {
        return HTTP_API;
    }

    @Override
    protected String getActualClassName(Class<?> clazz) {
        return ArgsUtils.getActualClassName(clazz, HttpApi.class);
    }
}
