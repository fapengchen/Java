
import java.util.Scanner;
import java.util.Arrays;

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
		System.out.println("Enter a 4-by-4 matrix :");
		for (int i = 0;i < number.length;i++)
		{
			for (int j = 0;j < number[i].length;j++)
			{
				number[i][j] = input.nextInt();
			}
		}

		int row = 0;
		int column = 0;
		int max_n1 = 0;
		int max_n2 = 0;
		for (int i = 0;i < number.length;i++)
		{
			int n1 = 0;
			int n2 = 0;
			for (int j = 0;j < number[i].length;j++)
			{
				if (number[i][j] == 1)
					n1++;
				if (number[j][i] == 1)
					n2++;
			}
			if (n1 > max_n1)
			{
				row = i;
				max_n1 = n1;
			}
			if (n2 > max_n2)
			{
				column = i;
				max_n2 = n2;
			} 
		}
		System.out.println("The largest row index: " + row);
		System.out.println("The largest column index: " + column);

	}
}

class Work_11
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511: ");
		int n = input.nextInt();
		int[][] list = new int[3][3];
		int a = 0;
		int i = list.length-1;
		int j = list[0].length-1;
		while(n > 0)
		{
			a = n % 2;
			n = n / 2;
			list[i][j] = a;
			j--;
			if (j == -1)
			{
				i--;
				j = list[0].length-1;
			}
		}

		for (i = 0;i < list.length;i++)
		{
			for (j = 0;j < list[i].length;j++)
			{
				if (list[i][j] == 0)
					System.out.print("H ");
				else
					System.out.print("T ");
			}
			System.out.println();
		}

	}

}

class Work_12
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double[] rates = {0.10, 0.15, 0.25,0.28,0.33,0.35};
		int[][] brackets = {
			{8350,33950,82250,171550,372950},
			{16700,67900,137050,20885,372950},
			{8350,33950,6825,104425,186475},
			{11950,45500,117450,190200,372950}
		};
		System.out.print("Enter 0 minus 5: ");
		int n = input.nextInt();
		System.out.print("Enter a year's salary: ");
		int wage = input.nextInt(); 
		double sum = 0;
		if (wage < brackets[n][0])
			sum = wage * rates[0];
		else 
		{
			sum = brackets[n][0] * rates[0];
			for (int i = 1;i < brackets[n].length;i++)
				if (wage > brackets[n][i])
					sum += (brackets[n][i] - brackets[n][i-1]) * rates[i];
				else 
				{
					sum += (wage - brackets[n][i-1]) * rates[i + 1];
					break;
				}
		}

		if (wage > brackets[n][4])
			sum += (wage - brackets[n][4]) * rates[5];
		System.out.println(sum);


	}
}

class Work_13
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of rows and columns of the array: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();

		double[][] list = new double[n1][n2];
		for (int i = 0; i < list.length;i++)
			for (int j = 0; j < list[i].length;j++)
			{
				list[i][j] = input.nextDouble();
			}
		int[] index = locateLargest(list);
		System.out.println("The location of the largest element is at (" + index[0]+", " + index[1]+")");
	}
	public static int[] locateLargest(double[][] a)
	{
		int[] maxIndex = new int[2];
		double max = a[0][0];
		int max_i = 0;
		int max_j = 0;
		for (int i = 0;i < a.length;i++)
		{
			for(int j = 0;j < a[i].length;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					max_i = i;
					max_j = j;
				}
			}			
		}
		maxIndex[0] = max_i;
		maxIndex[1] = max_j; 

		return maxIndex;
	}
}

