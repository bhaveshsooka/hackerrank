package Algorithms.Implementation;

import java.util.Scanner;

public class TheHurdleRace
{
	public static void main(String[] args)
	{
		int max = 0;
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] height = new int[n];
		for (int height_i = 0; height_i < n; height_i++)
		{
			height[height_i] = in.nextInt();
			if(height[height_i] > max)
				max = height[height_i];
		}
		if(max - k > 0)
			System.out.println(max - k);
		else
			System.out.println(0);
		
		in.close();
	}
}
