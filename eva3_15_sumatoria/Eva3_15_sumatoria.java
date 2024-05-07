/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_15_sumatoria;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva3_15_sumatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("que numero quieres para la sumatoria?");
        numero = scan.nextInt();
        System.out.println("el resultado es: " + sumatoria(numero));
    }
    public static int sumatoria(int num){
    int resu = 0;
    for(int i = 0; i < num; i++){
    resu = resu + (num - i);
    } return resu;
    }
    
}
