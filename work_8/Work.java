
import java.util.Scanner;

class Work_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 3-by-4 matrix row by row:");
		double[][] m = new double[3][4];

		for (int i = 0;i < m.length;i++)
		{
			for (int j = 0;j < m[i].length;j++)
			{
				m[i][j] = input.nextDouble();
			}
		}
		for (int i = 0;i < m[0].length;i++)
		{
			double sum = sumColumn(m,i);
			System.out.println("Sum of the elements at column " + i + " is " + sum);
		}
	}

	public static double sumColumn(double[][] m,int columnIndex)
	{
		double sum = 0;

		for (int i = 0;i < m.length;i++)
		{
			sum += m[i][columnIndex];
		}
		return sum;
	}
}

class Work_2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 4-by-4 matrix row by row:");
		double[][] m = new double[4][4];

		for (int i = 0;i < m.length;i++)
		{
			for (int j = 0; j < m[i].length;j++)
			{
				m[i][j] = input.nextDouble();
			}
		}
		double sum = sumMajorDiagonal(m);
		System.out.println("Sum of the elements in the major diagonal is " + sum);

	}
	public static double sumMajorDiagonal(double[][] m)
	{
		double sum = 0;
		for (int i = 0;i < m.length;i++)
		{
			sum += m[i][i];
		}
		return sum;
	}
}

class Work_3
{
	public static void main(String[] args){
		char[][] answers = {
			{'A','B','A','C','C','D','E','E','A','D'},
			{'D','B','A','B','C','A','E','E','A','D'},
			{'E','D','D','A','C','B','E','E','A','D'},
			{'C','B','A','E','D','C','E','E','A','D'},
			{'A','B','D','C','C','D','E','E','A','D'},
			{'B','B','E','C','C','D','E','E','A','D'},
			{'B','B','A','C','C','D','E','E','A','D'},
			{'E','B','E','C','C','D','E','E','A','D'}};

		char[] keys = {'D','B','D','C','C','D','A','E','A','D'};

		int[][] keyslist = new int[answers.length][2]; 
		for (int i = 0;i < answers.length;i++)
		{
			keyslist[i][0] = i;
			for (int j = 0; j < answers[i].length;j++)
			{
				if (answers[i][j] == keys[j])
					keyslist[i][1]++;
			}
		}
		for (int i = 0;i < keyslist.length;i++)
		{
			int[] min = keyslist[i];
			int minIndex = i;
			for (int j = i + 1; j < keyslist.length;j++)
			{
				if (min[1] > keyslist[j][1])
				{
					min = keyslist[j];
					minIndex = j;
				}
			}
			if (minIndex != i)
			{
				keyslist[minIndex] = keyslist[i];
				keyslist[i] = min;
			}
		}

		for (int i = 0;i < keyslist.length;i++)
		{
			System.out.println("Studetn " + keyslist[i][0] + "'s correct count  is " + 
				keyslist[i][1]);
		}
	}
}

