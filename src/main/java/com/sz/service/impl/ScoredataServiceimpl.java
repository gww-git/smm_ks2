package com.sz.service.impl;

import com.sz.entity.Scoredata;
import com.sz.entity.ScoredataExample;
import com.sz.mapper.ScoredataMapper;
import com.sz.service.IScoredataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoredataServiceimpl implements IScoredataService{

    @Autowired
    private ScoredataMapper scoredataMapper;


    @Override
    public int ByInsertList(Scoredata scoredata) {
        return scoredataMapper.insert(scoredata);
    }
}
