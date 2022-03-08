package guia2eggpoo;

import guia2eggpoo.entidades.Cuenta;

public class Ejercicio5Cuenta {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta();

        cuenta1.crearCuenta();
        cuenta1.ingresarDinero();
        cuenta1.retirarDinero();
        cuenta1.extraccionRapida();
        cuenta1.consultarSaldo();
        cuenta1.consultarDatos();

    }
}
