package hackerrank;
import java.util.*;

/*
 * HackerRank: Introduction: Java End-of-file
 * Description: Read n(unknown) lines of input 
 * till you reach End of File 
 */
public class EndOfFile {

	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);

		int index = 1;
		while(sc.hasNext())
		{
			System.out.println(index++ + " " + sc.nextLine());
		}
		sc.close();
	}
}