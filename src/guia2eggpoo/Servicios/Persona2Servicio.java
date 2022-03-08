package guia2eggpoo.Servicios;

import guia2eggpoo.entidades.Persona2;
import java.util.Date;
import java.util.Scanner;

public class Persona2Servicio {

    public Scanner obj = new Scanner(System.in).useDelimiter("\n");

    public Persona2 crearPersona2() {

        //instancia objeto de tipo persona
        Persona2 pers2 = new Persona2();
        System.out.println("Ingrese su nombre:");
        pers2.setNombre(obj.next());
        System.out.println("Ingrese su día de nacimiento:");
        int dia = obj.nextInt();
        System.out.println("Ingrese su mes de nacimiento:");
        int mes = obj.nextInt();
        System.out.println("Ingrese su año de nacimiento:");
        int anio = obj.nextInt();
        Date fechaIngresada = new Date(anio - 1900, mes - 1, dia);
        pers2.setFechaNacimiento(fechaIngresada);

        return pers2;
    }

    public int calcularEdad(Persona2 pers) {
        int edad;
        Date fechaActual = new Date();
        int anioActual = fechaActual.getYear() + 1900;
        int mesActual = fechaActual.getMonth();
        int diaActual = fechaActual.getDay();

        int anioIngresado = pers.getFechaNacimiento().getYear() + 1900;
        int mesIngresado = pers.getFechaNacimiento().getMonth();
        int diaIngresado = pers.getFechaNacimiento().getDay();

        int diferenciaAnios = anioActual - anioIngresado;
        edad = diferenciaAnios;

        if (edad > 0) {
            if (mesIngresado > mesActual) {
                edad = edad - 1;
            } else {
                if (mesIngresado == mesActual) {
                    if (diaIngresado > diaActual) {
                        edad = edad - 1;
                    }
                }
            }
        }

        return edad;

    }//cierra calcularEdad

    public boolean menorQue(int edadPersona, int edadIngresada) {

        boolean esMenor;

        if (edadPersona >= edadIngresada) {
            esMenor = false;
        } else {
            esMenor = true;
        }
        return esMenor;
    }//cierra menorQue

    public void mostrarPersona(Persona2 pers) {
        System.out.println("DATOS DE LA PERSONA INGRESADA:");
        System.out.println("Nombre: " + pers.getNombre());
        System.out.println("Fecha de nacimiento: " + pers.getFechaNacimiento());

    }

}//cierra Persona2Servicio
