package com.qf.dto;

import com.qf.pojo.Project;
import com.qf.pojo.Userinfo;

import java.io.Serializable;

public class UserProject implements Serializable {
    private Userinfo userinfo;
    private Project project;

    public Userinfo getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(Userinfo userinfo) {
        this.userinfo = userinfo;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "UserProject{" +
                "userinfo=" + userinfo +
                ", project=" + project +
                '}';
    }
}
