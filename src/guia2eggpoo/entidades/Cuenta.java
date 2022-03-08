package guia2eggpoo.entidades;

import java.util.Scanner;

public class Cuenta {

    //Scanner global
    public Scanner obj = new Scanner(System.in);

    //atributos
    private int numeroCuenta;
    private long DNICliente;
    private double saldoActual;

    //constructor vacio
    public Cuenta() {
    }

    //constructor por parametros
    public Cuenta(int numeroCuenta, long DNICliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNICliente = DNICliente;
        this.saldoActual = saldoActual;
    }

    //getters y setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNICliente() {
        return DNICliente;
    }

    public void setDNICliente(long DNICliente) {
        this.DNICliente = DNICliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta() {
        System.out.println("Ingrese el número de cuenta:");
        this.numeroCuenta = obj.nextInt();
        System.out.println("Ingrese su DNI:");
        this.DNICliente = obj.nextLong();
        System.out.println("Ingrese su saldo actual:");
        this.saldoActual = obj.nextDouble();
    }

    public void ingresarDinero() {

        System.out.println("Cantidad de dinero a ingresar:");
        double ingreso = obj.nextDouble();
        this.saldoActual = saldoActual + ingreso;
    }

    public void retirarDinero() {

        System.out.println("Cantidad de dinero a retirar:");
        double retiro = obj.nextDouble();
        if (saldoActual <= retiro) {
            saldoActual = 0;
        } else {
            saldoActual = saldoActual - retiro;
        }
    }

    public void extraccionRapida() {
        System.out.println("RECUERDE, SOLO PUEDE RETIRAR HASTA UN 20% DE SU SALDO($" + (saldoActual * 0.2) + ")");
        System.out.println("INGRESE LA CANTIDAD A RETIRAR:");
        double extraccion = obj.nextDouble();

        if (extraccion <= (saldoActual * 0.2)) {
            saldoActual = saldoActual - extraccion;
        } else {
            System.out.println("HA INGRESADO UNA CANTIDAD SUPERIOR AL 20%");
        }
    }

    public void consultarSaldo() {

        System.out.println("EL SALDO DE SU CUENTA ES: $" + saldoActual);

    }

    public void consultarDatos() {
        System.out.println("DATOS DE LA CUENTA:");
        System.out.println("Numero de cuenta:" + numeroCuenta + ", DNI del propietario:" + DNICliente + ", Saldo actual:" + saldoActual);
    }

}
