package MyTest1;

public class Car {
    String model;
    int price;
    int wheels;
    public static void main (String[]args)
    {
        Car a =new  Car();
        Car b =new  Car();
        Car c = new  Car();
        a.model="bmw";
        a.price=20000;
        a.wheels=4;
        System.out.println("model of car is "+a.model);
        System.out.println( "price="+a.price);
        System.out.println( "price="+a.wheels);
        b.model = "Oody";
        b.price = 50000;
        b.wheels = 4;
        System.out.println("model of car is "+b.model);
        System.out.println( "price="+b.price);
        System.out.println( "price="+b.wheels);
    }
}

