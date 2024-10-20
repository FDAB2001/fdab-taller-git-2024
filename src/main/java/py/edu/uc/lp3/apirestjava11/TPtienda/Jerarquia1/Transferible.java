package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia1;

public class Transferible extends Objeto {
    protected static int idTransferencia;
    protected static boolean esTransferible;

    public Transferible(String nombre, int idTransferencia, boolean esTransferible) {
        super(nombre);
        this.idTransferencia = idTransferencia;
        this.esTransferible = esTransferible;
    }

    public int getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(int idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public boolean isEsTransferible() {
        return esTransferible;
    }

    public void setEsTransferible(boolean esTransferible) {
        this.esTransferible = esTransferible;
    }

    public void transferir() {
        // Lógica de transferencia
    }
}