package com.zz.dto;

import com.zz.entity.ShopRecord;
import lombok.Data;

import java.util.List;
@Data
public class Shopdto {

    private String shopOrderCode;

    private String shopOrderRemarks;

    private String shopOrderUser;

    private String shopOrderTotalprice;

    private String shopOrderStatus;

    private String shopOrderName;

    private String shopOrderCompanyid;

    private String shopOrderUserCard;

    private List<ShopRecord> shopRecordList;
}
