package guia2eggpoo.Servicios;

import guia2eggpoo.entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    public Scanner obj = new Scanner(System.in).useDelimiter("\n");
    public Cadena c1 = new Cadena();

    public Cadena crearCadena() {

        System.out.println("Ingrese la primera frase");
        c1.setFrase(obj.nextLine());
        c1.setLongFrase(c1.getFrase().length());

        return c1;
    }

    public void mostrarVocales() {

        int cantVocales = 0;
        String frase = c1.getFrase().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i') || (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u')) {
                cantVocales++;
            }
        }
        System.out.println("La frase tiene: " + cantVocales + " vocales");
    }//cierra mostrarVocales

    public void invertirFrase() {
        //stringbuilder sirve para invertir cadenas
        //StringBuilder sb = new StringBuilder(c1.getFrase());
        //System.out.println(sb.reverse());
        System.out.print("Frase invertida: ");
        for (int i = c1.getLongFrase() - 1; i >= 0; i--) {
            System.out.print(c1.getFrase().charAt(i));
        }
        System.out.println("");
    }//cierra invertirFrase

    public void vecesRepetido(String letra) {
        int repite = 0;
        String frase = c1.getFrase().toLowerCase();
        letra = letra.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            if ((frase.substring(i, i + 1).equals(letra))) {
                repite++;
            }
        }
        System.out.println("El carácter ingresado se repite " + repite + " veces");
    }//cierra vecesRepetido

    public void compararLongitud(String frase) {

        int longSegundaFrase = frase.length();
        if (longSegundaFrase == c1.getLongFrase()) {
            System.out.println("Las frases poseen la misma cantidad de carácteres");
        } else {
            if (longSegundaFrase < c1.getLongFrase()) {
                System.out.println("La primera frase posee " + (c1.getLongFrase() - longSegundaFrase) + " carácter/es más que la segunda");
            } else {
                System.out.println("La segunda frase posee " + (longSegundaFrase - c1.getLongFrase()) + " carácter/es más que la primera");
            }
        }

    }//cierra compararLongitud

    public void unirFrases(String frase) {
        System.out.println("PRIMERA Y TERCERA FRASE UNIDAS:");
        System.out.println(c1.getFrase().concat(frase));

    }//cierra unirFrases

    public void reemplazar(String letra) {
        System.out.println("Ahora ingrese el carácter por el cual lo desea reemplazar");
        String caracterReemplazado = obj.next();
        System.out.println("LA FRASE QUEDÓ:");
        System.out.println(c1.getFrase().replace(letra, caracterReemplazado));

    }//cierra reemplazar

    public void contiene(String letra) {

        if (c1.getFrase().contains(letra)) {
            System.out.println("La primer frase SI contiene el carácter: " + letra);
        } else {
            System.out.println("La primer frase NO contiene el carácter: " + letra);
        }

    }//cierra metodo contiene

}
