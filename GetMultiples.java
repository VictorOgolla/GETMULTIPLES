package com.company;

public class GetMultiples
{

   static void printMultoftwo(int[] numbers)
    {
        int j;
        j= numbers[0];

        for (j = 0; j<numbers.length; j++)
        {
//            System.out.println(numbers[j]);
            if(numbers[j] % 2 == 0)
            {
                System.out.println(numbers[j]);
            }

        }

    }

    static void printMultofthree(int[] numbers)
    {
        int j;
        j= numbers[0];

        for (j = 0; j<numbers.length; j++)
        {
            System.out.println(numbers[j]);
            if(numbers[j] % 3 == 0)
            {
                System.out.println(numbers[j]);
            }

        }

    }

    static void printMultoffive(int[] numbers)
    {
        int j;
        j= numbers[0];

        for (j = 0; j<numbers.length; j++)
        {
            System.out.println(numbers[j]);
            if(numbers[j] % 5 == 0)
            {
                System.out.println(numbers[j]);
            }

        }

    }

    static void printMultofseven(int[] numbers)
    {
    int j;
    j= numbers[0];

    for (j = 0; j<numbers.length; j++)
    {
        if(numbers[j] % 7 == 0)
        {
            System.out.println(numbers[j]);
        }

    }

    }

    static void printMultofeight(int[] numbers)
    {
        int j;
        j= numbers[0];

        for (j = 0; j<numbers.length; j++)
        {
//            System.out.println(numbers[j]);
            if(numbers[j] % 8 == 0)
            {
                System.out.println(numbers[j]);
            }

        }

    }



    public static void main(String[] args )
    {
       int [] numbers  = {4,8,6,42,25,35,21,49,16,64};
//       GetMultiples.printMultoftwo(numbers);
//       GetMultiples.printMultofthree(numbers);
//       GetMultiples.printMultoffive(numbers);
       GetMultiples.printMultofseven(numbers);
//       GetMultiples.printMultofeight(numbers);

    }










}
