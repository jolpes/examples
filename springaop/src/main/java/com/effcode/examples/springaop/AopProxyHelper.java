package com.effcode.examples.springaop;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.util.ClassUtils;

public class AopProxyHelper {

    public static <T> T getProxy(T target, Object... aspects) {
        assert aspects != null;
        AspectJProxyFactory factory = new AspectJProxyFactory();
        factory.setTarget(target);
        factory.setProxyTargetClass(true);
        for (Object aspect : aspects) {
            factory.addAspect(aspect);
        }
        for (Class<?> iface : ClassUtils.getAllInterfacesAsSet(target)) {
            factory.addInterface(iface);
        }
        return factory.getProxy();
    }
}