class Work_14
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size for the matrix: ");
		int n = input.nextInt();

		int[][] list = new int[n][n];

		for (int i = 0;i < list.length;i++)
		{
			for (int j = 0;j < list[i].length;j++)
			{
				list[i][j] = input.nextInt();
			}
		}
		row(list);
		column(list);
		if (diagonal(list))
			System.out.println("We have the same number on the main diagonal");
		else
			System.out.println("No same numbers on the major diagonal");

		if (subDiaqonal(list))
			System.out.println("We have the same number on the main sub-diaqonal");
		else
			System.out.println("No same numbers on the sub-diaqonal");
	}

	public static void row(int[][] list)
	{
		boolean isRepeat = false;
		int n = list[0].length;
		for (int i = 0;i < list.length;i++)
		{
			int sum = 0;
			int add = list[i][0];
			for (int j = 0;j < list[i].length;j++)
			{
				if (add == list[i][j])
				{
					sum++;
				}
			}
			if (sum == n)
			{
				System.out.printf("All %d on row %d\n",add,i);
				isRepeat = true;
			}
		}
		if (!isRepeat)
			System.out.println("No same numbers on a row");
	}
	public static void column(int[][] list)
	{
		boolean isRepeat = false;
		int n = list.length;
		for (int i = 0;i < list.length;i++)
		{
			int sum = 0;
			int add = list[0][i];
			for (int j = 0;j < list[i].length;j++)
			{
				if (add == list[j][i])
				{
					sum++;
				}
			}
			if (sum == n)
			{
				System.out.printf("All %d on column %d\t",add,i);
				isRepeat = true;
			}
		}
		if (!isRepeat)
			System.out.println("No same numbers on a column");
	}
	public static boolean diagonal(int[][] list)
	{
		int add = list[0][0];
		for (int i = 0; i < list.length;i++)
		{
			if (add != list[i][i])
				return false;
		}
		return true;
	}
	public static boolean subDiaqonal(int[][] list)
	{
		int add = list[0][list[0].length - 1];
		for (int i = 0; i < list.length;i++)
		{
			if (add != list[i][list.length - 1 - i])
				return false;
		}
		return true;

	}
}


class Work_15
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter five points: ");
		double[][] list = new double[5][2];
		for (int i = 0; i < list.length;i++)
		{
			for (int j = 0;j < list[i].length;j++)
			{
				list[i][j] = input.nextDouble();
			}
		}
		if (sameLine(list))
			System.out.println("The five points are the same line");
		else
			System.out.println("The five points are not on the same line");
	}
	public static boolean sameLine(double[][] points)
	{
		for (int i =0;i <= points[0].length;i++)
		{
			for (int j = i + 1;j < points.length - 1;j++)
			{
				for (int z = j + 1;z < points.length;z++){
					{
						System.out.println(i+" " + j + " " + z);
						if (!onTheLineSegement(points[i][0],points[i][1],
							points[j][0],points[j][1],points[z][0],points[z][1]))
							return false;
					}
				}
			}
		}
		return true;
	}
	public static boolean onTheLineSegement(double x0,double y0,
		double x1,double y1,double x2,double y2)
	{
		double add = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		return add == 0;
	}

}

class Work_16
{
	public static void main(String[] args)
	{
		int[][] list = {{4,2},{1,7},{1,2},{1,1},{4,1}};
		sort(list);
	}
	public static void sort(int m[][])
	{

		for (int i = 0;i < m.length - 1;i++)
		{
			int[] minlist = m[i];
			int minIndex = i;
			for (int j = i + 1;j < m.length;j++)
			{
				if (m[j][0] < minlist[0])
				{
					minlist = m[j];
					minIndex = j;
				}
				else if (m[j][0] == minlist[0] && 
					m[j][1] < minlist[1])
				{
						minlist = m[j];
						minIndex = j;
				}

			}
			if (minIndex != i)
			{
				m[minIndex] = m[i];
				m[i] = minlist;
			}
		} 

		System.out.print("{");
		for (int[] e:m)
		{
			System.out.print(Arrays.toString(e));
		} 
		System.out.print("}\n");
	}
}
class Work_17
{
	public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);

			int n = input.nextInt();
			double limit = input.nextDouble();
			double[][] borrower = new double[n][n];
			double[] balance = new double[n];
			double[] total = new double[n];
			boolean[] mark = new boolean[n];
			
			for(int i = 0; i < n; ++i) Arrays.fill(borrower[i], 0.0);
			for(int i = 0; i < n; ++i){
				balance[i] = input.nextDouble();
				int cnt = input.nextInt();
				for(int j = 0; j < cnt; ++j){
					int index = input.nextInt();
					borrower[i][index] = input.nextDouble();
				}
			}


			for (int i = 0;i < n;++i)
			{
				total[i] = balance[i];
				for (int j = 0;j < n;++j)
				{
					total[i] += borrower[i][j];
				}
			}
			Arrays.fill(mark,true);

			System.out.println(Arrays.toString(borrower[3]));
			for (int i = 0;i < n;i++)
			{
				if (total[i] < limit && mark[i])
				{
					mark[i] = false;
					for (int j = 0;j < n;j++)
					{
						System.out.println(borrower[j][i]);
						borrower[j][i] = 0;

					}
					System.out.println();	

					for(int v = 0; v < n; ++v)
					{
						total[v] = balance[v];
						for(int j = 0; j < n; ++j)
						{
							total[v] += borrower[v][j];
						}
					}
					i = -1;
				}		
			}

			for (int i = 0;i < n;i++)
			{
				if (!mark[i])
					System.out.print(i + " ");
			}
		}
}

