
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
