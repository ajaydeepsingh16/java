import java.util.*;
 class Main
{
	public static void main(String[] args) {
	
	
        Scanner s=new Scanner(System.in);
    int x=s.nextInt();
        int ar[]=new int[x];
        for(int i=0;i<x;i++)
        {
            ar[i]=s.nextInt();
        }
        Arrays.sort(ar);
        for(int i=0;i<x;i++)
        {
            System.out.println(ar[i]);
        }
    }
}