import java.util.Scanner;

class Work_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int n = input.nextInt();
		int[] scores = new int[n];

		System.out.print("Enter 4 scores: ");
		for (int i = 0;i < n; i++)
		{
			scores[i] = input.nextInt();
		}
		int best = scoreMax(scores);
		for (int i =0; i < scores.length;i++)
		{
			char rating = performanceRating(scores[i],best);
			System.out.printf("Student %d score is %d and grade is %c \n",i,scores[i],rating);
		}

	}

	public static int scoreMax(int[] scores)
	{
		int max = scores[0];
		for (int i = 0;i < scores.length;i++)
		{
			if (scores[i] > max)
				max = scores[i];
		}
		return max;
	}
	public static char performanceRating(int score,int best)
	{
		if (score >= best - 10)
			return 'A';
		else if (score >= best - 20)
			return 'B';
		else if (score >= best - 30)
			return 'C';
		else if (score >= best - 40)
			return 'D';
		else
			return 'F';
	}
}

class Work_2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[10];
		System.out.print("Enter 10 integers: ");

		for (int i = 0;i < 10;i++)
		{
			numbers[i] = input.nextInt();
		}
		for (int i = numbers.length - 1;i >= 0;i--)
		{
			System.out.println(numbers[i] + " ");
		}

	}

}

class Work_3
{
	public static void main(String[] args)
	{
		
		System.out.print("Enter the integers between 1 and 100: ");

		int[] numbers = input_numbers();
		int[] groups = groups_number(numbers);
		for (int i=0;i < groups.length;i++)
		{
			if (groups[i] > 0)
			{
				if (groups[i] == 1)
					System.out.printf("%d occurs %d time\n",i,groups[i]);
				else
					System.out.printf("%d occurs %d times\n",i,groups[i]);
			}
		}
	}

	public static int[] input_numbers()
	{
		Scanner scanner = new Scanner(System.in);
	    int[] num = new int[100];
	    int i = 0;
	    int input;
	    while (i >= 0) 
	    {
	        input = scanner.nextInt();
	        if (input != 0) 
	        {
	            num[i] = input;
	            i++;
	        } 
	        else 
	            break;
	    }
	    return num;
	}
	public static int[] groups_number(int[] numbers)
	{
		int[] groups = new int[101];

		for (int i = 0; i < numbers.length;i++)
		{
			if (numbers[i] > 0)
			{
				groups[numbers[i]]++;
			}
		}
		return groups;
	}
}

class Work_4
{
public static void main(String[] args)
	{
		
		System.out.print("The input results: ");

		int[] numbers = input_numbers();
		int avg = 0;
		int sum = 0;
		int n = 0 ;
		for (int i=0;i < numbers.length;i++)
		{
			if (numbers[i] > 0)
			{
				sum += numbers[i];
				n++;
			}
		}
		avg = sum / n;

		int greater = 0;
		int smaller = 0;

		for (int e: numbers)
		{
			
			if (e > 0)
			{
				if (e > avg)
					greater++;
				else
					smaller++;
			}

		}
		System.out.println("greater: " + greater);
		System.out.println("smaller: " + smaller);
	}

	public static int[] input_numbers()
	{
		Scanner scanner = new Scanner(System.in);
	    int[] num = new int[100];
	    int i = 0;
	    int input;
	    while (i >= 0) 
	    {
	        input = scanner.nextInt();
	        if (input > 0) 
	        {
	            num[i] = input;
	            i++;
	        } 
	        else 
	            break;
	    }
	    return num;
	}
}

class Work_5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the numbers: ");
		int[] numbers = new int[10];
		int n = 0;
		int s = 0;
		for (int i = 0; i < numbers.length;i++)
		{
			n = input.nextInt();
			if (repeatNumber(numbers,n))
			{
				numbers[i] = n;
				s++;
			}	

		}
		System.out.println("The number of distinct number is " + s);
		System.out.print("The distinct numbers are: ");
		for (int e:numbers)
		{
			if (e > 0)
				System.out.print(" " + e);
		}
		System.out.println();
	}
	public static boolean repeatNumber(int[] numbers,int n)
	{
		for (int i = 0;i < numbers.length;i++)
		{
			if (n == numbers[i])
			{
				return false;
			}
		}
		return true;
	} 
}
class Work_6 
{
	public static void main(String[] args)
	{
		int[] numbers = new int[50];
		final int NUMBER_OF_PRIMES = 50;
		int count = 0;
		int number = 2;
		int i = 0;

		while (count < NUMBER_OF_PRIMES)
		{
			boolean isPrime = true;

			for (int divisor = 2; divisor <= Math.sqrt(number) && isPrime;divisor++)
			{
				if (number % divisor == 0)
				{
					isPrime = false;
					break;
				}

			}
			if (isPrime)
			{
				numbers[i] = number;			
				i++;
				count++;
			}

			number++;
		}
		for (int e:numbers)
		{
			System.out.print(e + " ");
		}
		System.out.println();
	}
}

