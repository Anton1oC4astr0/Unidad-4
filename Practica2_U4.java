/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2.arreglosbidimensionales;

/**
 *
 * @author Usuario
 */
public class Practica2_U4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char [][] letras = new char [3][5];
        char b = 'a';
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                letras [i][j] = b;
                b++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(letras [i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
