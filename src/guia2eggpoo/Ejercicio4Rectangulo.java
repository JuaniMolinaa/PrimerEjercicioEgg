package guia2eggpoo;

import guia2eggpoo.entidades.Rectangulo;

public class Ejercicio4Rectangulo {

    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo();

        rectangulo1.crearRectangulo();
        System.out.println("El perímetro es:" + rectangulo1.calcularPerimetro());
        System.out.println("El perímetro es:" + rectangulo1.calcularSuperficie());
        rectangulo1.dibujarRectangulo();

    }
}
