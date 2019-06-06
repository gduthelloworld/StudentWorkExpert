package edu.gdut.auto.mappers;

import edu.gdut.auto.pojo.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Long stuId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long stuId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    /**
     * 模糊查询学号
     * @param StuId
     * @return
     */
    List<Student> selectByStuId(Long StuId);

    /**
     * 模糊查询名字
     * @param StuName
     * @return
     */
    List<Student> selectByStuName(String StuName);

}