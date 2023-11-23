package com.akash;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CarRental System");
        RentalCar rentalCar=new RentalCar();

        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Enter the 1 add car:");

            System.out.println("Enter the 0 exit:");
            int n = sc.nextInt();
            switch (n) {

                    case 1:
                        System.out.println("Enter the car id:");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the car model ");
                        String model = sc.nextLine();

                        System.out.println("Enter the car make:");
                        String make = sc.nextLine();

                        System.out.println("Enter the car price: ");
                        double price = sc.nextDouble();
                        sc.nextLine();
                        Car car = new Car(id, model, make, price);

                        rentalCar.addCar(car);

                        //"Before rent:
                        System.out.println(car);


                        rentalCar.rentCar(car);
                        //"After rent:
                        System.out.println(car);

                        //Return car
                        rentalCar.returnCar(car);
                        System.out.println(car);
                        //rent calculate day wise
                        rentalCar.calculateRent(3,car);

                        break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the correct:");
                    break;

            }

        }


    }

    }
