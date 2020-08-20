package com.sz.service.impl;

import com.sz.entity.Papers;
import com.sz.mapper.PapersMapper;
import com.sz.service.IPapersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PapersServiceimpl implements IPapersService{

    @Autowired
    PapersMapper papersMapper;

    @Override
    public List<Papers> ByPapersAll() {
        return papersMapper.selectAll();
    }
}
