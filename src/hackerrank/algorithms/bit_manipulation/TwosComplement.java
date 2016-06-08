package hackerrank;
import java.util.*;

public class TwosComplement {

	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		for(int a=0;a<t;a++)
		{
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			System.out.println(countSetBits(num1, num2));
		}
		in.close();
	}
	
	public static long countSetBits(int num1, int num2)
	{
		// Handle positive num1 and num2 
		if(num1 >= 0)
		{
			// Calculate number of bits set from 0 to num2
			long result = countSetBits(num2); 
			if(num1 > 0)
			{
				// Calculate and subtract number of bits set from 0 to num1 to get the count of bits from range num1 - num2
				result -= countSetBits(num1 - 1);
			}
			return result;
		}
		
		// Code to handle negative num1s (num2 can be positive or negative)
		
		// This is mainly driven by the logic that the number of 1's in -num1 is equal to the number of 0's in ~(-num1) = num1 - 1
		// calculate total bits from 0 to num1 (=32*num1) and subtract count of 1s from 0 to num1 will give you total 0's from 0 to num1 (which is what we want) 
		long result = ((32 * -(long)num1) - countSetBits(~num1));
		//long result = ((32 * -(long)num1) - countSetBits(Math.abs(num1) - 1)); Can also be written as this
		
		// if second number is positive, no special handling needed. add the result to the above result to get your answer. 
		if(num2 > 0)
		{
			result += countSetBits(num2) ;
		}
		// if second number is negative, then calculate like -ve num1 and subtract it from result
		else if(num2 < -1)
		{
		  num2++;
		  result -= (32 * -(long)num2) - countSetBits(~num2) ;
		 }
		 return result;
	}
	
	public static long countSetBits(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		if(num % 2 == 0)
		{
			return countSetBits(num - 1) + Integer.bitCount(num);
		}
		return (((long)num + 1)/2) + (2 * countSetBits((int)num/2));
	}
}

/* Explanation of countSetBits(int num)
 * 
The single-argument solve(int a) function is the key. It is short, so I will cut&paste it here:

long long solve(int a)
{
 if(a == 0) return 0 ;
 if(a % 2 == 0) return solve(a - 1) + __builtin_popcount(a) ;
 return ((long long)a + 1) / 2 + 2 * solve(a / 2) ;
}
It only works for non-negative a, and it counts the number of 1 bits in all integers from 0 to a inclusive.

The function has three cases:

a == 0 -> returns 0. Obviously.

a even -> returns the number of 1 bits in a plus solve(a-1). Also pretty obvious.

The final case is the interesting one. So, how do we count the number of 1 bits from 0 to an odd number a?

Consider all of the integers between 0 and a, and split them into two groups: The evens, and the odds. For example, if a is 5, you have two groups (in binary):

000  (aka. 0)
010  (aka. 2)
100  (aka. 4)
and

001  (aka 1)
011  (aka 3)
101  (aka 5)
Observe that these two groups must have the same size (because a is odd and the range is inclusive). To count how many 1 bits there are in each group, first count all but the last bits, then count the last bits.

All but the last bits looks like this:

00
01
10
...and it looks like this for both groups. The number of 1 bits here is just solve(a/2). (In this example, it is the number of 1 bits from 0 to 2. Also, recall that integer division in C/C++ rounds down.)

The last bit is zero for every number in the first group and one for every number in the second group, so those last bits contribute (a+1)/2 one bits to the total.

So the third case of the recursion is (a+1)/2 + 2*solve(a/2), with appropriate casts to long long to handle the case where a is INT_MAX (and thus a+1 overflows).

This is an O(log N) solution. To generalize it to solve(a,b), you just compute solve(b) - solve(a), plus the appropriate logic for worrying about negative numbers. That is what the two-argument solve(int a, int b) is doing.
 * 
 */ 
