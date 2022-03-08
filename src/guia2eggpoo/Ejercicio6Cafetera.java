package guia2eggpoo;

import guia2eggpoo.entidades.Cafetera;
import java.util.Scanner;

public class Ejercicio6Cafetera {

    public static void main(String[] args) {

        Cafetera cafetera1 = new Cafetera();
        Scanner obj = new Scanner(System.in);

        cafetera1.llenarCafetera();

        System.out.println("Ingrese la capacidad en ml de la taza:");
        int capacidadTaza = obj.nextInt();
        
        cafetera1.servirTaza(capacidadTaza);
        
        cafetera1.vaciarCafetera();

        System.out.println("Ingrese la cantidad de café a agregar:");
        int rellenaCafe = obj.nextInt();
        
        cafetera1.agregarCafe(rellenaCafe);

    }
}
