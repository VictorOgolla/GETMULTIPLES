package com.company;

public class MyClass {
    public static void main(String[] args) {
        int cars[]= {12,35,5,47,45,32};

        for (int i = cars[0]; i < cars.length; i++) {
//            System.out.println(cars[i]);
            if(cars[i] % 3 == 0)
            {

                System.out.println(cars[i]);
            }
        }
    }
}
