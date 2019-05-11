package com.zz.service.impl;

import com.zz.dao.ShopRecordMapper;
import com.zz.entity.ShopRecord;
import com.zz.service.ShopRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ShopRecordServiceImpl implements ShopRecordService {
    @Resource
    ShopRecordMapper shopRecordMapper;

    @Override
    public void insert(ShopRecord shopRecord) {
        shopRecordMapper.insert(shopRecord);
    }
}
