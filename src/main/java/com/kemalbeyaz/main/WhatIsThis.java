package com.kemalbeyaz.main;

import com.kemalbeyaz.model.Car;

public class WhatIsThis {

    public static void main(String[] args) {
        System.out.println("Java is pass by value!");

        Car car1 = new Car();
            car1.setBrand("Bentley");
            car1.setColor("White");

        System.out.println(car1 + " " + car1.toStringInvoke());

        Car car2 = new Car();
            car2.setBrand("Maserati");
            car2.setColor("Black");

        System.out.println(car2 + " " + car2.toStringInvoke());

        // Now change the cars, still car1 is car1 and car2 is car2 :)
        change(car1,car2);
        System.out.println(car1 + " " + car1.toStringInvoke());
        System.out.println(car2 + " " + car2.toStringInvoke());
    }

    public static void change(Car car1, Car car2){
        Object temp = car1;
        car1 = car2;
        car2 = (Car) temp;
    }
}
