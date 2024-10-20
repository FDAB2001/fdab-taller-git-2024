package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia3;

public class Pago {
    private double descuento;
    public double monto;
    private int cuotas;

    public Pago(double descuento, int cuotas) {
        this.descuento = descuento;
        this.cuotas = cuotas;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public void recibirPago() {
        // Lógica de recepción de pago
    }
}