import java.util.Scanner;
public class Linearequation
{
	private static double a;
	private static double b;
	private static double c;
	private static double d;
	private static double e;
	private static double f;
	public static void main(String[] args){
	//create a scanner object
      Scanner input = new Scanner(System.in);

    System.out.println("Enter X1,Y1, X2,Y2 ,X3,Y3, X4,Y4 : ");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	double x3 = input.nextDouble();
	double y3 = input.nextDouble();
	double x4 = input.nextDouble();
	double y4 = input.nextDouble();
	
	intersection(x1,y1,x2,y2,x3,y3,x4,y4);
	
	//prompt the user to enter the values
	System.out.println("Enter a,b,c,d,e,f: ");
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
	double d = input.nextDouble();
	double e = input.nextDouble();
	double f = input.nextDouble();
	
	Linearequation m = new Linearequation(a, b, c, d, e, f);
	
	System.out.println(m.geta());
	System.out.println(m.getb());
	System.out.println(m.getc());
	System.out.println(m.getd());
	System.out.println(m.gete());
	System.out.println(m.getf());
	
	double Value = getX();
	System.out.println("The value of x is:" + Value);
	
	double Value1 = getY();
	System.out.println("The value of y is:" + Value1);
	
	
	}
	
	

public  static double getY() {
		double Y = (a * f - e * c) / (a * d - b * c);
		return Y;
	}



public static double getX() {
	
	double X = (e * d - b * f) / (a * d - b * c);
	return X;
		
		
	}



public static boolean isSolvable() {
		if( a * d - b * c == 0)
			return false;
			else
				return true;
	}



public double geta() {
		
		return a;
	}

public double getb() {
	
	return b;
}

public double getc() {
	
	return c;
}

public double getd() {
	
	return d;
}

public double gete() {
	
	return e;
}

public double getf() {
	
	return f;
}




Linearequation(double a1,double b1,double c1,double d1,double e1,double f1){
	a = a1;
	b = b1;
	c = c1;
	d = d1;
	e = e1;
	f = f1;
}

	public static void intersection(double x1, double y1, double x2,
			double y2, double x3, double y3, double x4, double y4) {
		
	
		double den = (y4 - y3) * (x2 - x1) - (x4 - x3) * (y2 - y1);
		if(den == 0)
		{
			System.out.println("Lines does not intersect");
			
		}
		else
		{
			double X = ((x3 - x4) * (x1 * y2 - y1 * x2) - (x1 - x2) * (x3 * y4 - y3 * x4)) / den;
		    double Y = ((y3 - y4) * (x1 * y2 - y1 * x2) - (y1 - y2) * (x3 * y4 - y3 * x4)) / den;
			
			System.out.println("The intersection point is at " +  X  + " , " +  Y);
		}
	}

	

}
