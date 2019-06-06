package edu.gdut.auto.Service;


import edu.gdut.auto.pojo.ClassEntity;
import edu.gdut.auto.pojo.CollegeEntity;

import java.util.List;

public interface CollegeAndClassService {

    List<CollegeEntity> collegeList();

    List<ClassEntity> classList(Integer CollegeId);

    CollegeEntity addCollege(String collegeName);

    CollegeEntity getOneCollege(Integer collegeId);
}
