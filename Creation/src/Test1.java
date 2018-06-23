import java.util.*;
public class Test1 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Set<Integer> set=new HashSet<Integer>();
        for (int i=0;i<n;i++)
        {
            set.add(Integer.parseInt(sc.nextLine()));
        }
        Integer[] distinctArray=set.toArray(new Integer[set.size()]);
        int max = distinctArray[n];
        for(int i = n; i < distinctArray.length; i++)
        {
            if(max < distinctArray[i])
            {
                max = distinctArray[i];
            }
        }
        System.out.println("Maximum value:"+max);
        sc.close();
    }
}
