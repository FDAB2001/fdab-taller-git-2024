package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia3;

public class Digital extends Irreversible {
    private String tiendaOnline;

    public Digital(double descuento, int cuotas, String tiendaOnline) {
        super(descuento, cuotas);
        this.tiendaOnline = tiendaOnline;
    }

    public String getTiendaOnline() {
        return tiendaOnline;
    }

    public void setTiendaOnline(String tiendaOnline) {
        this.tiendaOnline = tiendaOnline;
    }
}