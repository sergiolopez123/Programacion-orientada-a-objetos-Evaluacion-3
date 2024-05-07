/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_return_2;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva3_14_return_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int valor1, valor2; 
        System.out.println("Introduce el numero que quieras multiplicar: ");
        valor1 = scan.nextInt();
        System.out.println("Introduce la potencia que quieras usar: ");
        valor2 = scan.nextInt();
        //potencia(valor1 , valor2);
        System.out.println("el resultado es: " + potencia(valor1, valor2));
        
    }
    public static int potencia(int base, int pot){
        //necesitamos un acumulador
        int resu = 1;
    for(int i = 0; i < pot; i++){
   resu = resu * base; 
    }
    return resu;
    }
    
}
