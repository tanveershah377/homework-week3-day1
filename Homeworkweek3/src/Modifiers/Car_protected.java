package Modifiers;

public class Car_protected {

	protected int speed = 30;
	protected String color = "blue";
	
	protected void method () {
		System.out.println("display");
	}
	
	
	
	public static void main(String[] args) {
		
		Car_protected pro = new Car_protected();
		int speed3 = pro.speed;
		String color3 = pro.color;
		System.out.println("speed: "+ speed3 +
				"color:"+ color3);
		

	}

}
