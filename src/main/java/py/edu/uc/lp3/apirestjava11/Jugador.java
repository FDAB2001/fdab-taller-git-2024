package py.edu.uc.lp3.apirestjava11;

public class Jugador extends Usuario {
    private double saldo;

    public Jugador(int id, String nombre, String contraseña, double saldo) {
        super(id, nombre, id, contraseña, contraseña, contraseña, contraseña);
        this.saldo = saldo;
    }

    // Getters y Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}