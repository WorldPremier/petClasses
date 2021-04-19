package com.tts;

public class Car {

    private String make;
    private String model;
    private int year;

    public Car(){
        make = "";
        model = "";
        year = 0;
    }

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;

    }

    public String getMake() {
        return make;
    }
    public boolean modernCar(){
    if(year>2015){
        System.out.println("This is a modern car");
        return true;

    }else
        return false;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}




