package edu.gdut.auto.Service.ServiceImpl;


import edu.gdut.auto.Service.StudentService;
import edu.gdut.auto.Uitls.MathUtils;
import edu.gdut.auto.mappers.StudentMapper;
import edu.gdut.auto.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> findStudent(String search){
        if(MathUtils.isNumeric(search)){
            //学号模糊查找
            return studentMapper.selectByStuId(Long.valueOf(search));
        }else{
            //姓名模糊查找
            return studentMapper.selectByStuName(search.trim());
        }
    }
}
