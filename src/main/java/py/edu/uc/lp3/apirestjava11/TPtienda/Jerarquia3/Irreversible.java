package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia3;

public class Irreversible extends Pago {

    public Irreversible(double descuento, int cuotas) {
        super(descuento, cuotas);
    }

    @Override
    public void recibirPago() {
        // Lógica de recepción de pago irreversible
    }
}