import java.util.Scanner;

public class Triangle {

    public static void main (String [] args) {
    	double x1=0;
    	double y1=0;
    	double x2=0;
    	double y2=100;
    	double x3=200;
    	double y3=0;
    	
     
        System.out.print("Enter a point's x- and y-coordinates: ");
       
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        
        
        double ABC = Math.abs (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        double ABP = Math.abs (x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2));
        double APC = Math.abs (x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y));
        double PBC = Math.abs (x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2));

        boolean isInTriangle = ABP + APC + PBC == ABC;
if(isInTriangle)
 
//  OR
	 // we can use 
	
	  //  if( (y >= 0) && (x >= 0) && (x + 2*y <= 200) )
	
	// instead of calculating area 	
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");
    }
}