package com.lin.aop.listener;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 提供静态获取 LogTraceListener 的方法
 *
 * @author dadiyang
 * @since 2019/3/1
 */
public class ListenerHolder {
    private static Set<LogTraceListener> listeners = new CopyOnWriteArraySet<>();
    private static com.github.dadiyang.autologging.core.listener.KafkaLogTraceListener kafkaLogTraceListener;

    public static Set<LogTraceListener> getListeners() {
        return listeners;
    }

    public static void addListener(LogTraceListener listener) {
        if (listener instanceof com.github.dadiyang.autologging.core.listener.KafkaLogTraceListener) {
            kafkaLogTraceListener = (com.github.dadiyang.autologging.core.listener.KafkaLogTraceListener) listener;
        }
        listeners.add(listener);
    }

    public static void removeListener(LogTraceListener listener) {
        listeners.remove(listener);
    }

    public static com.github.dadiyang.autologging.core.listener.KafkaLogTraceListener getKafkaLogTraceListener() {
        return kafkaLogTraceListener;
    }

    public static void clear() {
        listeners.clear();
    }
}
