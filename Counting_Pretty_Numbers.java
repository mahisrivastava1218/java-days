import java.util.*;
import java.lang.*;
import java.io.*;
class codechef{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
       
        for(int textcase=1;textcase<=t;textcase++){
             
             int l=scn.nextInt();
             int r=scn.nextInt();
             int sum=0;
             for(int i=l;i<=r;i++){
                if(i%10==2){
                    sum++;
                }if(i%10==3){
                    sum++;
                }if(i%10==9){
                    sum++;
                }
            }
            System.out.println(sum);   
        }
        
    }
}
              
