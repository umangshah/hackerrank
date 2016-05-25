package hackerrank;
import java.util.*;

/*
 * HackerRank: Introduction: Java Output Formatting
 * Description: output formatting using printf 
 */
public class outputFormatting {

	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		String[] stringInput = new String[3];
		int[] integerInput = new int[3];
		
		System.out.println("================================");
		for(int i=0 ; i < stringInput.length ; i++)
		{
			stringInput[i] = sc.next();
			integerInput[i] = sc.nextInt();
			System.out.printf("%-15s", stringInput[i]);
			System.out.printf("%03d", integerInput[i]);
			System.out.println();
		}
		System.out.println("================================");
		sc.close();
	}
}
