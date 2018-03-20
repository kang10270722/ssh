package cn.kang.dao.impl;

import cn.kang.entity.Student;
import cn.kang.dao.UserDao;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    @Override
    public void update(Student student) {
        this.getHibernateTemplate().update(student);
    }

    @Override
    public void save(Student student) {
        this.getHibernateTemplate().save(student);
    }
}
