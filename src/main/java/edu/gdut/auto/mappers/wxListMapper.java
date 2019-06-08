package edu.gdut.auto.mappers;

import edu.gdut.auto.pojo.wxList;

public interface wxListMapper {
    int deleteByPrimaryKey(Long stuId);

    int insert(wxList record);

    int insertSelective(wxList record);

    wxList selectByPrimaryKey(Long stuId);

    int updateByPrimaryKeySelective(wxList record);

    int updateByPrimaryKey(wxList record);
}