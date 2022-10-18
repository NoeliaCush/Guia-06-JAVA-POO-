package guia06pooejaprendizaje10;

import java.util.Arrays;

public class Guia06POOEjAprendizaje10 {

    public static void main(String[] args) {

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        //deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random() * 100;

            for (int j = 0; j < arregloA.length; j++) {
                System.out.println(arregloA[i]);
            }

        }

        for (int i = 0; i < arregloB.length; i++) {
            arregloB[i] = Math.random() * 100;

        }
        // el arreglo A se debe ordenar de menor a mayor
        Arrays.sort(arregloA);

        /**
         * o, el arreglo A se debe ordenar de menor a mayor y copiar los
         * primeros 10 números ordenados al arreglo B de 20 elementos, y
         * rellenar los 10 últimos elementos con el valor 0.5.
         */
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                arregloB[i] = arregloA[i];
            } else {
                arregloB[i] = 0.5;
            }
        }

        /**
         * Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y
         * el combinado de 20
         */
        for (int i = 0; i < 50; i++) {
            if (i < 20) {
                System.out.println("arreglo B [ " + arregloB[i] + " ]");
            }
        }

        for (int i = 0; i < 50; i++) {
            System.out.println("arreglo A [ " + arregloA[i] + " ]");
        }

    }
}
