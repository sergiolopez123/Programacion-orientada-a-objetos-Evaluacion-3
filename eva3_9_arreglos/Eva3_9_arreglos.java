/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_arreglos;

/**
 *
 * @author jairl
 */
public class Eva3_9_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diaSemana[] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        System.out.println("Tamaño del arreglo diaSemana = " + diaSemana.length );
        System.out.println("Tamaño de arreglo vocales = " + vocales.length);
        for(int i = 0; i < diaSemana.length; i++){
        System.out.println(diaSemana[i]);
        }
        for(int i = 0; i < vocales.length; i++){
        System.out.println(vocales[i]);
    } System.out.println("");
    String menu[] = {"Archivo", "nueva factura", "modificar", "salir"};
for(int i = 0; i < menu.length; i++){
System.out.println(i + " - " + menu[i]);
}
}
}
