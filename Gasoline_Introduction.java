import java.util.*;
import java.lang.*;
import java.io.*;
class codechef{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        
        for(int textcase=1;textcase<=t;textcase++){
            int n=scn.nextInt();
            int arr[]=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            int sum=arr[0];
            int dis=0;
            for(int i=1;i<n;i++){
                  if(sum>=1){
                     dis +=1;
                     sum +=arr[i]-1;
                     
                  }else{
                      break;
                  } 
             
            }
            int sum1=sum+dis;
        System.out.println(sum1);   
        }
        
    }
}
