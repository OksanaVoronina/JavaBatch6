package com.syntax.class24;

public class VehicleTest {
public static void main(String[] args) {
	//Create a class Bus, which will be concrete child class 
	//of the vehicle class.Create a SchoolBus class 
	//that will be a subclass of the Bus and override 
	//method drive() and stop().Create an array of vehicles
	//and see which methods will be available
	//and see the output of the program

	//Vehicle car1=new Car("Sidan");
	Vehicle []car= {new Tesla("yello","tesla","sedan"),new Toyota("gray","Toyota","Corola"),
			new Bus("orage","Bus","A Bus"),new SchoolBus("Schoole Buse","orange","Schoole Buse")};
     
    for(Vehicle cars:car) {
   cars.brake();
   cars.drive();
   cars.start();
   cars.stop();
    }
    Vehicle.total();// count total of created obj
}  
}
