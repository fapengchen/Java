import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = input.nextLine();

		int low = 0;

		int high = s.length() - 1;

		boolean Palindrome = true;

		while (low < high)
		{
			if (s.charAt(low) != s.charAt(high))
			{	
				Palindrome = false;
				break;
			}
			low++;
			high--;
		}

		System.out.println(Palindrome?
			s + " is a palindrome":s + " is not a palindrome");
	}
}