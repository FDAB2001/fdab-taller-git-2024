package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia4;

import java.sql.Date;

import py.edu.uc.lp3.apirestjava11.Usuario;
import py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia1.Objeto;

public class Servicio extends Trueque {
    Date tiempoDate;
    Usuario usuariosAfectados[];

    public Servicio(String idPago, String receptor, String emisor, Objeto objetoARecibir, Objeto objetoADar) {
        super(idPago, receptor, emisor, objetoARecibir, objetoADar);
    }
}