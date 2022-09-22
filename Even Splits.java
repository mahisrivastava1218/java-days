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
		    String s=scn.next();
		    if(n<=2){
		        System.out.println(s);
		    }else{
		        char[] ch=s.toCharArray();
		         Arrays.sort(ch);
		         String res=new String(ch);
		         System.out.println(res);
		    
		    }
		    
		    
		    
		}
	}
}
