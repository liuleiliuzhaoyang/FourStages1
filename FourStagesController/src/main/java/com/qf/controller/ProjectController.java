package com.qf.controller;

import com.qf.dto.UserProject;
import com.qf.pojo.Project;
import com.qf.pojo.Userinfo;
import com.qf.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @RequestMapping("sss")
    public List<Project> selectBy(){
        List<Project> list=projectService.selectByExamplea();
        return list;
    }
    @RequestMapping("ccc")
    public List<Project> selectBySong(){
        List<Project> list=projectService.selectBySong();
        return list;
    }
    @RequestMapping("bbb")
    public List<Project> selectByZhan(){
       List<Project> list= projectService.selectByZhan();
       return list;
    }
    @RequestMapping("ddd")
    public UserProject selectByPrimaryKey(@RequestParam Integer projectid,HttpSession session){

        Project project = projectService.selectByPrimaryKey(projectid);
        UserProject userProject = new UserProject();
        userProject.setProject(project);
        Userinfo userinfo=(Userinfo)session.getAttribute("userinfo");
        userProject.setUserinfo(userinfo);
        System.out.println(userProject+"===================");
       return userProject;
    }
}
