import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter point 1 in degree");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		
		System.out.println("Enter point 2 in degree");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		
		double d=6371.01 * Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))
				+ Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1-y2)));
       
		System.out.println("The distance between the two points is " + d + " Km ");
	
	}

}
