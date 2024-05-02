/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_captura_datos;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva3_4_captura_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        Scanner scan = new Scanner(System.in);
        System.out.println("cuantos nombres vas a querer capturar?");
        cant = scan.nextInt();
        scan.nextLine();
        String[] listaNombres = new String[cant];
        //hay que preguntar cada nombre:
        for(int i = 0; i <listaNombres.length; i++){
        System.out.println("nombre #" + (i+1) + ": ");
        listaNombres[i] = scan.nextLine();
        } System.out.println("");
        for(int i = 0; i <listaNombres.length; i++){
        System.out.println(listaNombres[i]);
        }
    }
    
}
