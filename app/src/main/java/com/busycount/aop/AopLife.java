package com.busycount.aop;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Aop Life
 * <p>
 * 2018/12/11 | Count.C | Created
 */
@Aspect
public class AopLife {

    @Before("execution(* android.support.v4.app.FragmentActivity.on*(..))")
    public void onActivityLife(JoinPoint joinPoint) {
        L.d("AopLife " + joinPoint.getSignature().getName());
    }
}
