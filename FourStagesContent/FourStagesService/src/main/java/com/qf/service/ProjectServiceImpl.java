package com.qf.service;

import com.qf.dao.ProjectMapper;
import com.qf.dto.UserProject;
import com.qf.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectMapper projectMapper;

//    public List<Project> selectByExample( ) {
//        return projectMapper.selectByExamplea();
//    }

    public List<Project> selectByExamplea() {
        return projectMapper.selectByExamplea();
    }

    public List<Project> selectBySong() {
        return projectMapper.selectBySong();
    }

    public List<Project> selectByZhan() {
        return projectMapper.selectByZhan();
    }

    public Project selectByPrimaryKey(Integer projectid) {
        return projectMapper.selectByPrimaryKey(projectid);
    }
}
