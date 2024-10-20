package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia1;

public class Vendible extends Transferible {
    public Vendible(String idUniqueString, int idTransferencia, boolean esTransferible) {
        super(idUniqueString, idTransferencia, esTransferible);
        // TODO Auto-generated constructor stub
    }

    public Vendible(String nombre, int idTransferencia, boolean esTransferible, double precio) {
        super(nombre, idTransferencia, esTransferible);
        this.nombre = nombre;
        this.idTransferencia = idTransferencia;
        this.esTransferible = esTransferible;
        this.precio = precio;
    }

    protected String nombre;
    protected double precio;
    protected static String descripcion;

    // ... constructores, getters y setters ...

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void comprar() {
        // Todo agregar
    }
}
