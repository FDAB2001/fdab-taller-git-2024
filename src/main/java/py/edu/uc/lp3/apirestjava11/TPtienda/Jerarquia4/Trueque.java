package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia4;

import py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia1.Objeto;

public class Trueque extends Transaccion {
    private Objeto objetoARecibir;
    private Objeto objetoADar;

    public Trueque(String idPago, String receptor, String emisor, Objeto objetoARecibir, Objeto objetoADar) {
        super(idPago, receptor, emisor);
        this.objetoARecibir = objetoARecibir;
        this.objetoADar = objetoADar;
    }

    public Objeto getObjetoARecibir() {
        return objetoARecibir;
    }

    public void setObjetoARecibir(Objeto objetoARecibir) {
        this.objetoARecibir = objetoARecibir;
    }

    public Objeto getObjetoADar() {
        return objetoADar;
    }

    public void setObjetoADar(Objeto objetoADar) {
        this.objetoADar = objetoADar;
    }
}