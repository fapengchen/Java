import java.util.Scanner;
import java.util.Date;
import java.util.Random;
import java.util.GregorianCalendar;

class Work_1{
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		System.out.printf("%s\t%s\n","Width","height");
		System.out.printf("r1:%s\t%s\n",r1.getArea(),r1.getPerimeter());
		System.out.printf("r2:%s\t%s\n",r2.getArea(),r2.getPerimeter());
	}
}
class Work_2{
	public static void main(String[] args){
		Stock s = new Stock("ORCL","Oracle Corporation",34.5);
		System.out.printf("%s %s %s %.2f%%\n",s.symbol,s.name,s.currentprice,s.getChangePercent());
		s.setPrice(34.35);
		System.out.printf("%s %s %s %.2f%%\n",s.symbol,s.name,s.currentprice,s.getChangePercent());
	}
}
class Work_3{
	public static void main(String[] args){
		Date d = new Date();
		for (int i = 0; i < 8;i++){
			long n = 100000 * (long)((Math.pow(10,i)));
			d.setTime(n);
			System.out.println(d + " " + n);
		}
	}
}

class Work_4{
	public static void main(String[] args){
		Random random1 = new Random(1000);
		for (int i = 1;i <= 50;i++){
			System.out.print(random1.nextInt(100) + " ");
			if (i % 10 == 0 ){
				System.out.println();
			}
		}
		System.out.println();
	}
}

class Work_5{
	public static void main(String[] args){
		GregorianCalendar g = new GregorianCalendar();

		System.out.println("YEAR: " + g.get(GregorianCalendar.YEAR));
		System.out.println("MONTH: " + g.get(GregorianCalendar.MONTH));
		System.out.println("DAY: " + g.get(GregorianCalendar.DAY_OF_MONTH));
		long n = 1234567898765L;
		g.setTimeInMillis(n);
		System.out.println("YEAR: " + g.get(GregorianCalendar.YEAR));
		System.out.println("MONTH: " + g.get(GregorianCalendar.MONTH));
		System.out.println("DAY: " + g.get(GregorianCalendar.DAY_OF_MONTH));

	}
}
class Work_6{
	public static void main(String[] args){
		double[] list = new double[100000];
		Random random1 = new Random(1000);
		for (int i = 0; i < list.length;i++){
			list[i] = random1.nextDouble();
		}
		StopWatch d = new StopWatch();
		d.start();
		for (int i = 0;i < list.length - 1;i++){
			double min = list[i];
			int minIndex = i;
			for (int j = i + 1;j < list.length;j++){
				if (list[j] < min){
					min = list[j];
					minIndex = j;
				}
			}
			if (i != minIndex){
				list[minIndex] = list[i];
				list[i] = min; 
			}
		}
		d.stop();

		System.out.println(d.getElapsedTime());
	}
}
class Work_7{
	public static void main(String[] args){
		Account a = new Account(1122,20000);
		a.setAnnualInterstRate(4.5);
		a.withDraw(2500);
		a.deposit(3000);
		System.out.println("balance: " + a.getBalance());
		System.out.println("MonthlyInterest: " + a.getMonthlyInterest());
		System.out.println("Date: " + a.dateCreated());
	}
}
class Work_8{
	public static void main(String[] args){
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		f1.setSpeed("FAST");
		f1.setRadius(10);
		f1.setColor("yellow");
		f1.setOn(true);
		f2.setSpeed("MEDIUM");
		System.out.println(f1.toString());
		System.out.println(f2.toString());


	}
}

class Work_9{
	public static void main(String[] args){
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(6,4);
		RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println("r1: " + r1.getPerimeter() + " " + r1.getArea());
		System.out.println("r2: " + r2.getPerimeter() + " " + r2.getArea());
		System.out.println("r3: " + r3.getPerimeter() + " " + r3.getArea());
	}
}
class Work_10{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a b c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		QuadraticEquation q = new QuadraticEquation(a,b,c);
		if (q.getDiscriminant() < 0)
			System.out.println("The equation has no roots.");
		else if(q.getDiscriminant() == 0)
			System.out.println("r: " + q.getRoot1());
		else
			System.out.println("r1: " + q.getRoot1() + "r2: " + q.getRoot2());
	}
}

class Work_11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a b c d e f g");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		LinearEquation line = new LinearEquation(a,b,c,d,e,f);
		if (!line.isSolvable())
			System.out.println("The equation has no solution.");
		else
			System.out.println("x: " + line.getX() + "y: " + line.getY());
	}
}
class Work_12{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double a = (y1 - y2);
		double b = -(x1 - x2);
		double c = (y3 - y4);
		double d = -(x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		LinearEquation line = new LinearEquation(a,b,c,d,e,f);
		if (!line.isSolvable())
			System.out.println("The equation has no solution.");
		else
			System.out.println("x: " + line.getX() + "y: " + line.getY());

	}
}

class Work_13{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of rows and columns in the array: ");
		int n = input.nextInt();
		int m = input.nextInt();

		double[][] list = new double[n][m];
		System.out.println("Enter the array: ");
		for (int i = 0;i < n;i++){
			for (int j = 0;j < m;j++){
				list[i][j] = input.nextDouble();
			}
		}

		Location locat = locateLargest(list);

		System.out.println("The location of the largest element is " + locat.maxValue + " at (" + 
			locat.row + ", " + locat.column + ")");
	}
	public static Location locateLargest(double[][] a){
		Location  locat = new Location();
		for (int i = 0;i < a.length;i++){
			for (int j = 0;j < a[i].length;j++){
				if (a[i][j] > locat.maxValue){
					locat.row = i;
					locat.column = j;
					locat.maxValue = a[i][j];
				}
			}
		}
		return locat;
	}
}