/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_returnt;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva3_13_Returnt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor 1: ");
                int val1 = scan.nextInt();
        System.out.println("Valor 2: ");
        int val2 = scan.nextInt();
        //llamar la funcion
        // 1. guardar el resultado:
        int resu = sumar(val1, val2);
        System.out.println("la suma  = " + resu);
         //2. usar directamente el resultado de la funcion
        //cuando solo usan el resultado una vez
        System.out.println("la suma = " + sumar(val1, val2));
        //3. ignorar el resultado
        sumar(val1, val2);
    }
    public static int sumar(int num1, int num2){
    int resu = num1 + num2;
    return resu; // es la ultima instruccion del metodo, despues del return no puede haber mas instrucciones
    
    }
    
}
