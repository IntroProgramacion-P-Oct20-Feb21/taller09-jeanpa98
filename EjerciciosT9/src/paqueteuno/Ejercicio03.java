/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia = 0;
        int elementosAbajoMedia = 0;
        int suma = 0; 
        double media = 0;
        // Utilizando el metodo for se suma cada valor del arreglo
        for (int indice = 0; indice < arreglo.length; indice++) {
            // en la variable suma se va almacenando la suma del arreglo
            suma = suma + arreglo[indice];
        }
         // Obtenemos el resultado de la media con la  variable de la suma 
         //y  con el .length 
        media = (double) suma / arreglo.length;  

            /* 
              Se utiliza una condicion para identificar los elementos 
            que esta arriba de la medio y abajo de la media
             */
          
        for (int indice = 0; indice < arreglo.length; indice++) {
         
            if (arreglo[indice] > media) {
                elementosArribaMedia = elementosArribaMedia + 1;
            } else {
                elementosAbajoMedia = elementosAbajoMedia + 1;

            }

        }

        System.out.printf("Elementos arriba de la media aritmetica: %s\n"
                + "Elementos por debajo de la media aritmetica: %s\n",
                elementosArribaMedia, elementosAbajoMedia);

        
    }

}
