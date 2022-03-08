package guia2eggpoo;

import guia2eggpoo.Servicios.PersonaServicio;
import guia2eggpoo.entidades.Persona;

public class Ejercicio7Persona {

    public static void main(String[] args) {

        PersonaServicio ps = new PersonaServicio();
        int personasPesoIdeal = 0;
        int personasPesoBajo = 0;
        int personasSobrepeso = 0;
        int mayoresEdad = 0;
        int menoresEdad = 0;

        //crea y rellena datos de las personas
        System.out.println("PRIMER PERSONA:");
        Persona p1 = ps.crearPersona();
        System.out.println("SEGUNDA PERSONA:");
        Persona p2 = ps.crearPersona();
        System.out.println("TERCERA PERSONA:");
        Persona p3 = ps.crearPersona();
        System.out.println("CUARTA PERSONA:");
        Persona p4 = ps.crearPersona();
        
        //DATOS IMC Y esMayorEdad Persona 1
        int IMCPrimerPersona = ps.calcularIMC(p1);
        boolean MayoriaPrimerPersona = ps.esMayorDeEdad(p1);
        System.out.println("RESULTADOS DE LA PRIMER PERSONA:");
        
        if (IMCPrimerPersona == -1) {
            System.out.println("Se encuentra por debajo de su peso ideal");
            personasPesoBajo++;
        } else {
            if (IMCPrimerPersona == 0) {
                System.out.println("Se encuentra en su peso ideal");
                personasPesoIdeal++;
            } else {
                System.out.println("Se encuentra por encima de su peso ideal");
                personasSobrepeso++;
            }
        }

        if (MayoriaPrimerPersona == true) {
            System.out.println("Es mayor de edad");
            mayoresEdad++;
        } else {
            System.out.println("Es menor de edad");
            menoresEdad++;
        }

        //DATOS IMC Y esMayorEdad Persona 2
        int IMCSegundaPersona = ps.calcularIMC(p2);
        boolean MayoriaSegundaPersona = ps.esMayorDeEdad(p2);
        System.out.println("RESULTADOS DE LA SEGUNDA PERSONA:");

        if (IMCSegundaPersona == -1) {
            System.out.println("Se encuentra por debajo de su peso ideal");
            personasPesoBajo++;
        } else {
            if (IMCSegundaPersona == 0) {
                System.out.println("Se encuentra en su peso ideal");
                personasPesoIdeal++;
            } else {
                System.out.println("Se encuentra por encima de su peso ideal");
                personasSobrepeso++;
            }
        }

        if (MayoriaSegundaPersona == true) {
            System.out.println("Es mayor de edad");
            mayoresEdad++;
        } else {
            System.out.println("Es menor de edad");
            menoresEdad++;
        }

        //DATOS IMC Y esMayorEdad Persona 3
        int IMCTercerPersona = ps.calcularIMC(p3);
        boolean MayoriaTercerPersona = ps.esMayorDeEdad(p3);
        System.out.println("RESULTADOS DE LA TERCERA PERSONA:");

        if (IMCTercerPersona == -1) {
            System.out.println("Se encuentra por debajo de su peso ideal");
            personasPesoBajo++;
        } else {
            if (IMCTercerPersona == 0) {
                System.out.println("Se encuentra en su peso ideal");
                personasPesoIdeal++;
            } else {
                System.out.println("Se encuentra por encima de su peso ideal");
                personasSobrepeso++;
            }
        }

        if (MayoriaTercerPersona == true) {
            System.out.println("Es mayor de edad");
            mayoresEdad++;
        } else {
            System.out.println("Es menor de edad");
            menoresEdad++;
        }

        //DATOS IMC Y esMayorEdad Persona 4
        int IMCCuartaPersona = ps.calcularIMC(p4);
        boolean MayoriaCuartaPersona = ps.esMayorDeEdad(p4);
        System.out.println("RESULTADOS DE LA CUARTA PERSONA:");

        if (IMCCuartaPersona == -1) {
            System.out.println("Se encuentra por debajo de su peso ideal");
            personasPesoBajo++;
        } else {
            if (IMCCuartaPersona == 0) {
                System.out.println("Se encuentra en su peso ideal");
                personasPesoIdeal++;
            } else {
                System.out.println("Se encuentra por encima de su peso ideal");
                personasSobrepeso++;
            }
        }

        if (MayoriaCuartaPersona == true) {
            System.out.println("Es mayor de edad");
            mayoresEdad++;
        } else {
            System.out.println("Es menor de edad");
            menoresEdad++;
        }
        
        System.out.println("Porcentaje de personas que están por debajo de su peso:" + (personasPesoBajo * 100) / 4 + "%");
        System.out.println("Porcentaje de personas que están en su peso ideal:" + (personasPesoIdeal * 100) / 4 + "%");
        System.out.println("Porcentaje de personas que están por encima de su peso:" + (personasSobrepeso * 100) / 4 + "%");

        System.out.println("Porcentaje de personas mayores de edad:" + (mayoresEdad * 100) / 4 + "%");
        System.out.println("Porcentaje de personas menores de edad:" + (menoresEdad * 100) / 4 + "%");

    }//cierra main

}
