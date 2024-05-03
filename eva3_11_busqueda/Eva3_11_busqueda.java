/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_busqueda;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva3_11_busqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo [] = new int [10];
        for(int i = 0; i < arreglo.length; i++ ){
        arreglo[i] = ((int) (100 * Math.random()) + 1 );
        }
        for(int i = 0; i < arreglo.length; i++){
        System.out.println("[" +arreglo[i] + "]");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("¿que valor buscas?");
        int valor = scan.nextInt();
        //buscar: 
        //recorrer el arreglo (ciclo for)
        //comparar valor buscando contra el valor en el arreglo (IF)
        //detenerme si lo encuentro, si no, seguir buscando
        //regresar el resultado: puede variar > puede ser la posición
        // o Verdadero (si lo encuentra) o falso (si no lo encuentra)
        int pos = -1; //una posicion que no existe
        for(int i = 0; i < arreglo.length; i++){
        if(valor == arreglo[i]){
            pos = i; //almaceno la posicion donde esta el valor
            break;
        }        
        }         System.out.println("posición = " + pos);

        
    }
    
}
