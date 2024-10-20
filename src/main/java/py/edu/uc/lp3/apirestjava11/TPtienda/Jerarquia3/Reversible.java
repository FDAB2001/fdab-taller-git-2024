package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia3;

public class Reversible extends Pago {
    private String usuarioAcreditar;
    private String cuenta;

    public Reversible(double descuento, int cuotas, String usuarioAcreditar, String cuenta) {
        super(descuento, cuotas);
        this.usuarioAcreditar = usuarioAcreditar;
        this.cuenta = cuenta;
    }

    public String getUsuarioAcreditar() {
        return usuarioAcreditar;
    }

    public void setUsuarioAcreditar(String usuarioAcreditar) {
        this.usuarioAcreditar = usuarioAcreditar;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void deshacerPago() {
        // Lógica de deshacer pago
    }
}