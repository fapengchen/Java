import java.util.Scanner;

public class  ComputeTax
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.print("0-single filer, 1-married jointly or " + 
			"qualifying widow(er), 2-married spearately,3- head of" +
			"household) Enter the filing status: ");
		int status = input.nextInt();

		System.out.println("Enter the taxble income: ");
		double income = input.nextDouble();

		double tax = 0;

		if (status == 0);
		{
			if (income <= 8350)
				tatx = income * 0.10;
			else if (income <= 33950)
				tatx = income * 0.10 + (income - 8350) * 0.15;
			else if (income <= 52250)
				tatx = income * 0.10 + (income - 8350) * 0.15+
				(income - 33950) * 0.25;
			else if (income <= 171550)
				tatx = income * 0.10 + (income - 8350) * 0.15 +
				(income - 33950) * 0.25 + (income - 52250) * 0.28;
			else if (income <= 372950)
				tatx = ncome * 0.10 + (income - 8350) * 0.15 +
				(income - 33950) * 0.25 + (income - 52250) * 0.28 +
				(income - 171550) * 0.33;
			else
				tatx = ncome * 0.10 + (income - 8350) * 0.15 +
				(income - 33950) * 0.25 + (income - 52250) * 0.28 +
				(income - 171550) * 0.33 + (income - 372950) * 0.35;
		}
		else if (status == 1);
		{
			if (income <= 16700)
				tatx = income * 0.10;
			else if (income <= 67900)
				tatx = income * 0.10 + (income - 16700) * 0.15;
			else if (income <= 137050)
				tatx = income * 0.10 + (income - 16700) * 0.15+
				(income - 67900) * 0.25;
			else if (income <= 208850)
				tatx = income * 0.10 + (income - 16700) * 0.15 +
				(income - 67900) * 0.25 + (income - 137050) * 0.28;
			else if (income <= 372950)
				tatx = ncome * 0.10 + (income - 16700) * 0.15 +
				(income - 67900) * 0.25 + (income - 137050) * 0.28 +
				(income - 208850) * 0.33;
			else
				tatx = ncome * 0.10 + (income - 16700) * 0.15 +
				(income - 67900) * 0.25 + (income - 137050) * 0.28 +
				(income - 208850) * 0.33 + (income - 372950) * 0.35;
		}
		else if (status == 2);
		{
			if (income <= 8350)
				tatx = income * 0.10;
			else if (income <= 33950)
				tatx = income * 0.10 + (income - 8350) * 0.15;
			else if (income <= 68525)
				tatx = income * 0.10 + (income - 8350) * 0.15+
				(income - 33950) * 0.25;
			else if (income <= 104425)
				tatx = income * 0.10 + (income - 8350) * 0.15 +
				(income - 33950) * 0.25 + (income - 68525) * 0.28;
			else if (income <= 186475)
				tatx = ncome * 0.10 + (income - 8350) * 0.15 +
				(income - 33950) * 0.25 + (income - 68525) * 0.28 +
				(income - 104425) * 0.33;
			else
				tatx = ncome * 0.10 + (income - 8350) * 0.15 +
				(income - 33950) * 0.25 + (income - 68525) * 0.28 +
				(income - 104425) * 0.33 + (income - 186475) * 0.35;
		}
		else if (status == 3);
		{
			if (income <= 8350)
				tatx = income * 0.10;
			else if (income <= 33950)
				tatx = income * 0.10 + (income - 8350) * 0.15;
			else if (income <= 68525)
				tatx = income * 0.10 + (income - 8350) * 0.15+
				(income - 33950) * 0.25;
			else if (income <= 104425)
				tatx = income * 0.10 + (income - 8350) * 0.15 +
				(income - 33950) * 0.25 + (income - 68525) * 0.28;
			else if (income <= 186475)
				tatx = ncome * 0.10 + (income - 8350) * 0.15 +
				(income - 33950) * 0.25 + (income - 68525) * 0.28 +
				(income - 104425) * 0.33;
			else
				tatx = ncome * 0.10 + (income - 8350) * 0.15 +
				(income - 33950) * 0.25 + (income - 68525) * 0.28 +
				(income - 104425) * 0.33 + (income - 186475) * 0.35;
		}
		else
		{
			if (income <= 11950)
				tatx = income * 0.10;
			else if (income <= 45500)
				tatx = income * 0.10 + (income - 11950) * 0.15;
			else if (income <= 117450)
				tatx = income * 0.10 + (income - 11950) * 0.15+
				(income - 45500) * 0.25;
			else if (income <= 190200)
				tatx = income * 0.10 + (income - 11950) * 0.15 +
				(income - 45500) * 0.25 + (income - 117450) * 0.28;
			else if (income <= 372950)
				tatx = ncome * 0.10 + (income - 11950) * 0.15 +
				(income - 45500) * 0.25 + (income - 117450) * 0.28 +
				(income - 190200) * 0.33;
			else
				tatx = ncome * 0.10 + (income - 11950) * 0.15 +
				(income - 45500) * 0.25 + (income - 117450) * 0.28 +
				(income - 190200) * 0.33 + (income - 372950) * 0.35;
		}
		System.out.println("Tax is " + (int)(tax * 100)/100.0)
	}

}