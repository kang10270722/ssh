package cn.kang.service.impl;

import cn.kang.dao.UserDao;
import cn.kang.entity.Student;
import cn.kang.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void update(Student student) {
        userDao.update(student);
    }

    @Override
    public void save(Student student) {
        userDao.save(student);
    }
}
