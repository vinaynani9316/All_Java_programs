import java.util.Scanner;

class Solution 
{
	public void solution(int N, int S[], int K) 
	{
		if(N==N/2)
		{
			K=N-N/2;
			System.out.println(K);
		}
		
		
	}
    public static void main(String[] args) throws InterruptedException
    {
    	Scanner sc=new Scanner(System.in);
    	int N=sc.nextInt();
    	int [] S=new int[N];
    	for(int i=0;i<N;i++)
    		S[i]=sc.nextInt();
    	int K=sc.nextInt();
    	Solution s=new Solution();
    	s.solution(N,S,K);
		sc.close();
	}
    
}
