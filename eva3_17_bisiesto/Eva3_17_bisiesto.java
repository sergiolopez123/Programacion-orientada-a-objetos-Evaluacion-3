/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva3_17_bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce un año: ");
        int añob = scan.nextInt();
       if(bisiesto(añob)){
       System.out.println("el año: " + añob + " es bisiesto!!!");
       } else {
           System.out.println("el año: " + añob + ", No es un año bisiesto");
       }
    }
    public static boolean bisiesto(int año){
    if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)){
    return true;
    } else{
    return false;
    }
    }
    
}
