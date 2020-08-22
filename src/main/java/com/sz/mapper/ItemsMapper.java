package com.sz.mapper;

import com.sz.entity.Items;
import com.sz.entity.ItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ItemsMapper extends Mapper<Items> {
    List<Items> randItems(int id);
}