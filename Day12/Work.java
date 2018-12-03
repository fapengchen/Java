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

class Work_6
{
	public static void main(String[] args)
	{
		int r = 40;
		double aa = Math.random() * (2 * Math.PI);
		double bb = Math.random() * (2 * Math.PI);
		double cc = Math.random() * (2 * Math.PI);

		double x1 = r * Math.cos(aa);
		double y1 = r * Math.sin(aa);
		double x2 = r * Math.cos(bb);
		double y2 = r * Math.sin(bb);
		double x3 = r * Math.cos(cc);
		double y3 = r * Math.sin(cc);

		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		double A = Math.toDegrees(Math.acos((a * a - b * b - c - c) / (-2 * b * c))); 
		double B = Math.toDegrees(Math.acos((b * b - a * a - c - c) / (-2 * a * c))); 
		double C = Math.toDegrees(Math.acos((c * c - b * b - a - a) / (-2 * a * b)));

		System.out.println("A: " + A + "\nB: " + B + "\nC: "+ C );
	}
}



class Work_7 
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		double oneDegree = Math.PI/180;
		System.out.print("Enter the radius of the bounding circle:");
		double radius = cin.nextDouble();
		System.out.println("The coordinating of five points on the pentagon are");
		System.out.println("(" + 0 + "," + radius + ")");
		double x = Math.sqrt((radius*radius)/(1+Math.tan(18*oneDegree)*Math.tan(18*oneDegree)));
		double y = x*Math.tan(18*oneDegree);
		System.out.println("(" + x + "," + y + ")");
		System.out.println("(" + -x + "," + y + ")");
		x = Math.sqrt((radius*radius)/(1+Math.tan(54*oneDegree)*Math.tan(54*oneDegree)));
		y = x*Math.tan(54*oneDegree);
		System.out.println("(" + x + "," + y + ")");
		System.out.println("(" + -x + "," + y + ")");
	}
}

class Work_8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a ASCII code: ");
		int code = input.nextInt();

		char c_a = (char)code;
		System.out.println("The character for AcSCII " + c_a + " is " + code);

	}
}

class Work_9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a character: ");
		String c = input.nextLine();

		int ch = (int)c.charAt(0);


		System.out.print("The Unicode for the character " +  c + " is " + ch);
	}
}

class Work_10
{
	public static void main(String[] args)
	{
		String set1 = 
		" 1  3  5  7\n" +
		" 9 11 13 15\n" +
		"17 19 21 23\n" +
		"25 27 29 31";

		String set2 = 
		" 2  3  6  7\n" +
		"10 11 14 15\n" +
		"18 19 22 23\n" +
		"26 27 30 31";

		String set3 = 
		" 4  5  6  7\n" +
		"12 13 14 15\n" +
		"20 21 22 23\n" +
		"28 29 30 31";
		String set4 = 
		" 8  9 10 11\n" +
		"12 13 14 15\n" +
		"24 25 26 27\n" +
		"28 29 30 31";

		String set5 = 
		"16 17 18 19\n" +
		"20 21 22 23\n" +
		"24 25 26 27\n" +
		"28 29 30 31";

		int day = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Is your birthday in Set1?\n");
		System.out.print(set1);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		String answer = input.nextLine();

		if (answer.equals("Y"))
			day += 1;


		System.out.print("Is your birthday in Set2?\n");
		System.out.print(set2);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextLine();

		if (answer.equals("Y"))
			day += 2;


		System.out.print("Is your birthday in Set3?\n");
		System.out.print(set1);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextLine();

		if (answer.equals("Y"))
			day += 4;

		System.out.print("Is your birthday in Set4?\n");
		System.out.print(set1);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextLine();

		if (answer.equals("Y"))
			day += 8;


		System.out.print("Is your birthday in Set5?\n");
		System.out.print(set5);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextLine();

		if (answer.equals("Y"))
			day += 16;

		System.out.print("\nYour birthday is " + day + "!");
	}
}

class Work_11
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal value(0 to 15): ");
		int n = input.nextInt();

		if (n >= 0 && n <= 15)
		{
			if (n < 10)
				System.out.println("The hex value is " + n);
			else
			{
				char nn = (char)((n - 10) + 'A');
				System.out.println("The hex value is " + nn);
			}
		}
		else
			System.out.println(n +  " is an invalid input");


	}
}

class Work_12
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex digit: ");
		String n = input.nextLine();
		char n1 = n.charAt(0);

		if (Character.isDigit(n1))
		{
			int n2 = (int)n1;
			int n_1 = n2 % 2;
			n2 /= 2;
			int n_2 = n2 % 2;
			n2 /= 2;
			int n_3 = n2 % 2;
			n2 /= 2;
			int n_4 = n2 % 2;
			System.out.println("The binary value is " + 
				n_4 + "" + n_3 + "" + n_2 + "" + n_1);

		}
		else if (Character.isLetter(n1))
		{
			int n2 = n1 - 'A';
			if (n2 <= 5)
			{
				n2 += 10;
				int n_1 = n2 % 2;
				n2 /= 2;
				int n_2 = n2 % 2;
				n2 /= 2;
				int n_3 = n2 % 2;
				n2 /= 2;
				int n_4 = n2 % 2;
				System.out.println("The binary value is " + 
					n_4 + "" + n_3 + "" + n_2 + "" + n_1);
			}
			else
				System.out.println(n1 + " is an invalid input ");
		}
	}
}

class Work_13
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		String letters = input.nextLine();
		char letter = letters.charAt(0);

		if (Character.isLetter(letter))
		{
			letter = Character.toUpperCase(letter);
			if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
				System.out.println(letters + " is a vowel");
			else
				System.out.println(letters + " is a consonant");
		}
		else
			System.out.println(letters + " is a invalid input");

	}
}

class Work_14
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter grade: ");
		String grades =  input.nextLine();
		char grade = grades.charAt(0);

		if (Character.isLetter(grade))
		{
			if (((grade >= 65) && (grade <= 68)))
			{
				int n = 'A' - grade + 4;
				System.out.println("The numberic value for grade " + grade + " is "+ n);				
			}
			else if (grade == 'F')
				System.out.println("The number value for grade F is 0");
			else
				System.out.println(grades + " is an invalid grade");
		}
		else
			System.out.println(grades + " is an invalid grade");

	}
}

class Work_15
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		String letters = input.nextLine();
		char letter = letters.charAt(0);

		if (Character.isLetter(letter))
		{
			letter = Character.toLowerCase(letter);
			if (letter == 'a' || letter == 'b' || letter == 'c')
				System.out.println("The corresponding number is 2");
			else if (letter == 'd' || letter == 'e' || letter == 'f')
				System.out.println("The corresponding number is 3");
			else if (letter == 'g' || letter == 'h' || letter == 'i')
				System.out.println("The corresponding number is 4");
			else if (letter == 'j' || letter == 'k' || letter == 'l')
				System.out.println("The corresponding number is 5");
			else if (letter == 'm' || letter == 'n' || letter == 'o')
				System.out.println("The corresponding number is 6");
			else if (letter == 'p' || letter == 'q' || letter == 'r' || letter == 's')
				System.out.println("The corresponding number is 7");
			else if (letter == 't' || letter == 'u' || letter == 'v')
				System.out.println("The corresponding number is 8");
			else if (letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z')
				System.out.println("The corresponding number is 9");
			else
				System.out.println(letter + " is an invalid input");
		}
		else
			System.out.println(letter + " is an invalid input");
	}
}

class Work_16
{
	public static void main(String[] args)
	{
		int n = 65 + (int)(Math.Random() * 27);
		char N = (char)n;
	}
}