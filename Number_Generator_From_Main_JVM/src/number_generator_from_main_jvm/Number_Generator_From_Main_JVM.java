/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number_generator_from_main_jvm;
import Sums_Cdis.Sumz;
import java.util.Scanner;
import checkerz.chk;
/**
 *
 * @author acherontas
 */
public class Number_Generator_From_Main_JVM {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Sumz sz=new Sumz();
        chk ch=new chk();
        String s=new String();
        Scanner console=new Scanner(System.in);
        System.out.print("Enter a number:\n");
        s=console.nextLine();
        int tme=1;
        int[] ar_oriztia=new int[10]; int aro=0;
        int[] ar_katheta=new int[10]; int ark=0;
        //int arorizontia=0;
        //int arkatheta=0;
        int sum_oriz=0;
        int sum_kathe=0;
     System.out.print("\n");
     System.out.println("Order (Number) Dash Function Output\n");
     for(int i=1;i<=9;i++){
         System.out.print( i + ": ");
        int x=0;
        int nm=0;
        char k;
        int y;
        int tk=0;   
        ch.arorizontia=0;
        ch.arkatheta=0;    
        //arorizontia=0;
        //arkatheta=0;
        while(x<=s.length()-1) {          
          k=s.charAt(nm); 
          y=Character.getNumericValue(k); 
          //we dont have Goto Statement like C++ so we use methods
          //i use a class 
          //if it is matches the corresponding 1 is shown
          //otherwise 0
          int mni=ch.check_one(y,tme);
          int mnk=ch.check_two(y,tme);
          int mlk=ch.check_three(y,tme);
          //the next Line can easily be commented out
          //System.out.print(mni + " " + mnk + " " + mlk + " ");          
          //the older method not so clear missing Goto Statement in order to increase the values 
          //correctly
          //if(y>0 && tme<=y){ System.out.print("(" + y +")" + "| "); arorizontia=arorizontia+1;x+=1;nm+=1;}
          //if(y>0 && tme>y){System.out.print("(" + 0 +")" + "/ ");arkatheta=arkatheta+1; x+=1;nm+=1;}
          //if(y==0){System.out.print("(" + y +")" + "/ ");arkatheta=arkatheta+1;x+=1;nm+=1;} 
          x+=1;
          nm+=1;
        }        
        System.out.print(" with | " + ch.arorizontia + " / " + ch.arkatheta + " ");        
        ar_oriztia[aro]=ch.arorizontia; aro+=1;
        ar_katheta[ark]=ch.arkatheta; ark+=1;
        System.out.print("\n");
        tme+=1;
     }
     System.out.print("\n");
     System.out.print("| : ");
     for(int i=0;i<=aro;i++){
         System.out.print(ar_oriztia[i] + " ");
         sum_oriz=sum_oriz+ar_oriztia[i];
     }
     System.out.print("with sum " + sum_oriz);
     System.out.println("\n");
     System.out.print("/ : ");
     for(int i=0;i<=aro;i++){
         System.out.print(ar_katheta[i] + " ");
         sum_kathe=sum_kathe+ar_katheta[i];
     }
     System.out.print("with sum " + sum_kathe + "\n");
     System.out.print("\n");
     System.out.print("Comparing main number sum of digit with '|' sum of digits \n");
     int mns=sz.get_the_sum(s);
     int scd=sz.get_the_sum(Integer.toString(sum_oriz));    
     System.out.println("main number sum of digits " + mns + " and '|' sum of digits " + scd+"\n");
     int combiner;
     combiner=sum_oriz+sum_kathe;
     System.out.println("Adding the '|' and '/' sums " + sum_oriz + " + " + sum_kathe + " = " + combiner);
     //the next sum of digit should always be 9
     int cmb=sz.get_the_sum(Integer.toString(combiner));
     System.out.println("with sum of digits of " + combiner + " is " + cmb);
     System.out.println("\n");
    }
}
