package com.xworkz.servletchaining.dto;

public class MuseumTicketDto {

    private int id;
    private String name;
    private int noOfAdults;
    private int noOfChildren;
    private long mobileNo;
    private String email;
    private double totalCost;

    public MuseumTicketDto(String name, int noOfAdults, int noOfChildren, long mobileNo, String email, double totalCost) {
        this.name = name;
        this.noOfAdults = noOfAdults;
        this.noOfChildren = noOfChildren;
        this.mobileNo = mobileNo;
        this.email = email;
        this.totalCost = totalCost;
    }

    public void setId(int id) {this.id = id; }

    public int getId() { return id; }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfAdults() {
        return noOfAdults;
    }

    public void setNoOfAdults(int noOfAdults) {
        this.noOfAdults = noOfAdults;
    }

    public int getNoOfChildren() {
        return noOfChildren;
    }

    public void setNoOfChildren(int noOfChildren) {
        this.noOfChildren = noOfChildren;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "MuseumTicketDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", noOfAdults=" + noOfAdults +
                ", noOfChildren=" + noOfChildren +
                ", mobileNo=" + mobileNo +
                ", email='" + email + '\'' +
                ", totalCost=" + totalCost +
                '}';
    }
}
