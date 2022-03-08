package guia2eggpoo.entidades;

public class Libro {

    //atributos
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPags;

    //constructor vacio
    public Libro() {
    }

    //constructor por parametros
    public Libro(int ISBN, String titulo, String autor, int numPags) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
    }

    public void pedirDatos(int ISBN, String titulo, String autor, int numPags) {

        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
    }

    @Override
    public String toString() {
        return "El libro es: " + titulo + ", su ISBN es: " + ISBN + " , el autor es: " + autor + " y tiene " + numPags + " páginas";
    }

}
