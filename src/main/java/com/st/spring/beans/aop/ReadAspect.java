package com.st.spring.beans.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class ReadAspect {

    @Before("execution(* com.st.spring.beans.aop.*.say(..))")
    public void read() {
        System.out.println("i an read");
    }
}
