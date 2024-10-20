package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia2;

public class Usuario extends Entidad {
    private String nombre;
    private double monedas;

    public Usuario(int id, String nombre, double monedas) {
        super(id);
        this.nombre = nombre;
        this.monedas = monedas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonedas() {
        return monedas;
    }

    public void setMonedas(double monedas) {
        this.monedas = monedas;
    }

    public void cargarMonedas() {
        // Lógica de carga de monedas
    }
}