/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3_u4u5;

/**
 *
 * @author Usuario
 */
public class Practica3_U4U5 {

    /**
     * @param args the command line arguments
     */
    public static void promedioEstudiantes (double [][] calificaciones){
        for (int i = 0; i < calificaciones.length; i++) {//calificaciones
            double sumaCalif = 0;
            for (int j = 0; j < calificaciones [i].length; j++) {//suma de calificaciones
                sumaCalif += calificaciones [i][j];
            }
            double promedioEstudiantes = sumaCalif / calificaciones[i].length;
            System.out.println("El promedio del estudiante " + (i+1) + " es de: " + promedioEstudiantes);
        }
    }
    public static void promedioMateria(double [][] calificacionesM) {
        for (int i = 0; i < calificacionesM [0].length; i++) {
            for (int j = 0; j < calificacionesM.length; j++) {
                System.out.println(calificacionesM[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        double [][] calificaciones = {
            {90.5,85.0,78.5,92.0},
            {88.0,76.5,89.0,94.5},
            {70.0,82.5,91.0,87.5}
        };
        Practica3_U4U5.promedioEstudiantes(calificaciones);
        Practica3_U4U5.promedioMateria(calificaciones);
    }
    
}