class Work_18
{
	public static void main(String[] args)
	{
		int[][] m = {{1,2},{3,4},{5,6},{7,8},{9,10}};
		shuffle(m);
		for (int[] e:m)
		{
			System.out.print(Arrays.toString(e));
		}
		System.out.println();
	}
	public static void shuffle(int[][] m)
	{
		for (int i = 0;i < m.length;i++)
		{
			for (int j = 0;j < m[i].length;j++)
			{
				int iIndex = (int)(Math.random() * m.length);
				int jIndex = (int)(Math.random() * m[i].length);
				int temp = m[i][j];
				m[i][j] = m[iIndex][jIndex];
				m[iIndex][jIndex] = temp;
			}
		}
	}
}
class Work_19
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int[][] list = new int[6][7];

		for (int i = 0; i < list.length;i++)
		{
			for (int j = 0; j < list[i].length;j++)
			{
				list[i][j] = input.nextInt();
			}
		}
		if (isConsecutiveFour(list))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static boolean isConsecutiveFour(int[][] values)
	{
		for (int i = 0; i < values.length;i++)
		{
			for (int j = 0;j < values.length - 3;j++)
			{
				if (isSame(values[i][j],values[i][j + 1],values[i][j + 2],values[i][j + 3]))
					return true;
			}
		}
		for (int i = 0; i < values.length;i++)
		{
			for (int j = 0;j < values.length - 3;j++)
			{
				if (isSame(values[j][i],values[j + 1][i],values[j + 2][i],values[j + 3][i]))
					return true;
			}
		}
		for (int i = 0; i < values.length - 3;i++)
		{
			for (int j = 0;j < values.length - 3;j++)
			{
				if (isSame(values[i][j],values[i + 1] [j + 1],values[i + 2][i + 2],values[i + 3][j + 3]))
					return true;
			}
		}
		for (int i = 0; i < values.length - 3;i++)
		{
			for (int j = values.length - 1;j > 3;j--)
			{
				if (isSame(values[i][j],values[i + 1] [j - 1],values[i + 2][i - 2],values[i + 3][j - 3]))
					return true;
			}
		}
		for (int i = values.length - 1; i > 3;i--)
		{
			for (int j = 0;j < values.length - 3;j++)
			{
				if (isSame(values[i][j],values[i - 1] [j - 1],values[i - 2][i - 2],values[i - 3][j - 3]))
					return true;
			}
		}
		return false;
	}
	public static boolean isSame(int n1,int n2,int n3,int n4)
	{
		return n1 == n2 && n1 == n3 && n1 == n4
			&& n2 == n3 && n2 == n4 && n3 == n4;
	}
}

