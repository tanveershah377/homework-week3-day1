package Modifiers;

public class Car_private {

	private int speed = 30;
	private String color = "blue";
	
	private void Car_private(){
		System.out.print("result");
	}
	
		public static void main(String[] args) {
	Car_private c = new Car_private();
	int speed1 = c.speed;
	String color1 = c.color;
	System.out.println("speed="+ speed1 + "color="+ color1);
	
	
	
	}
	
	
}
