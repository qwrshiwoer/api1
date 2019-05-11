package com.zz.entity;

public class ShopOrder {
    private String shopOrderId;

    private String shopOrderCode;

    private String shopOrderRemarks;

    private String shopOrderUser;

    private String shopOrderTotalprice;

    private String shopOrderStatus;

    private String shopOrderName;

    private String shopOrderCompanyid;

    private String shopOrderUserCard;

    public String getShopOrderId() {
        return shopOrderId;
    }

    public void setShopOrderId(String shopOrderId) {
        this.shopOrderId = shopOrderId == null ? null : shopOrderId.trim();
    }

    public String getShopOrderCode() {
        return shopOrderCode;
    }

    public void setShopOrderCode(String shopOrderCode) {
        this.shopOrderCode = shopOrderCode == null ? null : shopOrderCode.trim();
    }

    public String getShopOrderRemarks() {
        return shopOrderRemarks;
    }

    public void setShopOrderRemarks(String shopOrderRemarks) {
        this.shopOrderRemarks = shopOrderRemarks == null ? null : shopOrderRemarks.trim();
    }

    public String getShopOrderUser() {
        return shopOrderUser;
    }

    public void setShopOrderUser(String shopOrderUser) {
        this.shopOrderUser = shopOrderUser == null ? null : shopOrderUser.trim();
    }

    public String getShopOrderTotalprice() {
        return shopOrderTotalprice;
    }

    public void setShopOrderTotalprice(String shopOrderTotalprice) {
        this.shopOrderTotalprice = shopOrderTotalprice == null ? null : shopOrderTotalprice.trim();
    }

    public String getShopOrderStatus() {
        return shopOrderStatus;
    }

    public void setShopOrderStatus(String shopOrderStatus) {
        this.shopOrderStatus = shopOrderStatus == null ? null : shopOrderStatus.trim();
    }

    public String getShopOrderName() {
        return shopOrderName;
    }

    public void setShopOrderName(String shopOrderName) {
        this.shopOrderName = shopOrderName == null ? null : shopOrderName.trim();
    }

    public String getShopOrderCompanyid() {
        return shopOrderCompanyid;
    }

    public void setShopOrderCompanyid(String shopOrderCompanyid) {
        this.shopOrderCompanyid = shopOrderCompanyid == null ? null : shopOrderCompanyid.trim();
    }

    public String getShopOrderUserCard() {
        return shopOrderUserCard;
    }

    public void setShopOrderUserCard(String shopOrderUserCard) {
        this.shopOrderUserCard = shopOrderUserCard == null ? null : shopOrderUserCard.trim();
    }
}