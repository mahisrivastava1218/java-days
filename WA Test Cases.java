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
	
		for(int textcase=1;textcase<=t;textcase++){
		   
		    int n=scn.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=scn.nextInt();
		        
		    }
		    int res=120;
		    String v=scn.next();
		    for(int i=0;i<n;i++){
		        char ch=v.charAt(i);
		        if(ch=='0'){
		          res=Math.min(res,arr[i]);
		        }
		    }
		    System.out.println(res);
		}
	}
}
