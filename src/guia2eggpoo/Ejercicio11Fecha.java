package guia2eggpoo;

import java.util.*;

public class Ejercicio11Fecha {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese un día");
        int dia = obj.nextInt();

        System.out.println("Ingrese un mes");
        int mes = obj.nextInt();

        System.out.println("Ingrese un año");
        int anio = obj.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);
        Date fechaActual = new Date();
        System.out.println("FECHA INGRESADA: " + fecha);
        System.out.println("FECHA ACTUAL: " + fechaActual);
        int anioActual = fechaActual.getYear();
        int diferenciaAnios = anioActual - (anio - 1900);
        
        System.out.println("Diferencia de años entre la fecha ingresada y la fecha actual: " + diferenciaAnios + " años");

    }

}
