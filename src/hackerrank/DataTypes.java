package hackerrank;
import java.util.*;

/*
 * HackerRank: Introduction: Java Datatypes
 * Description: program to test knowledge of Java's primitive 
 * data types used to hold integer values 
 */
public class DataTypes {

	public static void main(String []args)
	{
		long longLowerRange = -9223372036854775808L;
		long longUpperRange = 9223372036854775807L;
		
		Scanner sc = new Scanner(System.in);
		int noOfTests = sc.nextInt();
		for(int i=0 ; i < noOfTests ; i++)
		{
			try 
			{
				long integer = sc.nextLong();
				
				System.out.println(integer + " can be fitted in:");
				if(integer >= -128 && integer <= 127)
				{
					System.out.println("* byte");
				}
				if(integer >= -32768 && integer <= 32767)
				{
					System.out.println("* short");
				}
				if(integer >= -2147483648 && integer <= 2147483647)
				{
					System.out.println("* int");
				}
				if(integer >= longLowerRange && integer <= longUpperRange)
				{
					System.out.println("* long");
				}					
			}
			catch(Exception e) 
			{
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}
		}
		sc.close();
	}
}