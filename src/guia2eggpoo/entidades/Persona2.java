package guia2eggpoo.entidades;

import java.util.Date;

public class Persona2 {

    //atributos
    private String nombre;
    private Date fechaNacimiento;

    //constructor vacio
    public Persona2() {
    }

    //constructor por parametros
    public Persona2(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
