package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia1;

public class PersonajeSkin extends Vendible {
    protected String nombrePersonajeAplicable;

    public PersonajeSkin(String nombre, int idTransferencia, boolean esTransferible) {
        super(nombre, idTransferencia, esTransferible);
    }
}
