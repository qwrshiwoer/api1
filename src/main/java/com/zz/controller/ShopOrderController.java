package com.zz.controller;


import com.zz.dto.Shopdto;

import com.zz.entity.ShopOrder;
import com.zz.entity.ShopRecord;
import com.zz.service.ShopOrderService;
import com.zz.service.ShopRecordService;
import com.zz.util.KeyUtil;
import com.zz.vo.ResultVo;
import com.zz.vo.ShopVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/zz")

public class ShopOrderController {

    @Resource
    ShopOrderService shopOrderService;
    @Resource
    ShopRecordService shopRecordService;
/*
    @RequestMapping("new")
     public String ni(@RequestBody Shopdto shopdto){
        System.out.println(shopdto);
        ShopOrder shoporder = new ShopOrder();
        BeanUtils.copyProperties(shopdto,shoporder);
        shoporder.setShopOrderId(561556);
        shopOrderService.insert(shoporder);
        return "ni ";
*/
    @RequestMapping("test")
    public ResultVo res(@RequestBody Shopdto shopdto){
        ShopOrder shoporder = new ShopOrder();
        BeanUtils.copyProperties(shopdto,shoporder);
        String a=KeyUtil.genUniqueKey();
        shoporder.setShopOrderId(a);
        shopOrderService.insert(shoporder);


       List<ShopRecord>shopRecordList=shopdto.getShopRecordList();
       for (ShopRecord shopRecord:shopRecordList){
           shopRecord.setShopOrderId(a);
           shopRecordService.insert(shopRecord);
       }
        log.debug("debug测试日志消息");
        log.info("info 测试日志信息");
        log.error("info 测试日志信息");
        log.warn("warn 测试日志信息");
        ResultVo resultVo=new ResultVo();
        resultVo.setSuccess("true");
        resultVo.setErrorCode("-1");
        resultVo.setMsg("成功");
        ShopVo shopVo=new ShopVo();
        shopVo.setShopOrderId("1557061085629");
        resultVo.setBody(shopVo);

        return resultVo  ;

    }



}
