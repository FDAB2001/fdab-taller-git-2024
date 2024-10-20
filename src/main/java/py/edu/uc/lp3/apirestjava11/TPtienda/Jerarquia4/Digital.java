package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia4;

public class Digital extends Compra {
    public String objetoARecibirString;
    String objetoARecibir;
    String linkDescargaComprobanteString;

    public Digital(String idPago, String receptor, String emisor, String idItem) {
        super(idPago, receptor, emisor, idItem);
    }
}
