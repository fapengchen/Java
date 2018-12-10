import java.util.Scanner;

public class PrintCalendar
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("ENter full year (e.g., 2012): ");
		int year = input.nextInt();

		System.out.print("ENter month as a number between 1 and 12: ");
		int month = input.nextInt();

		printMonth(year, month);
	}
	public static void printMonth(int year,int month)
	{
		System.out.print(month + " " + year);
	}
	public static void printMonthTitle(int year,int month)
	{}
	public static void printMonthBody(int year, int month)
	{}
	public static String getMonthName(int year)
	{
		return "January";
	}
	public static int getStartDay(int year,int month)
	{
		return 1;
	}
	public static int getTotalNumberOfDays(int year, int month)
	{
		return 10000;
	}
	public static int getNumberOfDaysInMonth(int year,int mont)
	{
		return 31;
	}
	public static boolean isLeapYear(int year)
	{
		return year % 400 ==0 || (year % 4 == 0 && year % 100 != 0);
	}


}