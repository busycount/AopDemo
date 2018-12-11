package com.busycount.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Aop Click
 * <p>
 * 2018/12/11 | Count.C | Created
 */
@Aspect
public class AopClick {

//  DoubleClick无效
//    @Before("@annotation(com.busycount.aop.DoubleClick))")
//    public void enableDoubleClick(JoinPoint joinPoint) {
//    }

    @Pointcut("execution(* android.view.View.OnClickListener.onClick(..))")
    public void disablePointcut() {
    }

    //ButterKnife 植入不了
//    @Pointcut("execution(* butterknife.internal.DebouncingOnClickListener.doClick(..)")
//    public void disableButterKnife() {
//    }

    @Around("disablePointcut()")
    public void disableDoubleClick(ProceedingJoinPoint joinPoint) throws Throwable {
        if (DoubleClickUtil.notDoubleClick()) {
            joinPoint.proceed();
        }
    }


}
