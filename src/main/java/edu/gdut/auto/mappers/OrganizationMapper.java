package edu.gdut.auto.mappers;

import edu.gdut.auto.pojo.Organization;

public interface OrganizationMapper {
    int deleteByPrimaryKey(Integer orgId);

    int insert(Organization record);

    int insertSelective(Organization record);

    Organization selectByPrimaryKey(Integer orgId);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKeyWithBLOBs(Organization record);

    int updateByPrimaryKey(Organization record);
}