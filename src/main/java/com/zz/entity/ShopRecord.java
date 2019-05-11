package com.zz.entity;

public class ShopRecord {
    private String shopRecordSparesId;

    private String shopRecordPrice;

    private String shopRecordNumber;

    private String shopRecordUnit;

    private String shopRecordDiscount;

    private String mealId;

    private String shopRecordActualprice;

    private String shopOrderId;

    public String getShopRecordSparesId() {
        return shopRecordSparesId;
    }

    public void setShopRecordSparesId(String shopRecordSparesId) {
        this.shopRecordSparesId = shopRecordSparesId == null ? null : shopRecordSparesId.trim();
    }

    public String getShopRecordPrice() {
        return shopRecordPrice;
    }

    public void setShopRecordPrice(String shopRecordPrice) {
        this.shopRecordPrice = shopRecordPrice == null ? null : shopRecordPrice.trim();
    }

    public String getShopRecordNumber() {
        return shopRecordNumber;
    }

    public void setShopRecordNumber(String shopRecordNumber) {
        this.shopRecordNumber = shopRecordNumber == null ? null : shopRecordNumber.trim();
    }

    public String getShopRecordUnit() {
        return shopRecordUnit;
    }

    public void setShopRecordUnit(String shopRecordUnit) {
        this.shopRecordUnit = shopRecordUnit == null ? null : shopRecordUnit.trim();
    }

    public String getShopRecordDiscount() {
        return shopRecordDiscount;
    }

    public void setShopRecordDiscount(String shopRecordDiscount) {
        this.shopRecordDiscount = shopRecordDiscount == null ? null : shopRecordDiscount.trim();
    }

    public String getMealId() {
        return mealId;
    }

    public void setMealId(String mealId) {
        this.mealId = mealId == null ? null : mealId.trim();
    }

    public String getShopRecordActualprice() {
        return shopRecordActualprice;
    }

    public void setShopRecordActualprice(String shopRecordActualprice) {
        this.shopRecordActualprice = shopRecordActualprice == null ? null : shopRecordActualprice.trim();
    }

    public String getShopOrderId() {
        return shopOrderId;
    }

    public void setShopOrderId(String shopOrderId) {
        this.shopOrderId = shopOrderId == null ? null : shopOrderId.trim();
    }
}