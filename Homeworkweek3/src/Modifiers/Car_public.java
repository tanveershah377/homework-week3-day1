package Modifiers;

public class Car_public {

	
		
          int speed = 30;
          String color = "blue";
          
        public void car1 () {
        	System.out.println("show");
        }
	public static void main(String[] args) {
		
		Car_public cp = new Car_public();
		int speed4 = cp.speed;
		String color4 = cp.color;
		System.out.println("speed of car"+ speed4 + "color of car"+ color4);
		
		
	}
}
