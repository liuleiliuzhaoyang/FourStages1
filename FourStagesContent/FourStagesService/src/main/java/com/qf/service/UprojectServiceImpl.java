package com.qf.service;

import com.qf.dao.UprojectMapper;
import com.qf.dto.Uproject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UprojectServiceImpl implements UprojectService {
    @Autowired
    UprojectMapper uprojectMapper;
    public Boolean insertUpro(Uproject uproject) {
        return uprojectMapper.insertUpro(uproject);
    }
}
