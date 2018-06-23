package info;

import java.util.Arrays;

class CountEleEqualorLargest
{
 
	static int binary_search(int arr[], int l, int h, int x)
	{
		while (l <= h)
		{
			int mid = (l+h) / 2;

			if (arr[mid] <= x)
				l = mid + 1;
	
			
			else
				h = mid - 1; 
		}
		
		return h;
	}
	
	static void countEleLessThanOrEqual(int arr1[], int arr2[], 
								int m, int n)
	{
		
		Arrays.sort(arr2);

		for (int i=0; i<m; i++)
		{
			int index = binary_search(arr2, 0, n-1, arr1[i]);
			
			System.out.print((index+1) + " ");
		}
	}
	public static void main(String[] args)
	{
		int arr1[] = {1, 4, 2, 4};
		int arr2[] = {3, 5};
		
		countEleLessThanOrEqual(arr1, arr2, arr1.length, arr2.length);
	}
}
