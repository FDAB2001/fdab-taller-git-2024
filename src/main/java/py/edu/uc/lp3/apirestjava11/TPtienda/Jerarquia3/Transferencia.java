package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia3;

public class Transferencia extends Fisico {
    private String bancoNumero;

    public Transferencia(double descuento, int cuotas, String usuarioAcreditar, String cuenta, String denominacion,
            String ubicacion, String bancoNumero) {
        super(descuento, cuotas, usuarioAcreditar, cuenta, denominacion, ubicacion);
        this.bancoNumero = bancoNumero;
    }

    public String getBancoNumero() {
        return bancoNumero;
    }

    public void setBancoNumero(String bancoNumero) {
        this.bancoNumero = bancoNumero;
    }
}