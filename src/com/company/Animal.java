package com.company;

import java.io.File;

public class Animal {
    String species;
            String name;
           Double weight = 10.0;
            File pic;


            void feed(Double foodWeight) {
                if(this.weight <= 0) {
                    System.out.println("toolate");
                } else {
                    this.weight += foodWeight;
                    System.out.println("thxforfood");

                }
            }

            void takeForAWalk () {
                if(this.weight <=0 ) {
                    System.out.println("You cannot walk the street qith a dead pet");
                } else {
                    this.weight --;


                }
            }





    }