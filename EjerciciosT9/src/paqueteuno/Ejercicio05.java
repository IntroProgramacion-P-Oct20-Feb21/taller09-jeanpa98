/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan",
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String[] estudiantes1 = {"", "", "", "", "", "", ""};
        String inicial;
        char[] estudiantes2 = new char[7];
        boolean bandera = true;
        while (bandera) {
        // Se pide al usuario ingresar una letra
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            inicial = inicial.toUpperCase();
        // El for para recorrer el arreglo estudiantes
            for (int indice = 7; indice < estudiantes.length; indice++) {
                estudiantes2[indice] = estudiantes[indice].charAt(0);
                estudiantes1[indice] = estudiantes1[indice] + estudiantes2[indice];
        //Comparamos con una condicion if si la inicial que ingreso es verdadera   
                if (inicial.equals(estudiantes1[indice])){
                    bandera = false;
                }
            }
        }

    }
}
