package edu.gdut.auto.Service.ServiceImpl;

import edu.gdut.auto.Exception.MyException;
import edu.gdut.auto.Result.ResultEnum;
import edu.gdut.auto.Service.CollegeAndClassService;
import edu.gdut.auto.mappers.ClassEntityMapper;
import edu.gdut.auto.mappers.CollegeEntityMapper;
import edu.gdut.auto.pojo.ClassEntity;
import edu.gdut.auto.pojo.CollegeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CollegeAndClassServiceImpl implements CollegeAndClassService {

    @Autowired
    CollegeEntityMapper collegeEntityMapper;
    @Autowired
    ClassEntityMapper classEntityMapper;


    @Override
    public List<CollegeEntity> collegeList(){
        return collegeEntityMapper.selectAll();
    }

    @Override
    public List<ClassEntity> classList(Integer CollegeId){
        return  classEntityMapper.selectByCollegeId(CollegeId);
    }

    @Override
    public  CollegeEntity addCollege(String collegeName){
        String name=collegeName.trim();
        if(name!=""&&name.length()<50){
            CollegeEntity collegeEntity=new CollegeEntity();
            collegeEntity.setCollegeName(name);
            collegeEntity.setCollegeClassNum((byte) 0);
            collegeEntity.setCollegeState(CollegeEntity.College_Normal);
           if(collegeEntityMapper.insertSelective(collegeEntity)==1){
                return collegeEntity;
            }
           throw new MyException(ResultEnum.DateBase_Insert_Error);
        }
        throw new MyException(ResultEnum.REQUEST_PARAMETER_ERROR);

    }
    @Override
    public CollegeEntity getOneCollege(Integer collegeId){
        if(collegeId!=null){
            return  collegeEntityMapper.selectByPrimaryKey(collegeId);
        }
        throw new MyException(ResultEnum.REQUEST_PARAMETER_ERROR);
    }


}
