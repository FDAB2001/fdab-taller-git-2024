package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia1;

public class Baile extends Promocional {
    protected String tipo;

    public Baile(String nombre, int idTransferencia, boolean esTransferible) {
        super(nombre, idTransferencia, esTransferible);
    }
}