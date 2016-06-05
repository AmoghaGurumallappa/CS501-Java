import java.util.*;
public class Cramer {

	public static void main(String[] args) {
    // get the values of a,b,c,d,e,f from the given equation 
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter  a, b, c, c, d, e and f ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		
	if ((a*d)-(b*c)==0) 
	{
		System.out.println("The equation has no solution");
	}
	else
	{
	// calculating the value of x and y by using cramer's rule
		double x= ((e*d)-(b*f))/((a*d)-(b*c));
		
		double y=(a*f-e*c)/(a*d-b*c);
	// printing the value of x and y	
		System.out.println(" x is "  + x );
		System.out.println(" y is "  + y );
	}
		
	}
}
