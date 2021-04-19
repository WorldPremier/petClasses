package com.tts;

import java.util.*;


public class Main {

    public static void main(String[] args) {



        Pet pet =  new Pet();
        pet.setName("kaye");
        pet.setAge(5);
        pet.setType("dog");
        pet.setLocation("NY");


        System.out.println(pet.getName());
        System.out.println(pet.getAge());
        System.out.println(pet.getType());
        System.out.println(pet.getLocation());

        System.out.println("====new pet ========");

        Pet pet2 = new Pet();
        pet2.setName("sonny");
        pet2.setAge(10);
        pet2.setType("cat");
        pet2.setLocation("Charlotte");
        System.out.println(pet2.getName());
        System.out.println(pet2.getAge());
        System.out.println(pet2.getType());
        System.out.println(pet2.getLocation());


        System.out.println(" ========= New Car ========== ");
        Car car = new Car();
        car.setMake("Toyota");
        car.setModel("Rav4");
        car.setYear(2021);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.modernCar());

    }

}
