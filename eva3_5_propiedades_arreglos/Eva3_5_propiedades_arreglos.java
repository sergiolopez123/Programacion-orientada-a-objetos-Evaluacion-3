/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_propiedades_arreglos;

/**
 *
 * @author jairl
 */
public class Eva3_5_propiedades_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = new int[3];
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo [2] = 300;
        System.out.println(arreglo);
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("[" + arreglo[i] + "]");
        }
        //-----------
        System.out.println("");
        int arregloNuevo [] = new int[5];
        arregloNuevo[0] = 5000;
                arregloNuevo[4] = 5000;
        arregloNuevo[1] = 2000;
        arregloNuevo[2] = 3000;
        arregloNuevo[3] = 500;
        System.out.println("");
        System.out.println(arregloNuevo);
        System.out.println("Despues del cambio de tamaño");
                System.out.println("");

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("[" + arreglo[i] + "]");
            
        }                System.out.println("");

        for(int j = 0; j < arregloNuevo.length; j++){
            System.out.println(arregloNuevo[j]);}
    }
    
}
