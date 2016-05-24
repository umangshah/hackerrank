package hackerrank;
import java.util.*;

/*
 * HackerRank: Introduction: Java If-Else
 * Description: If else example
 */
public class IfElse {

	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String output = "";
		if(input % 2 == 1)
		{
			output = "Weird";
		}
		else if(input > 1 && input <= 5)
		{
			output = "Not Weird";
		}
		else if(input > 5 && input <= 20)
		{
			output = "Weird";
		}
		else
		{
			output = "Not Weird";
		}
		System.out.println(output);
		sc.close();
	}
}