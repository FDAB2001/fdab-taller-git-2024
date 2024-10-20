package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia4;

public class Fisico extends Compra {
    String direccion;
    String ciudad;
    String pais;
    String codigoPostal;

    public Fisico(String idPago, String receptor, String emisor, String idItem) {
        super(idPago, receptor, emisor, idItem);
    }

    public void transportar() {
        // Lógica para transportar
    }
}
