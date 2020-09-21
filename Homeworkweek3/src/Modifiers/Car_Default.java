package Modifiers;

public class Car_Default {

	
           int speed = 30;
          String color = "blue";
          
      void car() {
    	  System.out.println();
          }
	public static void main(String[] args) {
	
		Car_Default car1 = new Car_Default();
		int speed2 = car1.speed;
		String color2 = car1.color;
		System.out.println("speed= "+ speed2  +   "color="  + color2);
		
		
		
	}
}
