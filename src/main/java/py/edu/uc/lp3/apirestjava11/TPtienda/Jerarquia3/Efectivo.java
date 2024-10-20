package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia3;

public class Efectivo extends Fisico {
    private String CantidadInicial;
    public String Vuelto;

    public Efectivo(double descuento, int cuotas, String usuarioAcreditar, String cuenta, String denominacion,
            String ubicacion, String CantidadInicial) {
        super(descuento, cuotas, usuarioAcreditar, cuenta, denominacion, ubicacion);
        this.CantidadInicial = CantidadInicial;
    }

    public String getCantidadInicial() {
        return CantidadInicial;
    }

    public void setCantidadInicial(String CantidadInicial) {
        this.CantidadInicial = CantidadInicial;
    }
}
