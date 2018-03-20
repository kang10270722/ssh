package cn.kang.dao;

import cn.kang.entity.Student;

public interface UserDao {

    void update(Student student);

    void save(Student student);
}
