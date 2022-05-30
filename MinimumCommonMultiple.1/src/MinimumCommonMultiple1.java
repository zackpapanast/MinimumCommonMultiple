

import java.util.Scanner;

/**
 *
 * @author Ζαχος
 */
public class MinimumCommonMultiple1 {

    public static int mcm(int a,int b){
      int temp;
        temp=a;
        if(a<b){
            a=b;
            b=temp;
        }
        int flag=a;
         while(a%b!=0){
             a=a+flag;
         } 
         return a;
    }
    public static void menuchoice(){
        int choice=0;
        do{
       System.out.println("dwse epilogi");
       Scanner input = new Scanner(System.in);
       choice=input.nextInt();
       if(choice==1){
           System.out.println("dwse a,b akeraioi");
           int a=input.nextInt();
           int b=input.nextInt();
           int m=mcm(a,b);
           System.out.println("EKp="+m);
       }
       else if(choice==2){
           System.out.println("ekp finder");
           System.out.println("created by zachos");
           
       }
       else if(choice!=3){
           System.out.println("la8os");
       }
        }while(choice!=3);
    }
    public static void main(String[] args) {
       menuchoice();
    }
    
}