class Work_4
{
	public static void main(String[] args)
	{
		int[][] workhours = {
			{2,4,3,4,5,8,8},
			{7,3,4,3,3,4,4},
			{3,3,4,3,3,2,2},
			{9,3,4,7,3,4,1},
			{3,5,4,3,6,3,8},
			{3,4,4,6,3,4,4},
			{3,7,4,8,3,8,4},
			{6,3,5,9,2,7,9}};
		int[][] total = new int[workhours.length][2];
		for (int i = 0;i < workhours.length;i++)
		{
			total[i][0] = i;
			for (int j = 0;j < workhours[i].length;j++)
				total[i][1]+= workhours[i][j];
		}


		for (int i = 0;i < total.length;i++)
		{
			int[] max = total[i];
			int maxIndex = i;
			for (int j = i + 1; j < total.length;j++)
			{
				if (max[1] < total[j][1])
				{
					max = total[j];
					maxIndex = j;
				}
			}
			if (maxIndex != i)
			{
				total[maxIndex] = total[i];
				total[i] = max;
			}
		}
		for (int i = 0;i < total.length;i++)
		{
			System.out.println("Employee " + total[i][0] + " works " + total[i][1] + " hours a week");
		}

	}
}
class Work_5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter matrix1: ");
		double[][] matrix1 = new double[3][3];

		for (int i = 0;i < matrix1.length;i++)
			for (int j = 0;j < matrix1[i].length;j++)
			{
				matrix1[i][j] = input.nextDouble();
			}

		System.out.print("Enter matrix2: ");
		double[][] matrix2 = new double[3][3];
		for (int i = 0;i < matrix2.length;i++)
			for (int j = 0;j < matrix2[i].length;j++)
			{
				matrix2[i][j] = input.nextDouble();
			}
		double[][] matrix = addMatrix(matrix1,matrix2);
		System.out.println();

		for (int i = 0;i < matrix.length;i++)
		{
			for (int j = 0;j<matrix1[i].length;j++)
			{
				System.out.print(matrix1[i][j] + " ");
			}

			if (i == 1)
				System.out.print(" " + "+"+ " ");
			else
				System.out.print(" " + " " + " ");
			for (int j = 0;j<matrix2[i].length;j++)
			{
				System.out.print(matrix2[i][j] + " ");
			}
			if (i == 1)
				System.out.print(" " + "="+ " ");
			else
				System.out.print(" " + " " + " ");
			for (int j = 0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}
	public static double[][] addMatrix(double[][] a,double[][] b)
	{
		double[][] c = new double[a.length][a[0].length];

		for (int i = 0; i < c.length;i++)
		{
			for (int j = 0; j < c[i].length;j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		return c;
	}
}

class Work_6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter matrix1: ");
		double[][] matrix1 = new double[3][3];

		for (int i = 0;i < matrix1.length;i++)
		{
			for (int j = 0; j < matrix1[i].length;j++)
			{
				matrix1[i][j] = input.nextDouble();
			}
		}
		
		System.out.print("Enter matrix2: ");
		double[][] matrix2 = new double[3][3];

		for (int i = 0;i < matrix2.length;i++)
		{
			for (int j = 0; j < matrix2[i].length;j++)
			{
				matrix2[i][j] = input.nextDouble();
			}
		}
		double[][] matrix = multiplyMatrix(matrix1,matrix2);
		for (int i = 0;i < matrix.length;i++)
		{
			for (int j = 0;j<matrix1[i].length;j++)
			{
				System.out.print(matrix1[i][j] + " ");
			}

			if (i == 1)
				System.out.print(" " + "*"+ " ");
			else
				System.out.print(" " + " " + " ");
			for (int j = 0;j<matrix2[i].length;j++)
			{
				System.out.print(matrix2[i][j] + " ");
			}
			if (i == 1)
				System.out.print(" " + "="+ " ");
			else
				System.out.print(" " + " " + " ");
			for (int j = 0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static double[][] multiplyMatrix(double[][] a, double[][]b)
	{
		double[][] multiply = new double[a.length][a[0].length];

		for (int i = 0;i < multiply.length;i++)
			for (int j = 0;j < multiply[i].length;j++)
			{	
				double sum = 0;
				for (int z = 0;z < 3;z++)
				{
					sum += a[i][z] * b[z][j];
				}
				multiply[i][j] = sum;
			}
		return multiply;
	}
}
class Work_7{
	public static void main(String[] args)
	{
	double[][] points = {{-1,0,3},{-1,-1,-1},{4,1,1},{2,0.5,9},
								 {3.5,2,-1},{3,1.5,3},{-1.5,4,2},{5.5,4,-0.5}};

		int p1 = 0,p2 = 1;
		double shortestDistance = distance(points[p1][0],points[p1][1],points[p1][2],
			points[p2][0],points[p2][1],points[p2][2]);

		for (int i = 0;i < points.length;i++){
			for (int j = i + 1;j < points.length;j++){
				double distance = distance(points[i][0],points[i][1],points[i][2],
					points[j][0],points[j][1],points[j][2]);
				if (shortestDistance < distance)
				{
					p1 = i;
					p2 = j;
					shortestDistance = distance;
				}
			}
		}

		System.out.println("The closet two points are" + 
			"(" + points[p1][0] +", " + points[p1][1] + ", "+ points[p1][2] + ") adn (" +
			points[p2][0] + ", " + points[p2][1] + ", "+ points[p2][2] + ")");
	}
	public static double distance(
		double x1,double y1,double z1,double x2,double y2,double z2){
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
	}
}
class Work_8
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		int numberOfPoints = input.nextInt();

		double[][] points = new double[numberOfPoints][2];
		System.out.print("Enter " + numberOfPoints  + " points: ");
		for (int i = 0; i < points.length;i++)
		{
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}

		int p1 = 0,p2 = 1;
		double shortestDistance = distance(points[p1][0],points[p1][1],
			points[p2][0],points[p2][1]);
		double[][] coordinates = generate(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);
		for (int i = 0;i < points.length;i++){
			for (int j = i + 1;j < points.length;j++)
			{
				double distance = distance(points[i][0],points[i][1],
					points[j][0],points[j][1]);
				if (shortestDistance > distance)
				{
					p1 = i;
					p2 = j;
					shortestDistance = distance;
					coordinates = generate(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);
				}
				else if (shortestDistance == distance)
				{	if (j != 1)
						coordinates = addCoordinates(coordinates,points[i][0],points[i][1],points[j][0],points[j][1]);
				}

			}
		}
		for (int i = 0; i < coordinates.length;i++)
			System.out.printf("The closest two points are (%.1f, %.1f) and (%.1f, %.1f)\n",coordinates[i][0],coordinates[i][1],coordinates[i][2],coordinates[i][3]);
	}
	public static double[][] generate(double x1,double y1,double x2,double y2)
	{
		double[][] list = {{x1,y1,x2,y2}};
		return list;
	}
	public static double[][] addCoordinates(double[][] list,
		double x1,double y1,double x2,double y2)
	{
		double[][] list1 = new double[list.length + 1][list[0].length];
		for (int i = 0;i < list.length;i++)
		{
			for (int j = 0;j < list[0].length;j++)
			{
				list1[i][j] = list[i][j];
			}
		}
		int n = list.length;
		list1[n][0] = x1;
		list1[n][1] = y1;
		list1[n][2] = x2;
		list1[n][3] = y2;
		return list1;

	}
	public static double distance(
		double x1,double y1,double x2,double y2){
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}

class Work_9
{
	public static void main(String[] args)
	{
		play();
	}
	public static void play()
	{
		int[][] checkerboard = new int[3][3];
		int chess = 0;
		printChessboard(checkerboard);
		while(true)
		{
			writePieces(checkerboard,chess);
			printChessboard(checkerboard);
			if(isvictory(checkerboard))
				break;
			else
				chess++;

		}
		if (chess % 2 == 0)
			System.out.println("X player won");
		else
			System.out.println("O player won");
	}
	public static void printChessboard(int[][] list)
	{
		for (int i = 0; i < list.length;i++)
		{
			System.out.println("-------------");
			for (int j = 0; j < list[i].length;j++)
			{
				System.out.print("| ");
				if (list[i][j] == 1)
					System.out.print("X");
				else if (list[i][j] == 2)
					System.out.print("O");
				else
					System.out.print(" ");
				System.out.print(" ");
			}
			System.out.println("|");
		}
		System.out.println("-------------");
	}
	public static void writePieces(int[][] list,int number)
	{
		Scanner input = new Scanner(System.in);

		if (number % 2 == 0)
		{
			System.out.print("Enter a row (0, 1, or2) for player X: ");
			int p1 = input.nextInt();
			System.out.print("Enter a column (0, 1, or2) for player X: ");
			int p2 = input.nextInt();
			list[p1][p2] = 1;
		}
		else
		{
			System.out.print("Enter a row (0, 1, or2) for player O: ");
			int p1 = input.nextInt();
			System.out.print("Enter a column (0, 1, or2) for player O: ");
			int p2 = input.nextInt();
			list[p1][p2] = 2;
		}

	}
	public static boolean isvictory(int[][] list)
	{
		for (int i = 0;i < list.length;i++)
		{
			if (list[i][0] != 0 && list[i][1] != 0 && list[i][2] != 0
			 && list[i][0] == list[i][1] && list[i][0] == list[i][2] && list[i][1] == list[i][2])
				return true;
			if (list[0][i] != 0 && list[1][i] != 0 && list[2][i] != 0
			 && list[0][i] == list[1][i] && list[0][i] == list[2][i] && list[1][i] == list[2][i])
				return true;
		}
		if (list[0][0] != 0 && list[1][1] != 0 && list[2][2] != 0
		 && list[0][0] == list[1][1] && list[0][0] == list[2][2] && list[1][1] == list[2][2])
			return true;
		if (list[0][2] != 0 && list[1][1] != 0 && list[2][0] != 0
		 && list[0][2] == list[1][1] && list[0][2] == list[2][0] && list[1][1] == list[2][0])
			return true;
		return false;
	}

}

class Work_10
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[][] number = new int[4][4];

		for (int i = 0;i < number.length;i++)
		{
			for (int j = 0;j < number[i].length;j++)
			{
				number[i][j] = input.nextInt();
			}
		}

		int row = 0;
		int column = 0;
		for (int i = 0;i < number.length;i++)
		{
			for (int j = 0;j < number[i].length;j++)
			{
				if (number[i][j]==1)

			}
		}

	}
}