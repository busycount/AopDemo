package com.busycount.aop;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.lang.reflect.Method;

/**
 * Aop Status
 * <p>
 * 2018/12/11 | Count.C | Created
 */
@Aspect
public class AopStatus {
// call execution
//    @Around("@annotation(com.busycount.aop.CheckStatus)")

    @Pointcut("execution(@com.busycount.aop.CheckStatus * *(..))")
    public void checkPointcut() {
    }

    @Around("checkPointcut()")
    public void checkStatus(ProceedingJoinPoint joinPoint) throws Throwable {
        L.d("check  " + AopUtil.isAnnotationPresent(joinPoint,CheckStatus.class));
        Signature signature = joinPoint.getSignature();
        L.d("check before " + signature.getName());
        joinPoint.proceed();
        L.d("check after " + signature.getName());
    }

}
