class QuadraticEquation{
	private double a;
	private double b;
	private double c;
	QuadraticEquation(double a,double b,double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	double getA(){
		return a;
	}
	double getB(){
		return b;
	}
	double getC(){
		return c;
	}
	double getDiscriminant(){
		return b * b - 4 * a * c;
	}
	double getRoot1(){
		if (this.getDiscriminant() >= 0)
			return (- b + Math.sqrt(this.getDiscriminant())) / (2 * a);
		else
			return 0;
	}
	double getRoot2(){
		if (this.getDiscriminant() >= 0)
			return (- b - Math.sqrt(this.getDiscriminant())) / (2 * a);
		else
			return 0;
	}
}