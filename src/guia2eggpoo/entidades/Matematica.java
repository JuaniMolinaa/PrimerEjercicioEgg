package guia2eggpoo.entidades;

public class Matematica {

    //atributos
    private double primerNum;
    private double segundoNum;

    //constructor vacio
    public Matematica() {
    }

    //constructor por parametros
    public Matematica(double primerNum, double segundoNum) {
        this.primerNum = primerNum;
        this.segundoNum = segundoNum;
    }

    //getters y setter
    public double getPrimerNum() {
        return primerNum;
    }

    public void setPrimerNum(double primerNum) {
        this.primerNum = primerNum;
    }

    public double getSegundoNum() {
        return segundoNum;
    }

    public void setSegundoNum(double segundoNum) {
        this.segundoNum = segundoNum;
    }

}
