package com.zz.service.impl;

import com.zz.dao.ShopOrderMapper;
import com.zz.entity.ShopOrder;
import com.zz.service.ShopOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ShopOrderServiceImpl implements ShopOrderService {
    @Resource
    ShopOrderMapper shopOrderMapper;

    @Override
    public void insert(ShopOrder shopOrder) {
        shopOrderMapper.insert(shopOrder);
    }
}
