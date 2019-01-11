import java.util.Scanner;

class Work_1{
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		System.out.printf("%s\t%s\n","Width","height");
		System.out.printf("r1:%s\t%s\n",r1.getArea(),r1.getPerimeter());
		System.out.printf("r2:%s\t%s\n",r2.getArea(),r2.getPerimeter());
	}
}
class Work_2{
	public static void main(String[] args){
		Stock s = new Stock("ORCL","Oracle Corporation",34.5);
		System.out.printf("%s %s %s %.2f%%\n",s.symbol,s.name,s.currentprice,s.getChangePercent());
		s.setPrice(34.35);
		System.out.printf("%s %s %s %.2f%%\n",s.symbol,s.name,s.currentprice,s.getChangePercent());
	}
}