package guia2eggpoo;

import java.util.*;

public class Ejercicio10Arreglo {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in).useDelimiter("\n");

        double arregloA[] = new double[50];
        double arregloB[] = new double[20];
        //llenado de arregloA
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = ((Math.random() * 50 + 1));
        }
        //ordena arregloA de forma ascendente
        Arrays.sort(arregloA);

        System.out.println("ARREGLO A ORDENADO:");
        System.out.println(Arrays.toString(arregloA));

        //lleno los primeros 10 valores del arregloB
        for (int j = 0; j < 10; j++) {
            arregloB[j] = arregloA[j];
        }
        //lleno los ultimos 10 valores del arregloB
        Arrays.fill(arregloB, 10, 20, 0.5);

        System.out.println("ARREGLO B:");
        System.out.println(Arrays.toString(arregloB));

    }//cierra main

}//ciera clase Ejercicio10Arreglo
