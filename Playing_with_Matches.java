import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		int[] arr={6,2,5,5,4,5,6,3,7,6};
		for(int textcase=1;textcase<=t;textcase++){
		    int a=scn.nextInt();
		    int b=scn.nextInt();
		    int res=a+b;
		    
		    int sum=0;
		    while(res>0){
		      //  System.out.println(res+" ");
		        int d=res%10;
		        sum+=arr[d];
		        System.out.print(arr[d]+" ");
		        res=res/10;
		    }
		    System.out.println(sum);
		}
		
	}
}
