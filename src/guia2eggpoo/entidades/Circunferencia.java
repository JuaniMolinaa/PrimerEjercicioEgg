package guia2eggpoo.entidades;

import java.util.Scanner;

public class Circunferencia {

    //atributos
    private double radio;

    //Scanner global
    public Scanner obj = new Scanner(System.in);

    //constructor vacio
    public Circunferencia() {
    }

    //metodo constructor
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    //getter and setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //metodo para crear circunferencia
    public void crearCircunferencia() {
        System.out.println("Ingrese el tamaño del radio");
        this.radio = obj.nextDouble();
    }

    public void area() {
        double area;
        area = Math.PI * Math.pow(this.radio, 2);
        System.out.println("El área es: " + area);
    }

    public void perimetro() {
        double perimetro;
        perimetro = 2 * Math.PI * this.radio;
        System.out.println("El perímetro es: " + perimetro);
    }
}
