package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia1;

import java.text.DateFormat;

public class Promocional extends Transferible {
    DateFormat diaMaximo = DateFormat.getDateInstance();

    public Promocional(String nombre, int idTransferencia, boolean esTransferible) {
        super(nombre, idTransferencia, esTransferible);
    }
}