import java.util.*;
import java.lang.*;
import java.io.*;
class codechef{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int k=scn.nextInt();
        int arr[]=new int[k];
        int count=0;
        
        for(int i=0;i<n;i++){
            
            int sum=0;
            for(int j=0;j<k;j++){
                     arr[i]=scn.nextInt();
                     sum += arr[i];
            }
            
            int p=scn.nextInt();;
            if(sum>=m && p<=10){
                    count++;
            }
        
        }            

        System.out.println(count);   
  }
}
