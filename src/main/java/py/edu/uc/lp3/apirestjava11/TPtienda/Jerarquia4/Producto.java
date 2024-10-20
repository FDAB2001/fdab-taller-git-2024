package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia4;

import py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia1.Objeto;

public class Producto extends Trueque {
    private String marca;
    private String modelo;

    public Producto(String idPago, String receptor, String emisor, Objeto objetoARecibir, Objeto objetoADar) {
        super(idPago, receptor, emisor, objetoARecibir, objetoADar);
    }
}