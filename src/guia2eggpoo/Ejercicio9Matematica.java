package guia2eggpoo;

import guia2eggpoo.Servicios.MatematicaServicio;

public class Ejercicio9Matematica {

    public static void main(String[] args) {
        MatematicaServicio ms = new MatematicaServicio();

        ms.llenarNumeros();
        ms.devolverMayor();
        ms.calcularPotencia();
        ms.calcularRaiz();

    }//cierra main

}//cierra clase Ejercicio9Matematica
