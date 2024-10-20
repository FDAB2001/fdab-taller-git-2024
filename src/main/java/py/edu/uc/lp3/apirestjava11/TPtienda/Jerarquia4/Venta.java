package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia4;

public class Venta {
    private String idPago;

    public Venta(String idPago) {
        this.idPago = idPago;
    }

    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    public void ofrecerVenta() {
        System.out.println("Ofreciendo venta");
    }
}