class Work_20
{
	public static void main(String[] args)
	{
		play();
	}
	public static void play()
	{
		Scanner input = new Scanner(System.in); 
		int[][] pieces = new int[6][7];
		int[] columns = new int[7];
		int n = 0;
		int value;
		do
		{
			printBoard(pieces);
			if (n % 2 == 0){
				System.out.print("Drop a red disk at column (0-6): ");
				value = 1;
			}
			else{
				System.out.print("Drop a yellow disk at column (0-6): ");
				value = 2;
			}
			int index = input.nextInt();
			int i = columns[index];
			pieces[i][index] = value;
			columns[index]++;
			if (isFinish(pieces))
				break;
			else if (isFull(columns))
				System.exit(0);
			n++;
		}while(true);
			printBoard(pieces);
		if (n % 2 == 1)
			System.out.println("The yellow player won");
		else
			System.out.println("The yellow player won");
	}
	public static boolean isFull(int[] list)
	{
		int n = 0;
		for (int i = 0; i < list.length;i++)
		{
			if (list[i] != 6)
				return false;
			n++;
		}
		if (n == 7)
			return true;
		return false;

	}
	public static void printBoard(int[][] list)
	{
		for (int i = list.length - 1;i >= 0;i--)
		{
			for (int j = 0;j < list[i].length;j++)
			{
				System.out.print("|");
				if (list[i][j] == 1)
					System.out.print("R");
				else if (list[i][j] == 2)
					System.out.print("Y");
				else
					System.out.print(" ");
			}
			System.out.print("|\n");
		}
		System.out.println("------------------");
	}
	public static boolean isFull(int[][] list)
	{
		for (int i = 0;i < list.length;i++)
		{
			for (int j = 0;j < list[i].length;j++)
			{
				if (list[i][j] == 0)
					return false;
			}
		}

		return true;
	}
	public static boolean isFinish(int[][] list)
	{

		for (int i = 0;i < list.length;i++)
		{
			for (int j = 0;j < list.length - 3;j++)
			{

				if (list[i][j] != 0)
				{
					if (isSame(list[i][j], list[i][j + 1],list[i][j + 2],list[i][j + 3]))
					{
						return true;
					}
				}
			}
		}
		for (int i = 0;i < list.length -3;i++)
		{
			for (int j = 0;j < list.length ;j++)
			{
				if (list[i][j] != 0)
				{
					if (isSame(list[i][j], list[i + 1][j],list[i + 2][j],list[i + 3][j])){
						return true;
					}
				}
			}
		}
		for (int i = 0;i < list.length - 3;i++)
		{
			for (int j = 0;j < list.length - 3;j++)
			{
				if (list[i][j] != 0)
				{
					if (isSame(list[i][j], list[i + 1][j + 1],list[i + 2][j + 2],list[i + 3][j + 3]))
						return true;
				}
			}
		}
		for (int i = list.length - 1;i > 3;i--)
		{
			for (int j = 0;j < list.length - 3;j++)
			{
				if (list[i][j] != 0)
				{
					if (isSame(list[i][j], list[i - 1][j + 1],list[i - 2][j + 2],list[i - 3][j + 3]))
						return true;
				}
			}
		}
		for (int i = 0;i < list.length - 3;i++)
		{
			for (int j = list.length - 1;j > 3;j--)
			{
				if (list[i][j] != 0)
				{
					if (isSame(list[i][j], list[i - 1][j + 1],list[i - 2][j + 2],list[i - 3][j + 3]))
						return true;
				}
			}
		}
		for (int i = list.length - 1;i > 3;i--)
		{
			for (int j = list.length - 1;j > 3;j--)
			{
				if (list[i][j] != 0)
				{
					if (isSame(list[i][j], list[i - 1][j - 1],list[i - 2][j - 2],list[i - 3][j - 3]))
						return true;
				}
			}
		}
		return false;
	}
	public static boolean isSame(int n1,int n2,int n3,int n4)
	{
		return n1 == n2 && n1 == n3 && n1 == n4
			&& n2 == n3 && n2 == n4 && n3 == n4;
	}

}
class Work_21
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of cities: ");
		int n = input.nextInt();

		double[][] list = new double[n][2];

		System.out.println("Enter the coordinates of the cities: ");

		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < list[i].length;j++)
			{
				list[i][j] = input.nextDouble();
			}

		}

		double[] disList = new double[n];
		for (int i = 0;i < list.length;i++)
		{
			double sum = 0;
			for (int j = 0;j < list.length;j++)
			{
				
				if (j != i)
				{
					sum += distance(list[i][0],list[i][1],list[j][0],list[j][1]);
				}
			}
			disList[i] = sum;
		}
		double min = disList[0];
		int minIndex = 0;
		for (int i = 0;i < disList.length;i++)
		{
				if (min > disList[i])
				{
					min = disList[i];
					minIndex = i;
				}
		}
		System.out.printf("The central city is at (%.1f, %.1f)\n",list[minIndex][0],list[minIndex][1]);
		System.out.println("The total distance to all other cities is " + min);
	}
	public static double distance(double x1,double y1,double x2,double y2)
	{
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}

class Work_22
{
	public static void main(String[] args)
	{
		int[][] list = new int[6][6];

		for (int i = 0; i < list.length;i++)
		{
			for (int j = 0; j < list[i].length;j++)
			{
				list[i][j] = (int)(Math.random() * 2);
			}
		}
		boolean even = true;
		for (int i = 0; i < list.length;i++)
		{
			int row = 0;
			int line = 0; 
			for (int j = 0; j < list[i].length;j++)
			{
				System.out.print(list[i][j] + " ");
				if (list[i][j] == 1)
					row++;
				if (list[j][i] == 1)
					line++;
			}
			System.out.println();
			if (row % 2 == 1 || line % 2 == 1)
				even = false;
		}
		if (even)
			System.out.println("This matrix has an even number of ones per row and column");
		else
			System.out.println("This matrix does not have an even number of ones per row and column");

	}
}

