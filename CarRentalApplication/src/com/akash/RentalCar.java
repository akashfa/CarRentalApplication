package com.akash;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalCar {
    private ArrayList<Car> cars;


    public RentalCar() {
        this.cars = new ArrayList<>();

    }

    //Method add car in ArrayList
    public void addCar(Car car) {
        cars.add(car);
    }


   //Method removeCar in ArrayList
    public void removeCar(int id) {
        Car removeCar = null;
        for (Car getCar : cars) {
            if (getCar.getId() == id) {
                removeCar = getCar;
            }
        }
        if (removeCar != null) {
            cars.remove(removeCar);
            System.out.println("Car Remove Seccssfull: ");
        } else {
            System.out.println("Enter the valid id: ");
        }
    }
    //Method show Car is present or not
    public boolean carStatus(Car car) {

        return car.isAvailabil();
    }
    //Method give the reatCar
    public void rentCar(Car car) {
        if (car.isAvailabil()) {
            car.setAvailabil(false);

            System.out.println("car successfull Rent:");
        } else {
            System.out.println("Car is not available:");
        }
    }
    //Method returCar
    public void returnCar(Car car) {
        boolean flage = false;
        for (Car car1 : cars) {
            if ((car1.getId() == car.getId())) {
                flage = true;

            }

        }
        if (flage) {
            car.setAvailabil(true);
            System.out.println("Car successfully return:");

        } else {
            System.out.println("this car is invalid");
        }
    }
    //Method calculateRent total price
    public  void calculateRent(int day,Car car){
        System.out.println("Car of "+day +"days rent"+ car.getPriceParDay()*day);
    }
}

