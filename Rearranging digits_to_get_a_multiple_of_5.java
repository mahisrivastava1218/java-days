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
		    String d=scn.next();
		    Boolean flag=false;
		    for(int i=0;i<d.length();i++){
		        char  ch=d.charAt(i);
		      
		        if(ch=='0'){
		            flag=true;
		        }else if(ch=='5'){
		            flag=true;
		        }
		    }
		    if(flag){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		    
		   
		}
	}
}
