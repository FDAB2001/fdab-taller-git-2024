package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia4;

public class Compra extends Transaccion {
    private String idItem;

    public Compra(String idPago, String receptor, String emisor, String idItem) {
        super(idPago, receptor, emisor);
        this.idItem = idItem;
    }

    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }
}