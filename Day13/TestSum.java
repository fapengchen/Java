public class TestSum
{
	public static void main(String[] args)
	{
		double sum = 0;
		double currentvalue = 1.0;
		for (int count =0;count < 100; count++)
		{
			sum += currentvalue;
			currentvalue -= 0.01;
		}

		System.out.println("The sum is " + sum);
	}
}