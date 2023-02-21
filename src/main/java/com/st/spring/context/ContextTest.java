package com.st.spring.context;

import com.st.spring.beans.base.Teacher;
import com.st.spring.beans.tx.User;
import com.st.spring.beans.tx.manager.UserManager;
import com.st.spring.beans.tx.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

    @Test
    public void testTx() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        UserManager manager = context.getBean(UserManager.class);

        System.out.println(manager.selectOne(1));


    }
}
