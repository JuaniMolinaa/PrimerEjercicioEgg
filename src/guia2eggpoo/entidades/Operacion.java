package guia2eggpoo.entidades;

import java.util.Scanner;

public class Operacion {

    //Scanner global
    public Scanner obj = new Scanner(System.in);

    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        System.out.println("Ingrese el primer número:");
        this.numero1 = obj.nextDouble();
        System.out.println("Ingrese el segundo número");
        this.numero2 = obj.nextDouble();
    }

    public Double sumar() {
        double suma = this.numero1 + this.numero2;
        return suma;
    }

    public Double restar() {
        double resta = this.numero1 - this.numero2;
        return resta;
    }

    public Double multiplicar() {
        double multiplicado;
        if (this.numero1 == 0 || this.numero2 == 0) {
            multiplicado = 0;
        } else {
            multiplicado = this.numero1 * this.numero2;
        }
        return multiplicado;
    }

    public Double dividir() {
        double dividido;
        if (this.numero1 == 0 || this.numero2 == 0) {
            dividido = 0;
        } else {
            dividido = this.numero1 / this.numero2;
        }
        return dividido;
    }
}
