class Fan{
	private final int SLOW = 1;
	private final int MEDIUM = 2;
	private final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	Fan(){
	}
	void setSpeed(String speed){
		switch(speed){
			case "SLOW":this.speed = SLOW;break;
			case "MEDIUM":this.speed = MEDIUM;break;
			case "FAST":this.speed = FAST;
		}
	}
	void setOn(boolean on){
		this.on = on; 
	}
	void setRadius(double radius){
		this.radius = radius;
	}
	void setColor(String color){
		this.color = color;
	}
	int getSpeed(){
		return this.speed;
	}
	double getRadius(){
		return this.radius;
	}
	boolean getOn(){
		return this.on;
	}
	String getColor(){
		return this.color;
	}
	public String toString(){
		return (this.on)?("" + this.speed + " " +  this.color + " " + this.radius):("fan is off" + " " + this.color + " " + this.radius);
	}
}