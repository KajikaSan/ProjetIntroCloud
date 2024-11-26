package com.example.TP1_cloud;

public class Car {
    private String plateNumber;
    private String band;
    private int price;
    private boolean rent;

    public Car(String plateNumber,String band,int price, boolean rent ){
        this.band=band;
        this.plateNumber = plateNumber;
        this.price=price;
        this.rent=rent;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getBand() {
        return band;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }
}
