package com.company;

public class Calculator
{


    static void addition(int num1,int num2)
    {
        int sum = num1 + num2;
        System.out.println(sum);

    }


    static void subtraction(int num1,int num2)
    {
        int sub = num1 - num2;
        System.out.println(sub);

    }

    static void multiplication(int num1,int num2)
    {
        int mult = num1 * num2;
        System.out.println(mult);

    }

    static void division(int num1,int num2)
    {
        int div = num1 / num2;
        System.out.println(div);

    }










    public static void main(String[] args)
    {
      Calculator.addition(4,6);
      Calculator.subtraction(4,6);
      Calculator.multiplication(4,6);
      Calculator.division(36,6);


    }




}

