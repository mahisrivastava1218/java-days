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
		    int m=scn.nextInt();
		     int x=scn.nextInt();
		      int y=scn.nextInt();
		      n=n+m-2+x;
		      x=x+y;
		      if(n%2==1 && x%2==0){
		          System.out.println("No");
		      }else{
		          System.out.println("Yes");
		      }
		}
	}
}
