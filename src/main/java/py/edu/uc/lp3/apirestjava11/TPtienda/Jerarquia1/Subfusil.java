package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia1;

// Clase para representar subfusiles
public class Subfusil extends ArmasDeFuego {
    private int precioDinero;
    private int nivelMinimoRequerido;
    private String descripcion;
    private int carga;

    // ... constructores, getters y setters ...

    public Subfusil(int precioDinero, int nivelMinimoRequerido, String nombre, String descripcion) {
        super(nombre); // Call to superclass constructor
        this.precioDinero = precioDinero;
        this.nivelMinimoRequerido = nivelMinimoRequerido;
        this.descripcion = "Set descripcion";
        this.precio = 1700;
        this.nombre = "Sin nombre";
        this.carga = 30;
        setDescripcion(descripcion);
        setNombre(nombre);
    }

    public Subfusil() {
        super("Sin nombre"); // Call to superclass constructor with default values
    }

    public int getPrecioDinero() {
        return precioDinero;
    }

    public void setPrecioDinero(int precioDinero) {
        this.precioDinero = precioDinero;
    }

    public int getNivelMinimoRequerido() {
        return nivelMinimoRequerido;
    }

    public void setNivelMinimoRequerido(int nivelMinimoRequerido) {
        this.nivelMinimoRequerido = nivelMinimoRequerido;
    }
}