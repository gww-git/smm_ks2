package com.sz.service.impl;

import com.sz.entity.Items;
import com.sz.entity.ItemsExample;
import com.sz.mapper.ItemsMapper;
import com.sz.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceimpl implements ItemsService {


    @Autowired
    private ItemsMapper itemsMapper;


    @Override
    public List<Items> ByItemsAll(int id) {
        ItemsExample itemsExample=new ItemsExample();
        itemsExample.createCriteria()
                .andEpaperidEqualTo(id);
        return itemsMapper.selectByExample(itemsExample);
    }
}
