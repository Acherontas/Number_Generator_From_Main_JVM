/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package checkerz;

/**
 *
 * @author acherontas
 */

public class chk {
    public int arorizontia=0;
    public int arkatheta=0;
    public int check_one(int y,int tme){
        if(y>0 && tme<=y){ System.out.print("(" + y +")" + "| "); arorizontia=arorizontia+1;return 1;}
        return 0;
    }
    public int check_two(int y,int tme){       
        if(y>0 && tme>y){System.out.print("(" + 0 +")" + "/ ");arkatheta=arkatheta+1;return 1;}
        return 0;
    
    }
    public int check_three(int y,int tme){
        if(y==0){System.out.print("(" + y +")" + "/ ");arkatheta=arkatheta+1;return 1;} 
        return 0;
    }
    
}
