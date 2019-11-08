package com.company;

public class Car
{
    static void maxSpeed()
    {
        System.out.println("Buggati speed");
    }

    public void getName()
    {
        System.out.println("Buddati");

    }



    public static void main(String[] args)
    {
//      To make use of a static method we dont need an object
       maxSpeed();

       Car car1 = new Car();
       car1.getName();
       car1.maxSpeed();
    }

//Assignment :Create a calculator that has the following functionality:
//    +, -,/,*
//Assignment :create a program that has an array of integers.
// this program should print out integers that are multiple of 2,3,5,7,8
//    after a method that checks multiples of 2,3,5,7,8
//    numbers = { 4,8,6,42,25,35,21,49,16,64}
}

