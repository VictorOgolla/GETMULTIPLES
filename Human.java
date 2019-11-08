package com.company;

public class Human
{
//  constructor:This is a special method that is used to initialize objects
//    constructor method is called when an object of a class is created

//    it can be used to initialize value for object attributes
//    imust be the same as class
//    CANNOT HAVE a return value
    int    theheight;
    String thecountry;
    String thecareer;


//    constructor method Human(){}
    public  Human(int myHeight, String country,String  career)
    {
        theheight  = myHeight;
        thecountry = country;
        thecareer  = career;


    }

    public void run()
    {
        System.out.println("Ican run very fast");


    }

    public static void main(String[] args)
    {

      Human john = new Human(25 ,"China","Actor");
        System.out.println(john.theheight);
        System.out.println(john.thecountry);
        System.out.println(john.thecareer);
        john.run();

        Modifiers newPerson = new Modifiers();
//        newPerson.name;
        System.out.println(newPerson);
    }


}

