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
		    int x1=scn.nextInt();
		    int y1=scn.nextInt();
		    int res=Math.max(x,x1)-Math.min(x,x1);
		    int cam=Math.max(y,y1)-Math.min(y,y1);
		    int result=Math.max(res,cam);
		    System.out.println(result);
		}
	}
}
