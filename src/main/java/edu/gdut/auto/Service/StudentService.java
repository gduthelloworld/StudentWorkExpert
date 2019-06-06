package edu.gdut.auto.Service;

import edu.gdut.auto.pojo.Student;

import java.util.List;

public interface StudentService {

    List<Student> findStudent(String search);

    String getStudentPic(String stuId);

}
