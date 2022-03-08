package guia2eggpoo.Servicios;

import guia2eggpoo.entidades.Matematica;
import java.util.Scanner;

public class MatematicaServicio {

    public Scanner obj = new Scanner(System.in).useDelimiter("\n");
    public Matematica mat = new Matematica();

    public void llenarNumeros() {
        mat.setPrimerNum((Math.random() * 10 + 1));
        mat.setSegundoNum((Math.random() * 10 + 1));
    }//cierra llenarNumeros

    public void devolverMayor() {
        if (mat.getPrimerNum() > mat.getSegundoNum()) {
            System.out.println("El mayor número es: " + mat.getPrimerNum());
            System.out.println("El menor número es: " + mat.getSegundoNum());

        } else {
            if (mat.getSegundoNum() > mat.getPrimerNum()) {
                System.out.println("El mayor número es: " + mat.getSegundoNum());
                System.out.println("El menor número es: " + mat.getPrimerNum());

            } else {
                System.out.println("Los números son iguales");
            }
        }
    }//cierra devolverMayor

    public void calcularPotencia() {
        double resultPotencia;
        double primerValor = Math.round(mat.getPrimerNum());
        double segundoValor = Math.round(mat.getSegundoNum());

        if (primerValor > segundoValor) {
            resultPotencia = Math.pow(primerValor, segundoValor);
        } else {
            if (segundoValor > primerValor) {
                resultPotencia = Math.pow(segundoValor, primerValor);
            } else {
                resultPotencia = Math.pow(primerValor, primerValor);
            }
        }
        System.out.println("El resultado de la potencia es: " + resultPotencia);

    }//cierra calcularPotencia

    public void calcularRaiz() {

        double primerNum = (int) Math.round(mat.getPrimerNum());
        double segundoNum = (int) Math.round(mat.getSegundoNum());

        if (primerNum > segundoNum) {
            System.out.println("La raíz cuadrada del número " + segundoNum + " es: " + Math.sqrt(segundoNum));
        } else {
            if (segundoNum > primerNum) {
                System.out.println("La raíz cuadrada del número " + primerNum + " es: " + Math.sqrt(primerNum));
            } else {
                System.out.println("La raíz cuadrada del número " + segundoNum + " es: " + Math.sqrt(segundoNum));
            }
        }
    }

}//cierra clase MatematicaServicio
