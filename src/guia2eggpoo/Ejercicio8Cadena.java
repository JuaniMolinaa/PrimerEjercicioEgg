package guia2eggpoo;

import guia2eggpoo.Servicios.CadenaServicio;
import java.util.Scanner;

public class Ejercicio8Cadena {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cs = new CadenaServicio();

        cs.crearCadena();
        cs.mostrarVocales();
        cs.invertirFrase();
        System.out.println("Ingrese un carácter para ver cuántas veces se repite");
        String letra = obj.next();
        cs.vecesRepetido(letra);
        System.out.println("Ingrese una segunda frase");
        String segundaFrase = obj.next();
        cs.compararLongitud(segundaFrase);
        System.out.println("Ingrese una tercera frase para unirla con la primera");
        String tercerFrase = obj.next();
        cs.unirFrases(tercerFrase);
        System.out.println("Ingrese un carácter que desee reemplazar de la primer frase");
        String caracterReemplazar = obj.next();
        cs.reemplazar(caracterReemplazar);
        System.out.println("Ingrese un carácter para ver si se encuentra en la primera frase");
        String buscarCaracter = obj.next();
        cs.contiene(buscarCaracter);
    }
}
