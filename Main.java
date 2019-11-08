package com.company;

public class Main
{
    int x =5;
    int y =15;
    String name ="John Doe";

    public static void main(String[] args) //This is a method
    {
//       ClassName nameOfObject = new ClassName();
        Main obj1 = new Main();
        Main obj2 = new Main();
//        accessing attributes from an object:USE DOT NOTATION
        System.out.println(obj1.x);
        System.out.println(obj1.y);
        System.out.println(obj1.name);

        System.out.println(obj2.x);
        System.out.println(obj2.y);
        System.out.println(obj2.name);

        Planet saturn  = new Planet();
        Planet mercury = new Planet();

        System.out.println(saturn.shape);
        System.out.println(saturn.material);

//        Modifying attributes
//        syntax:
//            objectName.atrribute = "newValue";
            saturn.shape = "Box";
        System.out.println("The shape of saturn changed to " + saturn.shape);

        saturn.size = 1300;
        mercury.size = 3000;

        System.out.println(mercury.size);
        System.out.println(saturn.size);

        saturn.getMaterial();
        mercury.getMaterial();

        mercury.getShape();
        saturn.getShape();





    }






}
