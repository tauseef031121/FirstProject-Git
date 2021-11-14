class Car1{

String name;
String color;

void printinfo(){

    System.out.println("My car color is "+color+" and Model is "+name);
}

Car1(String name, String color){

    this.name = name;
    this.color = color;

}

}

public class Constructor1{

    public static void main(String[] args){

//when object created calling constructor Car1(String name, String color)

    Car1 carobj1 = new Car1("Red", "Maruthi");
    Car1 carobj2 = new Car1("Blue", "Tata");

    carobj1.printinfo();
    carobj2.printinfo();



    }

}