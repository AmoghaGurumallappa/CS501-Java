
public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println(" the prime numbers");
		printPrimeNumbers();
	}

	public static void printPrimeNumbers() {
		final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 8 per line
		int count = 0; // Count the number of prime numbers per line
		int number = 2; // A number to test, starts from 2
		
		// Repeatedly find prime numbers
		while (number < 1000) {
			// Print the prime number and increase the count
			if (isPrime(number)) {
				count++; // Increase the count

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Print the number and advance to the new line
					System.out.printf("%-4s\n", number);
				} else
		        	
				System.out.printf("%-4s", number);
				
			}
			number++;
		}
	}
	/** Check whether number is prime */
	public static boolean isPrime(int number) 
	{
		for(int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // Number is not a prime
			}
		}
		// Number is prime
		return true;
	}
}

