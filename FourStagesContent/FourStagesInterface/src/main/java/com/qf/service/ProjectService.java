package com.qf.service;

import com.qf.dto.UserProject;
import com.qf.pojo.Project;

import java.util.List;

public interface ProjectService {
    List<Project> selectByExamplea();
    List<Project> selectBySong();
    List<Project> selectByZhan();
    Project selectByPrimaryKey(Integer projectid);
}
