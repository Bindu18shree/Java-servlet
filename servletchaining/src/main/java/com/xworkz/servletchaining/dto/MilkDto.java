package com.xworkz.servletchaining.dto;

public class MilkDto {

    private String brand;
    private String milkType;
    private int quantity;
    private double totalPrice;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public MilkDto() {
    }

    public MilkDto(String brand, String milkType, int quantity, double totalPrice) {
        this.brand = brand;
        this.milkType = milkType;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }


    @Override
    public String toString() {
        return "MilkDto{" +
                "brand='" + brand + '\'' +
                ", milkType='" + milkType + '\'' +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", id=" + id +
                '}';
    }
}
