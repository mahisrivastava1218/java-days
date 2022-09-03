
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n=Integer.parseInt(br.readLine());
		    String s=br.readLine().trim();
		    int count=0;
		    char ch[]=s.toCharArray();
		    for(int i=0;i<n;i++){
		        if(i==n-1){
		            count++;
		            break;
		        }
		        if(ch[i]==ch[i+1]){
		            count++;
		            i++;
		        }else{
		            count++;
		            
		        }
		       
		    }
		    System.out.println(count);
		}
		
	}
}
