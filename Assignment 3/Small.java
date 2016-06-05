import java.util.*;
	public class Small {
		
public static void main(String[] args) {
			
			
			System.out.println("enter the 10 numbers and enter");
			Scanner scanner = new Scanner(System.in);
			double[] array = new double[10];
			for(int i=0; i < 10 ;i++) {
				array[i] = scanner.nextDouble();
			}
			double min=smallest(array);
			System.out.println(" Smallest number is " + min);
		    int Index = Index(array);
			System.out.println(" Index is " + Index);
		}	
		
		public static double smallest(double[] array)
		{
			double min= array[0];
			for (int i=0;i<10;i++)
			{
				if( array[i] < min)
				{ min= array[i];
				
				
			} 
		}
			
		return min;
		}

	public static int Index(double[] num) {
		double chk = num[0];
		int index = 0;
	    	for (int i = 0; i < 10; i++) {
	    		if (num[i] < chk){
	    			chk = num[i];
	    			index = i;
	    		}
	    	}
	    return index;
	}
}