/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_temperaturas;

import java.util.Scanner;

/**
 *
 * @author jairl
 */
public class Eva3_18_Temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        double sistemaT, temp, sistemaA;
        System.out.println("Introduce la temperatura: ");
        temp = scan.nextDouble();
        System.out.println("introduce el sistema de temperatura que estas usando (1 = Celcius. 2 = Kelvin. 3 = Farenheit");
        sistemaA = scan.nextDouble();
        System.out.println("A que Sistema de temperatura quieres convertir(1 = Celcius. 2 = kelvin, 3 = Farenheit)");
        sistemaT = scan.nextDouble();
        if(sistemaA == 1 && sistemaT == 2){
        System.out.println("la temeratura en grados Kelvin es: " + convertirCaK(temp));
        } else if (sistemaA == 1 && sistemaT == 3){
        System.out.println("la temperatura en grados Farenheit es: " + convertirCaF(temp));
        }
        else if (sistemaA == 2 && sistemaT ==1) {
        System.out.println("la temperatura en grados Celcius es: " + convertirKaC(temp));
        }
        else if (sistemaA == 2 && sistemaT == 3){
        System.out.println("la temperatura en grados Farenheit es: " + convertirKaF(temp));
        }
        else if (sistemaA == 3 && sistemaT == 1){
        System.out.println("La temperatura en grados celcius es: " + convertirFaC(temp));
        }
        else {
        System.out.println("La temperatura en grados Kelvin es: " + convertirFaK(temp));
        }
    }
    public static double convertirCaF(double CF){
    double F = ((CF * 1.8) + 32);
    return F;
    }
    public static double convertirFaC(double FC){
    double C = ((FC - 32)/ 1.8); 
    return C;
    }
    public static double convertirCaK(double CK){
    double K = (CK + 273.15);
    return K;
    }
    public static double convertirKaC(double KC){
    double C = (KC - 273.15);
    return C;
    }
    public static double convertirKaF(double KF){
    double F = (1.8 * (KF - 273.15)) + 32;
    return F;
    }
    public static double convertirFaK(double FK){
    double K = ((FK - 32)/1.8) + 273.15;
    return K;
    }
}
