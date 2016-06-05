import java.util.Scanner;


public class C9E27Bioinformatics 
{

	
	public static void main(String[] args) 
	{
		
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a Genome string: ");
	
	String genome = input.nextLine();

		
	boolean found = false;
		
	int start = -1;
		
	for (int i = 0; i < genome.length() - 2; i++) 
	{
			
		String triplet = genome.substring(i, i + 3);
	
		if (triplet.equals("ATG")) 
	{
			
		start = i + 3;
		
	}
 	else if (((triplet.equals("TAA")) || (triplet.equals("TAG")) || (triplet.equals("TGA"))) && (start != -1))
 	{
				
		String gene = genome.substring(start, i);

		if (gene.length() % 3 == 0) 
		{
		
			found = true;
	
			System.out.println(gene);

			start = -1;
	
		}
			
	}
		
	}

		
	if (!found)
	
	System.out.println("No Gene is found");
	
	}

}
