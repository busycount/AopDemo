package com.busycount.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * AopUtil
 * <p>
 * 2018/12/11 | Count.C | Created
 */
public class AopUtil {

    public static boolean isAnnotationPresent(JoinPoint joinPoint, Class<? extends Annotation> annotationType) {
        Object[] args = joinPoint.getArgs();
        Class<?>[] argTypes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            argTypes[i] = args[i].getClass();
        }
        boolean isExit = false;
        try {
            Method method = joinPoint.getTarget().getClass().getDeclaredMethod(joinPoint.getSignature().getName(), argTypes);
            isExit = method.isAnnotationPresent(annotationType);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return isExit;
    }
}
