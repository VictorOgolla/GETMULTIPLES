package com.company;

public class MultiplesOfthree
{

    public static void main(String[] args)
    {
        int [] array = {12,35,5,47,45,36,60};
        int j;
        j = array[0];//initializing the current index

        for (j = 0; j<array.length;j++)
        {
//            System.out.println(array[j]);
            if (array[j] % 3 ==0)
            {
                System.out.println(j);
            }
        }


    }













}

