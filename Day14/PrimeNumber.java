public class PrimeNumber 
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_PRIMES = 50;
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0;
		int number = 2;

		while (count < NUMBER_OF_PRIMES)
		{
			boolean isPrime = true;

			for (int divisor = 2; divisor <= number/2 && isPrime;divisor++)
			{
				if (number % divisor == 0)
				{
					isPrime = false;
				}

			}
			if (isPrime)
			{
				count++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
					System.out.printf("%3d\n",number);
				else
					System.out.printf("%3d   ",number);
			}

			number++;
		}
	}
}