class Work_23
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 6-by-6 matrix row by row: ");

		int[][] list = new int[6][6];

		for (int i = 0;i < list.length;i++)
		{
			for (int j = 0;j< list.length;j++)
				list[i][j] = input.nextInt();
		}
		for (int i = 0;i < list.length;i++)
		{
			for (int j = 0;j < list[i].length;j++)
				if (isReversal(list,i,j))
				{
					System.out.println("The flipped cell is at " + "(" + i + ", " + j + ")");
					break;
				}
		}
	}
	public static boolean isReversal(int[][] list,int x,int y)
	{
		int n = 0;
		int m = 0;
		for (int i = 0;i < list.length;i++)
		{
			if (list[x][i] == 1)
				n++;
			if (list[i][y] == 1)
				m++;
		}
		if (n % 2 == 1)
			if (m % 2 == 1)
				return true;

		return false;
	}
}

class Work_24
{
	public static void main(String[] args)
	{

		int[][] grid = readASolution();

		System.out.println(isValid(grid)? "Valid solution ":
			"Invalid solution");

	}
	public static int[][] readASolution(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Sudoku puzzle solution: ");
		int[][] grid = new int[9][9];
		for (int i = 0;i < 9;i++)
			for (int j = 0; j < 9; j++)
				grid[i][j] = input.nextInt();
		return grid;
	}

	public static boolean isValid(int[][] grid){
		for (int i = 0; i < 9;i++)
		{
			for (int j = 0;j < 9;j++){
				int n = 0;
				int m = 0;
				int x = 0;
				for (int z = 1;z <= 9;z++){
					int row = 0;
					int col = 0;
					if (z == grid[i][j])
						n++;
					if (z == grid[j][i])
						m++;
					if (z == grid[j / 3 * 3 + row][i / 3 * 3 + col]){
						x++;
						col++;
					}
					if (col > 4){
						row++;
						col = 0;
					}
				}
				if (n == 0)
					return false;
				if (m == 0)
					return false;
				if (x == 0)
					return false;
			}
		}
		return true;
	}

}

class Work_25
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 3-by-3 matrix row by row: ");
		double[][] list = new double[3][3];

		for (int i = 0;i < 3;i++)
		{
			for (int j = 0; j < 3;j++)
			{
				list[i][j] = input.nextDouble();
			}
		}

		if (isMarkovMatrix(list))
			System.out.println("It is a Markov matrix");
		else
			System.out.println("It is not a Markov matrix");
	}
	public static boolean isMarkovMatrix(double[][] m)
	{
		for (int i = 0;i < m.length;i++)
		{
			double sum = 0;
			for (int j = 0;j < m[i].length;j++)
			{
				if (m[j][i] < 0)
					return false;
				sum += m[j][i];
			}
			if (sum != 1)
				return false; 
		}
		return true;
	}
}

class Work_26
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 3-by-3 matrix row by row: ");
		double[][] list = new double[3][3];

		for (int i = 0;i < 3;i++)
		{
			for (int j = 0; j < 3;j++)
			{
				list[i][j] = input.nextDouble();
			}
		}
		System.out.println("The row-sorted array is ");
		double[][] newlist = sortRows(list);
		for (double[] e: newlist)
		{
			for (double l:e){
				System.out.print(l + " ");
			}
			System.out.println();	
		}



	}

	public static double[][] sortRows(double[][] m){
		double[][] list = new double[m.length][m[0].length];
		for (int i = 0;i < m.length;i++){
			list[i][0] = Math.min(Math.min(m[i][0],m[i][1]),m[i][2]);
			list[i][1] = Math.max(Math.min(m[i][0],m[i][1]),m[i][2]);
			list[i][2] = Math.max(Math.max(m[i][0],m[i][1]),m[i][2]);
		}
		return list;
	}
}


class Work_27{
	
	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row:");
		double[][] matrix = new double[3][3];
		for(int i = 0; i < 3; ++i){
			for(int j = 0; j < 3; ++j){
				matrix[i][j] = cin.nextDouble();
			}
		}
		
