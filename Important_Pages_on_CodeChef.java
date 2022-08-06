
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn=new Scanner(System.in);

		    int a=scn.nextInt();
		    int b=scn.nextInt();
		    if(a==1 && b==0){
		        System.out.println("https://www.codechef.com/contests");
		    }else if(a==0 && (b==1 || b==0)){
		        System.out.println("https://www.codechef.com/practice");
		    }else{
		        System.out.println("https://discuss.codechef.com");
		    }
		
	}
}
