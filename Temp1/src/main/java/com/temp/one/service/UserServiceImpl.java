package com.temp.one.service;

import com.temp.one.dao.UserMapper;
import com.temp.one.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhd
 * @Transactional中的的属性 propagation :事务的传播行为 isolation :事务的隔离级别 readOnly :只读
 *                     rollbackFor :发生哪些异常回滚 noRollbackFor :发生哪些异常不回滚
 *                     rollbackForClassName 根据异常类名回滚
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ, rollbackFor = RuntimeException.class)
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean addUser(User user) {
        userMapper.add(user);
        return true;
    }

    @Override
    public User selectUser(int age) {
        return userMapper.findUserByAge(age);
    }
}
