package edu.gdut.auto.Service;

import edu.gdut.auto.StudentWorkExpertApplicationTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StudentWorkExpertApplicationTests.class)
public class StudentServiceTest {


    @Autowired
    StudentService studentService;

    @Test
    public void findStudent() {
        //StudentServiceImpl studentService=new StudentServiceImpl();
        studentService.findStudent("江");
        System.out.println("55");
    }

}