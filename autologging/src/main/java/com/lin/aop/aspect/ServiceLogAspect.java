package com.lin.aop.aspect;


import com.lin.aop.condition.ConditionalOnClass;
import com.lin.aop.util.ArgsUtils;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/**
 * 监控所有带有 Service 注解的 Bean
 *
 * @author dadiyang
 * @since 2020/3/1
 */
@Aspect
@RequiredArgsConstructor
@ConditionalOnClass(name = "org.springframework.stereotype.Service")
public class ServiceLogAspect extends AbstractCommonLogAspect {
    private static final String SERVICE = "Service";

    /**
     * 切所有带有 Service 注解的类
     */
    @Override
    @Pointcut("@within(org.springframework.stereotype.Service)")
    public void pointcut() {
    }

    @Override
    public String getAspectName() {
        return SERVICE;
    }

    @Override
    protected String getActualClassName(Class<?> clazz) {
        return ArgsUtils.getActualClassName(clazz, Service.class);
    }
}
