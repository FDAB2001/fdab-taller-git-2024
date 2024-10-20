package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia2;

import py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia1.Vendible;

public class Gerente extends Usuario {
    private Vendible[] vendibles;
    public String vendedoreString;

    public Gerente(int id, String nombre, double monedas) {
        super(id, nombre, monedas);
    }

    public void vender() {
        // Lógica de venta
    }
}