package com.kemalbeyaz.main;

import com.kemalbeyaz.model.Car;

public class WhatIsGoingOn {
    public static void main(String[] args) {
        System.out.println("Hello! This is first the impression.");

        Car car1 = new Car();
            car1.setBrand("Audi");
            car1.setColor("White");

        System.out.println(car1 + " " + car1.toStringInvoke());

        Car car2 = new Car();
            car2.setBrand("Mercedes");
            car2.setColor("Black");

        System.out.println(car2 + " " + car2.toStringInvoke());

        System.out.println(" ");

        // car2 is now Audi
            car2 = car1;
        System.out.println(car2 + " " + car2.toStringInvoke());
        System.out.println(car1 + " " + car1.toStringInvoke());

        System.out.println(" ");

        // car2 is Mercedes ?
            car2.setBrand("BMW");
            car2.setColor("Grey");
        System.out.println(car2 + " " + car2.toStringInvoke());
        System.out.println(car1 + " " + car1.toStringInvoke());

        System.out.println(" ");

        // car1 is ? What the F! :)

            car1.setBrand("Opel");
            car1.setColor("Insignia");
        System.out.println(car2 + " " + car2.toStringInvoke());
        System.out.println(car1 + " " + car1.toStringInvoke());
    }
}
