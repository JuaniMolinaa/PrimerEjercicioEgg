package guia2eggpoo;

import guia2eggpoo.entidades.Libro;
import java.util.Scanner;

public class Ejercicio1Libro {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in).useDelimiter("\n");

        Libro libroUsuario = new Libro();

        System.out.println("Ingrese el ISBN del libro:");
        int ISBN = obj.nextInt();
        System.out.println("Ingrese el titulo del libro:");
        String titulo = obj.next();
        System.out.println("Ingrese el autor del libro:");
        String autor = obj.next();
        System.out.println("Ingrese el número de páginas del libro:");
        int numPags = obj.nextInt();
        libroUsuario.pedirDatos(ISBN, titulo, autor, numPags);

        System.out.println("DATOS DEL LIBRO INGRESADO:");
        System.out.println(libroUsuario.toString());

    }

}
