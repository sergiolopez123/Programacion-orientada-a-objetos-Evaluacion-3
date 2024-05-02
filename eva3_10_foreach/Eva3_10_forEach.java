/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_foreach;

/**
 *
 * @author jairl
 */
public class Eva3_10_forEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diaSeman [] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        for(String dia : diaSeman){
            System.out.println(dia);
        }
        int salario[] = {50, 100, 500, 1000, 5000, 30000, 60000};
        for(int sal : salario){
        System.out.println("$" +sal);
        }//-----------
        String meses [] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio" , "Julio", "Agosto", "Septiembre", 
            "Octubre", "Noviembre", "Diciembre"};
        for(String mes : meses){
        System.out.println(mes);
        }
        
        }
    }
    

