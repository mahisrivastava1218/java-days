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
		    int a=scn.nextInt();
		    int b=scn.nextInt();
		    int res=0;
		    int result=0;
		    if(b<a){
		        result=a-b;
		        res=result+a;
		    }else{
		        res=a;
		    }
		    System.out.println(res);
		}
	}
}
