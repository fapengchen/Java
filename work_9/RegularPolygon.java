class RegularPolygon{
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	RegularPolygon(){
	}
	RegularPolygon(int n,double side){
		this(n,side,0,0);
	}
	RegularPolygon(int n,double side,double x,double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	void setN(int n){
		this.n = n;
	}
	void setSide(double side){
		this.side = side;
	}
	void setXY(double x,double y){
		this.x = x;
		this.y = y;
	}
	int getN(){
		return n;
	}
	double getSide(){
		return side;
	}
	double[] getXY(){
		double[] n = {x,y};
		return n;
	}
	double getPerimeter(){
		return n * side;
	}
	double getArea(){
		return (n * side * side) / ( 4 * Math.tan(Math.PI / n));
	}

}