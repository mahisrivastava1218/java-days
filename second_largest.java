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
		    int c=scn.nextInt();
		    if(a>=b && a<=c){
		        System.out.println(a);
		    }else if(a<=b && a>=c){
		        System.out.println(a);
		    }else if(b>=a && b<=c){
		        System.out.println(b);
		    }else if(b<=a && b>=c){
		        System.out.println(b);
		    }else if(c>=a && c<=b){
		        System.out.println(c);
		    }else{
		        System.out.println(c);
		    }
		}
	}
}
