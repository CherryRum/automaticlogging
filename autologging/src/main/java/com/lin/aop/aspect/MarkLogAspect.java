package com.lin.aop.aspect;


import com.lin.aop.annotation.MarkLog;
import com.lin.aop.util.ArgsUtils;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 切所有的包含 @Log 的类
 *
 * @author dadiyang
 * @since 2019/3/1
 */
@Aspect
public class MarkLogAspect extends AbstractCommonLogAspect {
    private static final String MARK_LOG = "MarkLog";

    @Override
    @Pointcut("@within(com.lin.aop.annotation.MarkLog) || @annotation(com.lin.aop.annotation.MarkLog)")
    public void pointcut() {

    }

    @Override
    public String getAspectName() {
        return MARK_LOG;
    }

    @Override
    protected String getActualClassName(Class<?> clazz) {
        return ArgsUtils.getActualClassName(clazz, MarkLog.class);
    }
}
