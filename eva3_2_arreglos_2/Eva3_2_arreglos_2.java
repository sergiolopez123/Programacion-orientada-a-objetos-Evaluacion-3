/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos_2;

/**
 *
 * @author jairl
 */
public class Eva3_2_arreglos_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JAVA: 0 primer elemento y el ultime es  N-1
        // N = total de elementos almacenados en el arreglo
        
        //vamos a crear un arreglo y llenarlo de valores aleatorios
        // int datos[], x, y; solo datos es un arreglo
        //int[] datos, x, y; todas las variables son arreglos
        int datos[] = new int[20];
        //asiganar valores aleatorios entre 0 y 99
        for(int i = 0; i < datos.length; i++){
        datos[i] = (int)(Math.random() * 100); //0 - 99
        } 
        //imprimir los elementos del arreglo
        for(int i = 0; i < datos.length; i++){
            System.out.print("[" + datos[i] + "]");
      
        } 
    }
    
}
