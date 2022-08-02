import java.util.*;
import java.lang.*;
import java.io.*;
class codechef{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
       
        for(int textcase=1;textcase<=t;textcase++){
             int n=scn.nextInt();
             String[] arr=new String[n];
             int count=0;
             int count1=0;
             for(int i=0;i<n;i++){
                 arr[i]=scn.next();
                 if(arr[i].equals("START38")){
                       count++;
                  }
                  else{
                      count1++;
                   
                }
             }

            System.out.println(count+(" ")+count1);   
        }
        
    }
