package CrackingTheCodingInterview;

import java.util.Scanner;

public class BitManipulationLonelyInteger
{
	public static int lonelyInteger(int[] a)
	{
		int res = 0;
		for(int num : a)
			res ^= num;
		return res;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++)
		{
			a[a_i] = in.nextInt();
		}
		System.out.println(lonelyInteger(a));
		
		in.close();
	}
}
