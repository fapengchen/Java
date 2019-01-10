public class TestCircleWithStaticMembers{
	public static void main(String[] args){
		System.out.println("Before creating objects is " +
			CircleWithStaticMembers.numberOfObjects);
		CircleWithStaticMembers c1 = new CircleWithStaticMembers();
		System.out.println("After creating c1");
		System.out.println("C1: radius (" + c1.radius + 
			") and number of Circle objects (" + 
			c1.numberOfObjects  + ")");

		CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
		c1.radius = 9;

		System.out.println("After creating c2 and modifying c1");
		System.out.println("C1 : radius (" + c1.radius + 
			") and number of Circle objecs (" + 
			CircleWithStaticMembers.numberOfObjects+ ")");
		System.out.println("C2 : radius (" + c2.radius + 
			") and number of Circle objecs (" + 
			CircleWithStaticMembers.numberOfObjects+ ")");
	}
}