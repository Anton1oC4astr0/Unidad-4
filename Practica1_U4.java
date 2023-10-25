/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1_u4;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Practica1_U4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] elementos = {20.5,40.6,78.4,94.7,55.3,22.6,84.3};
        Scanner scanner = new Scanner (System.in);
       
        int opcion;
        do{
            System.out.println("Elija la opcion deseada");
            System.out.println("1. Suma");
            System.out.println("2. Multiplicacion");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    double suma = 0;
                    for (int i = 0; i < elementos.length; i++) {
                        suma = suma + elementos[i];
                    }
                        System.out.println("Resultado: " + suma);
                        
                        break;
                        
                case 2: 
                    double multiplicacion = 1;
                    for (int i = 0; i < elementos.length; i++) {
                        multiplicacion = multiplicacion*elementos[i];
                    }
                    System.out.println("Resultado: " + multiplicacion);
                    
                    break;
                    
                case 3:
                    System.out.println("Ha salido del programa");
                    
                    break;
                    
                    
                default: 
                    System.out.println("opcion no valida");

                    }
                
            
        } while (opcion !=3);
    }
 
}