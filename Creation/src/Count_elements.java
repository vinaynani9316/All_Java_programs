import java.util.Arrays;

public class Count_elements 
{
	static int binarySearch(int arr[], int l, int h, int x)
	{
		while(l<=h)
		{
			int mid=(l+h)/2;
			
			if(arr[mid]<=x)
			
				l=mid+1;
				else
				h=mid-1;
		}
		return h;
	}
		static void countLessThanOrEquals(int arr1[], int arr2[], int m, int n)
		{
			Arrays.sort(arr2);
			for(int i=0; i<m; i++)
			{
				int index=binarySearch(arr2, 0, n-1,arr1[i]);
				
				System.out.println((index+1) + " ");
			}
		}
		public static void main(String[]argument)
		{
			int arr1[]= {1,2,3,4,7,9};                      // counting less than or equal to elements in arr2 from arr1.
			int arr2[]= {0,1,2,1,1,4};
			countLessThanOrEquals(arr1, arr2, arr1.length, arr2.length);
		}
	}


