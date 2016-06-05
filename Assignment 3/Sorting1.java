package sorting1;


import java.util.Scanner;

public class Sorting1 {

	
	public static void selectionsort (double[] list) 
	{
		for (int i=0; i<list.length;i++) {
			double currentMax = list[i];
			int currentMaxIndex = i;
		
		for (int j=i+1;j<list.length;j++) {
			if( currentMax < list[j]) {
				currentMax = list[j];
				currentMaxIndex = j;
			}
		}
		if(currentMaxIndex !=i) {
			list[currentMaxIndex] = list[i];
			list[i] = currentMax;
		}
		}
	}
	public static void main(String[] args) {
		double[] number = new double[10];
		System.out.println("enter the 10 numbers to sort and enter");
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i < 10;i++) {
			number[i] = scanner.nextDouble();
			
		}
		
		selectionsort(number);
		for(int i=0; i<10;i++) {
			System.out.print(number[i] + " ");
		}
	}
}