		matrix = sortColumns(matrix);
		System.out.println("The row-sorted array is ");
		for(int i = 0; i < 3; ++i){
			for(int j = 0; j < 3; ++j){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static double[][] sortColumns(double[][] s){
		double[][] a = s;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int n = j + 1;
				for (int m = i;m < a.length;m++){
					for (;n < a[i].length;n++){
						if (a[i][j] > a[m][n]){
							double min = a[m][n];
							a[m][n] = a[i][j];
							a[i][j] = min;
						}
					}
					n = 0;
				}
			}
		}
		return a;
	}
}
class Work_28
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter list1: ");
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];

		for (int i = 0; i < 3;i++){
			for (int j = 0;j < 3;j++){
				m1[i][j] = input.nextInt();
			}
		}
		System.out.print("Enter list2: ");
		for (int i = 0; i < 3;i++){
			for (int j = 0;j < 3;j++){
				m2[i][j] = input.nextInt();
			}
		}
		if (equals(m1,m2))
			System.out.println("The two arrays are strictly identical");
		else
			System.out.println("The two arrays are not strictly identical");
	}
	public static boolean equals(int[][] m1,int[][] m2){
		for (int i = 0;i < m1.length;i++){
			for (int j = 0;j < m1[i].length;j++){
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}
		return true;
	}
}

class Work_29
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter list1: ");
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];

		for (int i = 0; i < 3;i++){
			for (int j = 0;j < 3;j++){
				m1[i][j] = input.nextInt();
			}
		}
		System.out.print("Enter list2: ");
		for (int i = 0; i < 3;i++){
			for (int j = 0;j < 3;j++){
				m2[i][j] = input.nextInt();
			}
		}
		if (equals(m1,m2))
			System.out.println("The two arrays are identical");
		else
			System.out.println("The two arrays are not identical");
	}
	public static boolean equals(int[][] m1,int[][] m2){
		for (int i = 0;i < m1.length;i++){
			for (int j = 0;j < m1[i].length;j++){
				if (!equal(m2,m1[i][j]))
					return false;
			}
		}
		for (int i = 0;i < m1.length;i++){
			for (int j = 0;j < m1[i].length;j++){
				if (!equal(m1,m2[i][j]))
					return false;
			}
		}
		return true;
	}
	public static boolean equal(int[][] m1,int number){
		for (int i = 0;i < m1.length;i++){
			for (int j = 0;j < m1[i].length;j++){
				if (m1[i][j] == number)
					return true;
			}
		}
		return false;
	}
}

class Work_30
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a, b, c, d, e, f: ");
		double[][] a = new double[2][2];

		for (int i = 0;i<a.length;i++){
			a[i][0] = input.nextDouble();
			a[i][1] = input.nextDouble();
		}
		double[] b = new double[2];
		b[0] = input.nextDouble();
		b[1] = input.nextDouble();

		double[] list = linearEquation(a,b);
		for (double e: list)
		{
			System.out.print(e + " ");
		}
	}
	public static double[] linearEquation(double[][] a, double[] b)
	{
		double[] list = new double[2];
		if ((a[0][0] * a[1][1] - a[0][1] * a[1][0]) == 0){
			return null;
		}
		list[0] = (b[0] * a[1][1] - b[1] * a[0][1])
				/ (a[0][0] * a[1][1] - a[0][1] * a[1][1]);
		list[1] = (b[1] * a[0][0] - b[0] * a[1][0])
				/ (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
		
		return list;
	}
}
class Work_31
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a, b, c, d, e, f: ");
		double[][] a = new double[4][2];

		for (int i = 0;i<a.length;i++){
			a[i][0] = input.nextDouble();
			a[i][1] = input.nextDouble();
		}

		double[] list = getintersectingPoint(a);
		for (double e: list)
		{
			System.out.print(e + " ");
		}
	}
	public static double[] getintersectingPoint(double[][] points)
	{
		double[] list = new double[2];
		double x1 = points[0][0];
		double y1 = points[0][1];
		double x2 = points[1][0];
		double y2 = points[1][1];
		double x3 = points[2][0];
		double y3 = points[2][1];
		double x4 = points[3][0];
		double y4 = points[3][1];
		double a = (y1 - y2);
		double b = -(x1 - x2);
		double c = (y3 - y4);
		double d = -(x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;

		if ((a * d - b * c) == 0)
		{
			return null;
		}

		list[0] = (e * d - b * f ) / (a * d - b * c);
		list[1] = (a * f - e * c ) / (a * d - b * c);
		return list;
 	}
}


class Work_32
{
	public static void main(String[] args){

	}
	public static double getTriangleArea(doublep[][] points){
		double[] list = new double[3];

		for (int i = 0;i < list.length - 1;i++)
		{
			for (int j = i + 1;j < list.length;j++)
			{
				list[i] = getDistance(points[i][0],points[i][1],
									  points[j][0],points[j][1]);
			}
		}
		double s = 0;
		

	}
	public static double getDistance(double x1,double y1,double x2,double y2){
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}