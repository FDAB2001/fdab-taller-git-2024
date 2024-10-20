package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia2;

public class Proveedor extends Entidad {
    private String empresa;
    private String productos;
    private String contacto;

    public Proveedor(int id, String empresa, String productos) {
        super(id);
        this.empresa = empresa;
        this.productos = productos;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
}
