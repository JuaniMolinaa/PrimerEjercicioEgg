package guia2eggpoo.entidades;

import java.util.Scanner;

public class Rectangulo {

    //Scanner global
    public Scanner obj = new Scanner(System.in);

    private double base;
    private double altura;

    //constructor con parametros
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //constructor vacio
    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        System.out.println("Ingrese la base del rectángulo:");
        this.base = obj.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        this.altura = obj.nextDouble();
    }

    public Double calcularSuperficie() {
        double superficie = this.base * this.altura;
        return superficie;
    }

    public Double calcularPerimetro() {
        double perimetro = (this.base + this.altura) * 2;
        return perimetro;
    }

    public void dibujarRectangulo() {

        //primera fila
        for (int columna = 1; columna <= base; columna++) {
            System.out.print("*");
        }
        System.out.println();

        //filas intermedias
        for (int fila = 1; fila <= altura - 2; fila++) {
            System.out.print("*");
            for (int columna = 1; columna <= base; columna++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        //ultima fila
        for (int columna = 1; columna <= base; columna++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
