package cn.kang.service.impl;

import cn.kang.entity.Student;
import cn.kang.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentServiceImplTest {
    @Resource(name = "userService")
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Test
    public void testUpdate() {
        Student student = new Student();
        student.setId(1);
        student.setUsername("xiaoyingying");
        student.setAge(23);
        userService.update(student);
    }

    @Test
    public void testSave() {
        Student student = new Student();
        student.setUsername("kang");
        student.setAge(23);
        userService.save(student);
    }
}