package com.qf.dao;

import java.util.List;

import com.qf.dto.UserProject;
import com.qf.pojo.Project;
import com.qf.pojo.ProjectExample;
import org.apache.ibatis.annotations.Param;

public interface ProjectMapper {
    int countByExample(ProjectExample example);

    int deleteByExample(ProjectExample example);

    int deleteByPrimaryKey(Integer projectid);

    int insert(Project record);

    int insertSelective(Project record);

    List<Project> selectByExample(ProjectExample example);
    List<Project> selectByExamplea();
    List<Project> selectByZhan();
    List<Project> selectBySong();

    Project selectByPrimaryKey(Integer projectid);

    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}