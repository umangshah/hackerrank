package hackerrank;
import java.util.*;

/*
 * HackerRank: Introduction: Java Loops
 * Description: program to test knowledge of Java Loops
 */
public class ForLoop {

	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int noOfTests = sc.nextInt();
		for(int i=0 ; i < noOfTests ; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			
			int powTotal = 0;
			int result = 0;
			for(int j=0 ; j < n ; j++)
			{
				powTotal += ((int)Math.pow(2, j) * b); 
				result = a + powTotal;
				System.out.print(result + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}