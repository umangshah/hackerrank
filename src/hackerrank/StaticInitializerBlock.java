package hackerrank;
import java.util.*;

/*
 * HackerRank: Introduction: Java Static Initializer Block
 * Description: Use static initializer block 
 * to initialize input variables  
 */
public class StaticInitializerBlock {
	private static Scanner sc = new Scanner(System.in);
	private static int B = initializeB();
	private static int H = initializeH();
	private static boolean flag = intializeFlag();
	
	private static int initializeB()
	{
		return sc.nextInt();
	}

	private static int initializeH()
	{
		return sc.nextInt();
	}
	
	private static boolean intializeFlag()
	{
		if(B <= 0 || H <= 0)
		{
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			return false;
		}
		return true;
	}

	public static void main(String []args)
	{
		if(flag)
		{
			int area=B*H;
			System.out.print(area);
		}
	}
}