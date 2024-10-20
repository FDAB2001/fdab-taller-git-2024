package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia2;

import py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia1.Vendible;

public class Comprador extends Usuario {
    Vendible compras[];

    public Comprador(int id, String nombre, double monedas) {
        super(id, nombre, monedas);
    }

    public void comprar() {
        // Lógica de compra
    }
}