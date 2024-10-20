package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia1;

public class Skin extends Vendible {
    private static int rareza;

    public Skin() {
        super(descripcion, rareza, esTransferible);
    }

    public Skin(int rareza) {
        super(descripcion, rareza, esTransferible);
        this.rareza = rareza;
    }

    public int getRareza() {
        return rareza;
    }

    public void setRareza(int rareza) {
        this.rareza = rareza;
    }

    public void aplicarSkin() {
        System.out.println("Skin aplicado");
    }
}
