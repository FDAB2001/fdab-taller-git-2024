package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia4;

public class Fisico extends Compra {
    public String direccion;
    public String ciudad;
    public String pais;
    public String codigoPostal;

    public Fisico(String idPago, String receptor, String emisor, String idItem) {
        super(idPago, receptor, emisor, idItem);
    }

    public void transportar() {
        // Lógica para transportar
    }
}
