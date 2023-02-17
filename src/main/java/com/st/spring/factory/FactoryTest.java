package com.st.spring.factory;

import com.st.spring.beans.base.Student;
import com.st.spring.beans.base.Teacher;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;


/**
 * @ClassName FactoryTest
 * Description TODO
 * @Author 2456910384
 * @Date 2023/2/15 10:14
 * @Version 1.0
 */
public class FactoryTest {

    @Test
    public void  testBeanDefinition() {
        BeanDefinition definition = new RootBeanDefinition(Teacher.class);

        System.out.println(definition.getPropertyValues());
    }

    @Test
    public void testFactory() {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(factory);


        AnnotationConfigUtils.registerAnnotationConfigProcessors(factory,null);
        scanner.scan(Teacher.class.getPackage().getName());


        System.out.println(factory.getBean(Teacher.class).getStudent());
        System.out.println(factory.getBean(Student.class));

    }
}
