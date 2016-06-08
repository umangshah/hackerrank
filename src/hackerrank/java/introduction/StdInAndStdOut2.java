package hackerrank;
import java.util.Scanner;

/*
 * HackerRank: Introduction: Java Stdin and Stdout 2
 * Description: Read input from stdin 
 * and write your output to stdout
 */
public class StdInAndStdOut2 {

	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int integerInput = sc.nextInt();
		double doubleInput = sc.nextDouble();
		sc.nextLine();
		String stringInput = sc.nextLine();
		
		System.out.println("String: " + stringInput);
		System.out.println("Double: " + doubleInput);
		System.out.println("Int: " + integerInput);
		
		sc.close();
	}
}
