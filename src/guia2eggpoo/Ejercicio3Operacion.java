package guia2eggpoo;

import guia2eggpoo.entidades.Operacion;

public class Ejercicio3Operacion {

    public static void main(String[] args) {

        Operacion op1 = new Operacion();

        op1.crearOperacion();
        System.out.println("El resultado de la suma es: " + op1.sumar());
        System.out.println("El resultado de la resta es: " + op1.restar());

        if (op1.multiplicar() == 0) {
            System.out.println("ERROR! multiplicar un número por 0 es 0");
        } else {
            System.out.println("El resultado de la multiplicación es: " + op1.multiplicar());
        }

        if (op1.dividir() == 0) {
            System.out.println("ERROR! No se puede dividir por 0");
        } else {
            System.out.println("El resultado de la división es: " + op1.dividir());
        }
    }
}
