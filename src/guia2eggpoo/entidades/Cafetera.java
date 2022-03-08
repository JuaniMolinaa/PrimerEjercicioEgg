package guia2eggpoo.entidades;

import java.util.Scanner;

public class Cafetera {

    //Scanner global
    public Scanner obj = new Scanner(System.in);

    //atributos
    private int capacidadMaxima;
    private int cantidadActual;
    private int capacidadTaza;

    //constructor vacio
    public Cafetera() {
    }

    //constructor por parametro
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    //getters and setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        System.out.println("Ingrese la capacidad máxima en ml de la cafetera:");
        capacidadMaxima = obj.nextInt();
        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int capacidadTaza) {

        if (capacidadTaza <= cantidadActual) {
            cantidadActual -= capacidadTaza;
            System.out.println("LA TAZA SE LLENÓ CON " + capacidadTaza + "ml");
            System.out.println("QUEDAN " + cantidadActual + "ml EN LA CAFETERA");
        } else {
            capacidadTaza = cantidadActual;
            cantidadActual -= capacidadTaza;
            System.out.println("LA TAZA NO SE LLENÓ, POSEE " + capacidadTaza + "ml DE CAFÉ");
            System.out.println("LA CAFETERA QUEDÓ EN " + cantidadActual);
        }

    }

    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("SE VACIÓ LA CAFETERA");
    }

    public void agregarCafe(int rellenaCafe) {

        cantidadActual = cantidadActual + rellenaCafe;
        System.out.println("AHORA LA CAFETERA POSEE " + cantidadActual + "ml DE CAFÉ");
    }

}
