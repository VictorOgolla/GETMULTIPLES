package com.company;
//static method : cannot be accessed through an object
//public method : acced through an object
public class Planet
{
    String shape = "Circular";
    String material = " Soil";
    int size;

    public void getShape()
    {
        System.out.println(shape);
    }

    public void getMaterial()
    {
        System.out.println(material);
    }

    public void getSize()
    {
        System.out.println(size);
    }

}

