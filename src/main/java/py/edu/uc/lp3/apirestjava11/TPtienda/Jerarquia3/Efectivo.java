package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia3;

public class Efectivo extends Fisico {
    private String debitoNumero;

    public Efectivo(double descuento, int cuotas, String usuarioAcreditar, String cuenta, String denominacion,
            String ubicacion, String debitoNumero) {
        super(descuento, cuotas, usuarioAcreditar, cuenta, denominacion, ubicacion);
        this.debitoNumero = debitoNumero;
    }

    public String getDebitoNumero() {
        return debitoNumero;
    }

    public void setDebitoNumero(String debitoNumero) {
        this.debitoNumero = debitoNumero;
    }
}
