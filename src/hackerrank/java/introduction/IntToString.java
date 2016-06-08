package hackerrank;
import java.util.*;

/*
 * HackerRank: Introduction: Java Int to String
 * Description: Convert Int to String 
 */
public class IntToString {

	public static void main(String []args)
	{

		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		String s = new Integer(n).toString();
		if(n==Integer.parseInt(s))
		{
			System.out.println("Good job");
		}
		else
		{
			System.out.println("Wrong answer.");
		}
	}
}