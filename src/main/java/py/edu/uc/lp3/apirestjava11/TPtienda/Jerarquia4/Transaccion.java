package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia4;

public class Transaccion extends Venta {
    private String receptor;
    private String emisor;

    public Transaccion(String idPago, String receptor, String emisor) {
        super(idPago);
        this.receptor = receptor;
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public void recibirObjeto() {
        // Lógica para recibir pago
    }
}
