package com.syntax.class24;

public class VehicleTest {
public static void main(String[] args) {
	 

	//Vehicle car1=new Car("Sidan");
	Vehicle car2=new Tesla("yello","tesla","sedan");
     car2.drive();
     car2.brake();
     car2.start();
     car2.stop();
     
     Vehicle car3=new Toyota("yello","tesla","sedan");
     car3.drive();
     car3.brake();
     car3.start();
     car3.stop();
    
    Vehicle.total();// count total of created obj
}  
}
