import java.util.Scanner;

public class Hex2Dec
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();

		System.out.println("The decimal value for hex number "
			+ hex + " is " + hexToDecimal(hex.toUpperCase()));
	}
	public static int hexToDecimal(String hex)
	{
		int decimalvalue = 0;
		for (int i = 0;i < hex.length(); i++)
		{
			char hexChar = hex.charAt(i);
			decimalvalue = decimalvalue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalvalue;
	}
	public static int hexCharToDecimal(char ch)
	{
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}
}