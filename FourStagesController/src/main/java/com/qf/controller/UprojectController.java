package com.qf.controller;

import com.qf.dto.Uproject;
import com.qf.service.UprojectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
public class UprojectController {
    @Autowired
    UprojectService uprojectService;
    @RequestMapping("upp")
    public Boolean insertUpro(@RequestBody Uproject uproject){
        Random random=new Random();
        int ss=(int)(random.nextDouble()*(999999-100000+1))+100000;
        uproject.setProinfolsnumber(ss);
        uproject.setProinfoinfo("已中标");
        Date sb=new Date();
        uproject.setProinfofabiaodate(sb);
        uproject.setProinfohuankuantype("网上转账");

        return uprojectService.insertUpro(uproject);
    }
}
