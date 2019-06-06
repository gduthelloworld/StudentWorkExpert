package edu.gdut.auto.mappers;

import edu.gdut.auto.pojo.EvaluationDetail;

public interface EvaluationDetailMapper {
    int deleteByPrimaryKey(Long ceId);

    int insert(EvaluationDetail record);

    int insertSelective(EvaluationDetail record);

    EvaluationDetail selectByPrimaryKey(Long ceId);

    int updateByPrimaryKeySelective(EvaluationDetail record);

    int updateByPrimaryKey(EvaluationDetail record);
}