package com.xworkz.ornament.dto;

public class OrnamentDTO {

private String name;
private int grams;
private double gramPerCost;
private int gst;
private int serviceRating;
private double totalCost;

    public OrnamentDTO(String name, int grams, double gramPerCost, int gst, int serviceRating) {
        this.name = name;
        this.grams = grams;
        this.gramPerCost = gramPerCost;
        this.gst = gst;
        this.serviceRating = serviceRating;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "OrnamentDTO{" +
                "name='" + name + '\'' +
                ", grams=" + grams +
                ", gramPerCost=" + gramPerCost +
                ", gst=" + gst +
                ", serviceRating=" + serviceRating +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public double getGramPerCost() {
        return gramPerCost;
    }

    public void setGramPerCost(double gramPerCost) {
        this.gramPerCost = gramPerCost;
    }

    public int getGst() {
        return gst;
    }

    public void setGst(int gst) {
        this.gst = gst;
    }

    public int getServiceRating() {
        return serviceRating;
    }

    public void setServiceRating(int serviceRating) {
        this.serviceRating = serviceRating;
    }
}
