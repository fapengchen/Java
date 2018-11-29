import java.util.Scanner;

class Work_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length from the center to a vertex: ");
		double r = input.nextDouble();

		double s = 2 * r * Math.sin(Math.PI / 5);
		double pentagon = 5 * s * s / (4 * Math.tan(Math.PI / 5));

		System.out.printf("The area of the pentagon is %.2f",pentagon);
	}
}
class Work_2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double d = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) 
									 * Math.sin(Math.toRadians(x2))
									 + Math.cos(Math.toRadians(x1))
									 * Math.cos(Math.toRadians(x2))
									 * Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));
		System.out.println("The distance between the two points is " + d);
	}
}

class Work_3
{
	public static void main(String[] args)
	{
		double Atlanta_x = 33.7489954;
		double Atlanta_y = -84.3879824;

		double Orlando_x = 28.5383355;
		double Orlando_y = -81.3792365;

		double Savannah_x = 32.0835407;
		double Savannah_y = -81.0998342;

		double Charlotte_x = 35.2270869;
		double Charlotte_y = -80.8431267;

		double d1 = 6371.01 * Math.acos(Math.sin(Math.toRadians(Atlanta_x)) 
									 * Math.sin(Math.toRadians(Orlando_x))
									 + Math.cos(Math.toRadians(Atlanta_x))
									 * Math.cos(Math.toRadians(Orlando_x))
									 * Math.cos(Math.toRadians(Atlanta_y) - Math.toRadians(Orlando_y)));
		
		double d2 = 6371.01 * Math.acos(Math.sin(Math.toRadians(Orlando_x)) 
									 * Math.sin(Math.toRadians(Savannah_x))
									 + Math.cos(Math.toRadians(Orlando_x))
									 * Math.cos(Math.toRadians(Savannah_x))
									 * Math.cos(Math.toRadians(Orlando_y) - Math.toRadians(Savannah_y)));
		
		double d3 = 6371.01 * Math.acos(Math.sin(Math.toRadians(Savannah_x)) 
									 * Math.sin(Math.toRadians(Charlotte_x))
									 + Math.cos(Math.toRadians(Savannah_x))
									 * Math.cos(Math.toRadians(Charlotte_x))
									 * Math.cos(Math.toRadians(Savannah_y) - Math.toRadians(Charlotte_y)));
		
		double d4 = 6371.01 * Math.acos(Math.sin(Math.toRadians(Charlotte_x)) 
									 * Math.sin(Math.toRadians(Atlanta_x))
									 + Math.cos(Math.toRadians(Charlotte_x))
									 * Math.cos(Math.toRadians(Atlanta_x))
									 * Math.cos(Math.toRadians(Charlotte_y) - Math.toRadians(Atlanta_y)));

		double d5 = 6371.01 * Math.acos(Math.sin(Math.toRadians(Atlanta_x)) 
									 * Math.sin(Math.toRadians(Savannah_x))
									 + Math.cos(Math.toRadians(Atlanta_x))
									 * Math.cos(Math.toRadians(Savannah_x))
									 * Math.cos(Math.toRadians(Atlanta_y) - Math.toRadians(Savannah_y)));
		double s = (d1 + d2 + d5) / 2;
		double s1 = Math.sqrt(s * (s - d1) *(s - d2) * (s - d5));

		s = (d3 + d4 + d5) / 2;
		double s2 = Math.sqrt(s * (s - d3) *(s - d4) * (s - d5));

		System.out.println("The area of the triangle is " + (s1 + s2));		 
	}
}

class Work_4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		double s = 6 * (side * side) / (4 * Math.tan(Math.PI / 6));

		System.out.println("The area of hte hexagon is " + s); 
	}
}

class Work_5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of sides: ");
		int number = input.nextInt();
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		double s = number * (side * side) / (4 * Math.tan(Math.PI / number));

		System.out.println("The are of the polygon is " + s);
	}
}