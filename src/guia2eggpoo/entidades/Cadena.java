package guia2eggpoo.entidades;

public class Cadena {
    
    //atributos
    private String frase;
    private int longFrase;
    
    //constructor vacio
    public Cadena() {
    }
    
    //constructor por parametros
    public Cadena(String frase, int longFrase) {
        this.frase = frase;
        this.longFrase = longFrase;
    }
    
    //getters and setters

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongFrase() {
        return longFrase;
    }

    public void setLongFrase(int longFrase) {
        this.longFrase = longFrase;
    }
    
}
    