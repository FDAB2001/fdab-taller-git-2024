package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia2;

public class Gerente extends Usuario {

    public Gerente(int id, String nombre, double monedas) {
        super(id, nombre, monedas);
    }

    public void vender() {
        // Lógica de venta
    }
}