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
		    int x=scn.nextInt();
		    int y=scn.nextInt();
		    int res=0;
		    if(x>y){
		        res=x-y;
		    }else if(y>x){
		        res=y-x;
		    }else{
		        res=0;
		    }
		    System.out.println(res);
		}
	}
}
