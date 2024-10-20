package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia2;

public class Vendedor extends Gerente {
    private String vendedorNombre;

    public Vendedor(int id, String nombre, double monedas) {
        super(id, nombre, monedas);
    }

    public void solicitarVentaExterna() {
        // Lógica de solicitud de venta
    }
}