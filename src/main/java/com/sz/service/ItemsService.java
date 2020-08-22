package com.sz.service;

import com.sz.entity.Items;

import java.util.List;

public interface ItemsService {

    List<Items> ByItemsAll(int id);

    List<Items> randItems(int id);
}
