/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_metodos;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva3_12_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //invocar al metodo --->  llamada --> call
        mostrarMensaje("Hola mundo cruel!!!");
        mostrarMuchosMensajes("pedrito me electrocutaste", 4);
    }
    // public static ---> para la materia de programacion orientada a objetos
    // void --> (tipo de dato) valor que regresa el metodo
    // void --> no regresa nada
    // nombre del metodo ---> identificador valido, empezar en minusculas, debe ser un verbo
                             //() <---- parametros del metodo (argumentos) -- > valores que necesita
     //                       para funcionar
    public static void mostrarMensaje(String mensa){ //encabecado (nombre de metodo)
    //cuerpo del metodo: aqui va nuestro codigo
    System.out.println(mensa);
    }
    public static void mostrarMuchosMensajes(String mensaje, int veces){
        boolean cambiarMensaje = true;
    for(int i = 1; i <= veces; i++){
    if (cambiarMensaje == true){
    System.out.println("pedrito me electrocutaste");
    } else {
    System.out.println("me electrocutaste pedrito");
    } cambiarMensaje = !cambiarMensaje;
    
    } 
    
    }
    
}
