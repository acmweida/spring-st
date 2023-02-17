package com.st.spring.context;

import com.st.spring.beans.base.Teacher;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName ContextTest
 * Description TODO
 * @Author 2456910384
 * @Date 2023/2/15 14:03
 * @Version 1.0
 */
public class ContextTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();

        context.scan(Teacher.class.getPackage().getName());

        context.refresh();

        System.out.println(context.getBean(Teacher.class).getStudent());

    }



    @Test
    public void testAop() {
        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();

        context.scan(com.st.spring.beans.aop.Teacher.class.getPackage().getName());

        context.refresh();

        System.out.println(context.getBean(com.st.spring.beans.aop.Teacher.class));
        context.getBean(com.st.spring.beans.aop.Teacher.class).say();
        context.getBean(com.st.spring.beans.aop.Student.class).say();

    }
}