class Work_7
{
	public static void main(String[] args)
	{
		int[] numbers = randomNumber(50);
		int[] number = numberOccurrences(numbers);

		for (int i = 0; i < number.length;i++)
		{
			System.out.printf("%d:%d ",i,number[i]);
		}
		System.out.println();

	}
	public static int[] randomNumber(int n)
	{
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 10);
		}
		return numbers;
	}
	public static int[] numberOccurrences(int[] numbers)
	{
		int[] number = new int[10];
		for (int i = 0; i < numbers.length;i++)
		{
			number[numbers[i]]++;
		}
		return number;
	}
}

class Work_8
{
	public static void main(String[] args)
	{
		int[] n1 = {1,3,6,7,3,2,1123,31,23,45,4,3,22};
		double[] n2 = {1.2,2.45,2.3,2.66,55.33,22.1,22.3};

		int n1_avg = average(n1);
		double n2_avg = average(n2);
		System.out.println(n1_avg);
		System.out.println(n2_avg);
	}
	public static int average(int[] array)
	{
		int avg = 0;
		int sum = 0;
		for (int i = 0;i < array.length;i++)
		{
			sum += array[i];
		}
		avg = sum / array.length;
		return avg;
	}
	public static double average(double[] array)
	{
		int avg = 0;
		int sum = 0;
		for (int i = 0;i < array.length;i++)
		{
			sum += array[i];
		}
		avg = sum / array.length;
		return avg;
	}
}

class Work_9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter ten numbers: ");
		double[] numbers = new double[10];

		for (int i = 0; i < numbers.length;i++)
		{
			numbers[i] = input.nextDouble();
		}

		sorting(numbers);
		System.out.println("The minimum number is: " + numbers[0]);
	}

	public static void sorting(double[] numbers)
	{
		for (int i = 0;i < numbers.length - 1;i++)
		{
			double min = numbers[i];
			int minIndex = i;
			for (int j = i + 1;j < numbers.length;j++)
			{
				if (min > numbers[j])
				{
					min = numbers[j];
					minIndex = j;
				}
			}
			if (minIndex != i)
			{
				numbers[minIndex] = numbers[i];
				numbers[i] = min;
			}
		}
	}
}

class Work_10
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter ten numbers: ");
		double[] numbers = new double[10];

		for (int i = 0; i < numbers.length;i++)
		{
			numbers[i] = input.nextDouble();
		}

		int minIndex =  indexOfSmallestElement(numbers);
		System.out.println("The minimum Index " + minIndex);
	}
	public static int indexOfSmallestElement(double[] array)
	{
		int minIndex = 0;

		for (int i = 1;i < array.length;i++)
		{
			if (array[minIndex] > array[i])
			{
				minIndex = i;
			}
		}
		return minIndex;
	}
}

class Work_11
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter ten numbers: ");
		double[] numbers = new double[10];
		for (int i = 0; i < numbers.length;i++)
		{
			numbers[i] = input.nextDouble();
		}
		double avg = mean(numbers);
		double dev = deviation(numbers);
		System.out.println("The mean is " + ((int)(avg * 100) / 100.0));
		System.out.printf("The standard deviation is %.5f\n",dev);
	}
	public static double deviation(double[] x)
	{	
		double sum = 0;
		double avg = mean(x);
		double stan_devl = 0;

		for (int i = 0;i < x.length;i++)
		{
			sum += (x[i] - avg) * (x[i] - avg); 
		}
		stan_devl = Math.sqrt(sum / (x.length - 1));
		return stan_devl;

	}
	public static double mean(double[] x)
	{
		double avg = 0;
		double sum = 0;

		for (int i = 0; i < x.length;i++)
		{
			sum += x[i];
		}

		avg = sum / x.length;
		return avg;
	}
}

class Work_12
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter ten numbers: ");
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length;i++)
		{
			numbers[i] = input.nextInt();
		}

		numbers = reverse(numbers);
		for (int e:numbers)
		{
			System.out.print(e + " ");	
		}
		System.out.println();
	}

	public static int[] reverse(int[] x)
	{
		int i = 0;
		int j = x.length - 1;
		while(i < x.length / 2)
		{
			int temp = x[i];
			x[i] = x[j];
			x[j] = temp;
			i++;
			j--;
		}
		return x;
	}
}

class Work_13
{
	public static void main(String[] args)
	{
		int n = getrandom(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19);
		System.out.println();
		System.out.println(n);
	}
	public static int getrandom(int... numbers)
	{
		int n = 0;
		int flag = 0;
		while(true)
		{
			flag = 0;
			n = 1 + (int)(Math.random() * 54);
			for (int e:numbers)
			{
				if (e == n)
					flag = 1;
			}
			if (flag != 1)
				break;
		}
		return n;
	}

}
class Work_14
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 5 numbers: ");
		int[] n = new int[5];

		for (int i = 0; i < n.length;i++)
		{
			n[i] = input.nextInt();
		}
		int number = gcd(n);
		System.out.println(number);
	}
	public static int gcd(int... numbers)
	{
		int n = numbers[0];
		for (int i = 1; i < numbers.length;i++)
		{
			if (n > numbers[i])
				n = numbers[i];
		}
		int conform = 0;
		boolean flag = false;
		while(true)
		{
			conform = 0;
			for (int i = 0;i<numbers.length;i++)
			{
				if (numbers[i] % n == 0)
					conform++;
				else
					break;
			}
			if (conform == numbers.length)
				break;
			else
				n--;
		}
		return n;
	}
}

