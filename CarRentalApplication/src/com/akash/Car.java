package com.akash;

public class Car {
    private int id;
    private String modle;
    private String make;
    private double priceParDay;
    private boolean isAvailabil;
    public Car(int id,String model,String make,double priceParDay){
        this.id=id;
        this.modle=model;
        this.make=make;
        this.priceParDay=priceParDay;
        this.isAvailabil=true;
    }


    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }


    public String getModle() {

        return modle;
    }

    public void setModle(String modle) {

        this.modle = modle;
    }

    public String getMake() {

        return make;
    }

    public void setMake(String make) {

        this.make = make;
    }

    public double getPriceParDay() {

        return priceParDay;
    }

    public void setPriceParDay(double priceParDay) {

        this.priceParDay = priceParDay;
    }

    public boolean isAvailabil() {

        return isAvailabil;
    }

    public void setAvailabil(boolean availabil)
    {
        isAvailabil = availabil;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", modle='" + modle + '\'' +
                ", make='" + make + '\'' +
                ", priceParDay=" + priceParDay +
                ", isAvailabil=" + isAvailabil +
                '}';
    }
}
