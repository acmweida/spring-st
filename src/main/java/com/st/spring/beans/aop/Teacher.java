package com.st.spring.beans.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName Teacher
 * Description TODO
 * @Author 2456910384
 * @Date 2023/2/15 11:07
 * @Version 1.0
 */
@Component
public class Teacher {

    @Autowired
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void say() {
        System.out.println("i am Teacher!");
    }

}
