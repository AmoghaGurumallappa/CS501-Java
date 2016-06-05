import java.util.Scanner;


public class GPS{

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			
			double x1=33.92;
			double y1=-84.36;
			System.out.println("point atlanta in degree " + x1 + " " +y1);
		
			double x2=28.50;
			double y2=-81.50;
			System.out.println("points of orlando in degree " + x2 + " " +y2);
			
			double x3=32.05;
			double y3=-81.12;
			System.out.println("points of savannah in degree " + x3 + " " +y3);
			
			
			double x4=35.22;
			double y4=-80.84;
			System.out.println("points of charlotte in degree" + x4 + " " +y4);

			double distance1=6371.01 * Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))
					+ Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1-y2)));

			System.out.println("The distance between the two points is d1 " + distance1 + " Km ");
			
			
			double distance2=6371.01 * Math.acos(Math.sin(Math.toRadians(x2))*Math.sin(Math.toRadians(x3))
					+ Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(y2-y3)));

			
			
			
			System.out.println("The distance between the two points D2 is " + distance2 + " Km ");
			
			
			double distance3=6371.01 * Math.acos(Math.sin(Math.toRadians(x3))*Math.sin(Math.toRadians(x4))
					+ Math.cos(Math.toRadians(x3))*Math.cos(Math.toRadians(x4)) * Math.cos(Math.toRadians(y3-y4)));

			System.out.println("The distance between the two points is d3 " + distance3 + " Km ");
			
			double distance4=6371.01 * Math.acos(Math.sin(Math.toRadians(x4))*Math.sin(Math.toRadians(x1))
					+ Math.cos(Math.toRadians(x4))*Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(y4-y1)));

			System.out.println("The distance between the two points is d4 " + distance4 + " Km ");
			
			double distance5=6371.01 * Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x3))
					+ Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(y1-y3)));

			System.out.println("The distance between the two points is(diagnol) d5 " + distance5 + " Km ");
			
			double side1=distance1;
			double side2=distance2;
			double side3=distance3;
			double side4=distance4;
			double side5=distance5;
		// area of first triangle	
			double s=(side1+side2+side5)/2;
		
			double area1= Math.pow((s*(s-side1)* (s-side2)*(s-side5)), 0.5);
			
			System.out.println("the area of one triangle is " + area1);
		// to find area of second triangle	
            double A=(side3+side4+side5)/2;
			
			double area2= Math.pow((A*(A-side3)* (A-side4)*(A-side5)), 0.5);
			
			System.out.println("the area of second triangle is " + area2);
			
			double Totalarea= area1+ area2;
			
			System.out.println(" The total area of all 4 region is " + Totalarea);
				
	}}
	
