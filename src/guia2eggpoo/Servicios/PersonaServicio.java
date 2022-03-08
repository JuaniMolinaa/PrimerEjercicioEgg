package guia2eggpoo.Servicios;

import guia2eggpoo.entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    public Persona crearPersona() {
        Scanner obj = new Scanner(System.in).useDelimiter("\n");
        
        //instancia objeto de tipo persona
        Persona pers = new Persona();

        boolean opcBien = false;
        //relleno de atributos
        System.out.println("Ingrese su nombre");
        pers.setNombre(obj.nextLine());

        //relleno de genero
        do {
            System.out.println("Ingrese su género");
            System.out.println("Hombre = H\nMujer = M\nOtro = O");
            String generoIngresado = obj.nextLine();

            if ((generoIngresado.equalsIgnoreCase("H") || generoIngresado.equalsIgnoreCase("M") || generoIngresado.equalsIgnoreCase("O"))) {

                pers.setSexo(generoIngresado);
                opcBien = true;
                break;
            } else {
                System.out.println("ERROR - INGRESE UNA OPCION VALIDA");
                opcBien = false;
            }
        } while (opcBien == false);

        System.out.println("Ingrese su edad");
        pers.setEdad(obj.nextInt());
        System.out.println("Ingrese su altura en cm");
        pers.setAltura(obj.nextDouble());
        System.out.println("Ingrese su peso");
        pers.setPeso(obj.nextDouble());

        return pers;
    }

    public int calcularIMC(Persona p1) {
        
        int analizarIMC;

        //formula para calcular IMC
        double IMC = p1.getPeso() / ((Math.pow((p1.getAltura() / 100), 2)));
        
        //comprobaciones de IMC
        if (IMC < 20) {
            analizarIMC = -1;
        } else {
            if (IMC >= 20 && IMC <= 25) {
                analizarIMC = 0;
            } else {
                analizarIMC = 1;
            }
        }
        return analizarIMC;
    }

    public boolean esMayorDeEdad(Persona p1) {

        boolean comprobarEdad = false;

        if (p1.getEdad() >= 18) {
            comprobarEdad = true;
        }
        
        return comprobarEdad;
    }

}
