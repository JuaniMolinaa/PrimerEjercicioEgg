package guia2eggpoo.entidades;

public class Arreglo {

    private double arregloA[] = new double[50];
    private double arregloB[] = new double[20];

    //constructor vacio
    public Arreglo() {
    }

    //getters y setters
    public double[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(double[] arregloA) {
        this.arregloA = arregloA;
    }
    
    public double[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }
    
}
