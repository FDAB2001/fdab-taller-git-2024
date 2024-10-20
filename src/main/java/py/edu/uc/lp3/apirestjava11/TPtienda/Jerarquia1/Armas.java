package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia1;

public class Armas extends Vendible {
    public Armas(String idUniqueString) {
        super(idUniqueString, nivelMinimoRequerido, esTransferible);
        // TODO Auto-generated constructor stub
    }

    protected int precioDinero;
    protected static int nivelMinimoRequerido;

    // ... constructores, getters y setters ...
    public void danhar() {
        // Todo agregar
    }
}
