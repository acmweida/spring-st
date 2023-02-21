package com.st.spring.beans.tx.manager;

import com.st.spring.beans.tx.User;
import com.st.spring.beans.tx.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

@Component
public class UserManager {

    @Autowired
    private UserMapper userMapper;

    public User selectOne(int id) {
       return userMapper.selectOne(id);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public User selectOneTx(int id) {
        return userMapper.selectOne(id);
    }
}
