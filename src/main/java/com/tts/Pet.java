package com.tts;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Pet {

        public Pet(){
            name = "";
            age = 0;
            type = "";
            location = "";
        }
        public Pet(String name, int age, String type, String location){

            this.name = name;
            this.age = age;
            this. type = type;
            this.location = location;
        }

        private String name;
        private int age;
        private String type;
        private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }



}




