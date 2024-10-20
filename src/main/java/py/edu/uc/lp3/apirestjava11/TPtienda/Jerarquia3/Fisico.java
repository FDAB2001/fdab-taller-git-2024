package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia3;

public class Fisico extends Reversible {
    private String denominacion;
    private String ubicacion;

    public Fisico(double descuento, int cuotas, String usuarioAcreditar, String cuenta, String denominacion,
            String ubicacion) {
        super(descuento, cuotas, usuarioAcreditar, cuenta);
        this.denominacion = denominacion;
        this.ubicacion = ubicacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}