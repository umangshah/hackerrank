package hackerrank;
import java.util.*;

/*
 * HackerRank: Introduction: Java Stdin and Stdout 1
 * Description: Read input from stdin 
 * and write your output to stdout
 */
public class StdInAndStdOut {

	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();
	}
}
