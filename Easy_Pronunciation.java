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
		    String k=scn.next();
		    int count=0;
		    int b=0;
		    for(int i=0;i<k.length();i++){
		        char ch=k.charAt(i);
		        if(ch !='a' && ch !='e' && ch !='i' && ch !='o' && ch!='u'){
		            count++;
		        }else{
		            count=0;
		        }
		         if(count>=4){
		                   b=1;
		                   break;
		        }
		    }
		    if(b>=1){
		        System.out.println("NO");
		    }else{
		        System.out.println("YES");
		    }
		   
		}
	}
}
