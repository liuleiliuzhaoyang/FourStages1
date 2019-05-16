package com.qf.controller;

import com.qf.pojo.Uproject;
import com.qf.service.UprojectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        uproject.setProinfostate("已中标");
        uproject.setProinfoinfo("债权转让");
        Date sb=new Date();
        uproject.setProinfofabiaodate(sb);
        uproject.setProinfochujiedate(sb);
        uproject.setProinfohuankuantype("网上转账");
        uproject.setProinfohetong("债权合同签订");
        System.out.println(uproject+"================");
        return uprojectService.insertUpro(uproject);
    }
}
