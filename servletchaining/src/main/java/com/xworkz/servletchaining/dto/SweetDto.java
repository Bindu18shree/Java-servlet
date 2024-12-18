package com.xworkz.servletchaining.dto;

public class SweetDto {

    private String sweetName;
    private String shopName;
    private boolean isSpecial;
    private int quantity;
    private double totalCost;

    public SweetDto(String sweetName, String shopName, boolean isSpecial, int quantity, double totalCost) {
        this.sweetName = sweetName;
        this.shopName = shopName;
        this.isSpecial = isSpecial;
        this.quantity = quantity;
        this.totalCost = totalCost;
    }

    public String getSweetName() {
        return sweetName;
    }

    public void setSweetName(String sweetName) {
        this.sweetName = sweetName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public boolean getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(boolean special) {
        this.isSpecial = special;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "SweetDto{" +
                "sweetName='" + sweetName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", isSpecial=" + isSpecial +
                ", quantity=" + quantity +
                ", totalCost=" + totalCost +
                '}';
    }
}
