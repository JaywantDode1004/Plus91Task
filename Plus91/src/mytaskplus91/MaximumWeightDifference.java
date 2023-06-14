package mytaskplus91;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumWeightDifference {
	public static int solve(int array[], int n, int k)
	{
		// sort the given array
		Arrays.sort(array);
	
		
		int sum = 0, sum1 = 0, sum2 = 0;
	
		
		for (int i = 0; i < n; i++) {
			sum += array[i];
		}
	
		
		for (int i = 0; i < k; i++) {
			sum1 += array[i];
		}
	
		
		for (int i = k; i < n; i++) {
			sum2 += array[i];
		}
	
		
		return Math.max(Math.abs(sum1 - (sum - sum1)),
					Math.abs(sum2 - (sum - sum2)));
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of k: ");
		int k = sc.nextInt();
		
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
	
		
		System.out.print(solve(array, n, k));
		
		sc.close();
	}
}
