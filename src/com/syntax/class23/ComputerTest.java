package com.syntax.class23;

public class ComputerTest {
public static void main(String args[]) {
	
	//Computer com;
	//new Computer("Dell");
	//new Apple("Apple");
	//new Lenovo("Lenovo");
	//new HP("HP");
	
	Smart hp=new Computer("Apple");
		hp.smart();
		
	Computer [] comp={new Computer("Dell"), new Apple("Apple"),
			new Lenovo("Lenovo"), new HP("HP")};
	for(Computer c:comp) {
		c.play();
		c.print();
		
		
	}
}
}
