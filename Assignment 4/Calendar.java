import java.util.GregorianCalendar;


public class Calendar

{

    public static void main(String[] args)

 {

   GregorianCalendar Cal = new GregorianCalendar();

        System.out.println("Current Year: " + Cal.get(GregorianCalendar.YEAR));

      System.out.println("Current Month: " +( Cal.get(GregorianCalendar.MONTH)+1));

      System.out.println("Current Day: " + Cal.get(GregorianCalendar.DAY_OF_MONTH));

         
 
       System.out.println();

    Cal.setTimeInMillis(1234567898765L);

        System.out.println("Year: " + Cal.get(GregorianCalendar.YEAR));

        System.out.println("Month: " +( Cal.get(GregorianCalendar.MONTH)+1));

        System.out.println("Day: " + Cal.get(GregorianCalendar.DAY_OF_MONTH));

        }
		
	
}
