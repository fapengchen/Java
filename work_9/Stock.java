public class Stock{
	String symbol;
	String name;
	double previousClosingPrice;
	double currentprice;
	Stock(String s,String n,double p){
		symbol = s;
		name = n;
		currentprice = p;
		previousClosingPrice = 0;
	}
	double getChangePercent(){
		return (previousClosingPrice != 0)?(currentprice - previousClosingPrice)/previousClosingPrice * 100:0;
	}
	void setPrice(double p){
		previousClosingPrice = currentprice;
		currentprice = p;
	}
}