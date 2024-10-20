package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia3;

public class Tarjeta extends Digital {
    private String debitoNumero;
    private String creditoNumero;

    public Tarjeta(double descuento, int cuotas, String tiendaOnline, String debitoNumero, String creditoNumero) {
        super(descuento, cuotas, tiendaOnline);
        this.debitoNumero = debitoNumero;
        this.creditoNumero = creditoNumero;
    }

    public String getDebitoNumero() {
        return debitoNumero;
    }

    public void setDebitoNumero(String debitoNumero) {
        this.debitoNumero = debitoNumero;
    }

    public String getCreditoNumero() {
        return creditoNumero;
    }

    public void setCreditoNumero(String creditoNumero) {
        this.creditoNumero = creditoNumero;
    }
}