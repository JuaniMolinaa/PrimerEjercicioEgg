package guia2eggpoo;

import guia2eggpoo.Servicios.Persona2Servicio;
import guia2eggpoo.entidades.Persona2;
import java.util.Scanner;

public class Ejercicio12Persona2 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in).useDelimiter("\n");
        Persona2Servicio ps2 = new Persona2Servicio();
        System.out.println("CARGUE LOS DATOS DE LA PRIMER PERSONA:");
        Persona2 p1 = ps2.crearPersona2();

        int edadPersona1 = ps2.calcularEdad(p1);
        System.out.println("INGRESE OTRA EDAD PARA COMPARARLA CON LA DE LA PRIMER PERSONA:");
        int edad = obj.nextInt();

        boolean esMenor = ps2.menorQue(edadPersona1, edad);

        if (esMenor == false) {
            System.out.println("La persona es mayor que la edad ingresada");
        } else {
            System.out.println("La persona es menor que la edad ingresada");
        }

        ps2.mostrarPersona(p1);

    }//cierra main

}//cierra clase Ejercicio12Persona2
