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
		    int k=0;
		    for(int i=0;i<n;i++){
		        int count=0;
		        for(int j=0;j<n;j++){
		            if(arr[i]==arr[j] && arr[i]!=-1){
		                count++;
		            }
		        }
		        if(count%2!=0){
		            k=arr[i];
		        }
		          
		    }
		  System.out.println(k);  
		}
	}
}
