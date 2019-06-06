package edu.gdut.auto.mappers;

import edu.gdut.auto.pojo.EvaluationAll;

public interface EvaluationAllMapper {
    int deleteByPrimaryKey(Integer evaluationId);

    int insert(EvaluationAll record);

    int insertSelective(EvaluationAll record);

    EvaluationAll selectByPrimaryKey(Integer evaluationId);

    int updateByPrimaryKeySelective(EvaluationAll record);

    int updateByPrimaryKey(EvaluationAll record);
}