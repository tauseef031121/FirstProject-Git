class Car{

    String color1;
    String model1;

    void message(){

        System.out.println("My car color is "+color1+" and Model is "+model1);
    }
}
public class NewCar{

public static void main(String[] args){


    Car car1 = new Car();
    car1.color1="Red";
    car1.model1="Maruthi";
    car1.message();
    Car car2 = new Car();
    car2.color1="Green";
    car2.model1="Tata car";
    car2.message();
   
}
}