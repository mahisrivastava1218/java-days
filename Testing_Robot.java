
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
		    int x=scn.nextInt();
		    Set<Integer>set=new HashSet<Integer>();
		    set.add(x);
		    String s=scn.next();
		    
		    for(int i=0;i<n;i++){
		        if(s.charAt(i)=='R'){
		            x++;
		            set.add(x);
		        }else{
		             x--;
		             set.add(x);
		        }
		   
		    }
		    
		    System.out.println(set.size());
		}
	}
}