class Work_15
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter ten numbers: ");
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length;i++)
		{
			numbers[i] = input.nextInt();
		}

		numbers = eliminateDuplicates(numbers);

		System.out.print("The distinct numbers: ");
		for (int i = 0;i<numbers.length;i++)
		{
			if (numbers[i] != 0)
				System.out.print(numbers[i] + " ");
		}
	}
	public static int[] eliminateDuplicates(int[] list)
	{
		int[] list2 = new int[list.length];
		int n = 0;
		boolean flag = true;
		for (int i = 0;i <  list.length;i++)
		{
			flag = true;
			for (int j = 0;j < list2.length;j++)
			{
				if (list[i] == list2[j])
					flag = false;
			}
			if (flag)
			{
				list2[n] = list[i];
				n++;
			}
		}
		return list2;
	}
}

class Work_16
{
	public static void main(String[] args)
	{
		int[] chiliadRandom = new int[100000];
		for (int i = 0;i < chiliadRandom.length;i++)
		{
			chiliadRandom[i] = (int)(Math.random() * 1000000);
		}
		long startTime = System.currentTimeMillis();
		int linear = linearSearch(chiliadRandom, 325);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("linearSearch: " + linear + " Time: " + executionTime);
		
		startTime = System.currentTimeMillis();
		selectionSort(chiliadRandom);
		int binary = binarySearch(chiliadRandom, 325);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("binarySearch: " + binary + " Time: " + executionTime);
	}
	public static int binarySearch(int[] list,int key)
	{
		int low = 0;
		int high = list.length - 1;

		while (low >= high)
		{
			int mid = (high + low) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -low - 1;
	}
	public static int linearSearch(int[] list,int key)
	{
		for (int i = 0;i < list.length; i++)
		{
			if (key == list[i])
				return i;

		}
		return -1;
	}
	public static void selectionSort(int[] list)
	{
		for (int i = 0;i < list.length - 1;i++)
		{
			int min = list[i];
			int minIndex = i;
			for (int j = i + 1; j < list.length;j++)
			{
				if (min > list[j])
				{
					min = list[j];
					minIndex = j;
				}
			}

			if (i != minIndex)
			{
				list[minIndex] = list[i];
				list[i] = min;
			}
		}
	}
}

class Work_17
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of data to be stored: ");
		int n = input.nextInt();
		System.out.print("Enter student name and grade: ");
		String[] students = new String[n];
		int[] grades = new int[n];

		for (int i = 0;i < n;i++)
		{
			students[i] = input.next();
			grades[i] = input.nextInt();
		}
		students_Sort(students,grades);
		System.out.print("Students ranking: ");
		for (int i = 0;i < n;i++)
		{
			System.out.printf("%s: %d ",students[i],grades[i]);
		}
		System.out.println();
	}

	public static void students_Sort(String[] students,int[] grades)
	{
		for (int i = 0;i < grades.length - 1;i++)
		{
			int max = grades[i];
			int maxIndex = i;
			String maxName = students[i];
			for (int j = i + 1;j < grades.length;j++)
			{
				if (max < grades[j])
				{
					max = grades[j];
					maxIndex = j;
					maxName = students[j];
				}
			}
			if (i != maxIndex)
			{
				grades[maxIndex] = grades[i];
				grades[i] = max;
				students[maxIndex] = students[i];
				students[i] = maxName; 
			}
		}
	}
}

class Work_18
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten double digits: ");
		double[] numbers = new double[10];

		for (int i = 0;i < numbers.length;i++)
		{
			numbers[i] = input.nextDouble();
		} 
		bubbling(numbers);
		for (double e: numbers)
		{
			System.out.print(e + " ");
		}
	}
	public static void bubbling(double[] x)
	{
		for (int i = 0;i < x.length;i++)
		{
			for (int j = 0;j < x.length - 1 - i;j++)
			{
				if (x[j] > x[j + 1])
				{
					double temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}

			}
		}
	}
}

class Work_19
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter list: ");
		int n = input.nextInt();
		int[] numbers = new int[n];
		for (int i = 0;i < numbers.length;i++)
		{
			numbers[i] = input.nextInt();
		}

		if (isSorted(numbers))
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");

	}

	public static boolean isSorted(int[] list)
	{
		for (int i = 0;i < list.length - 1;i++)
		{
			if (list[i] > list[i + 1])
				return false;
		}
		return true;
	}
}