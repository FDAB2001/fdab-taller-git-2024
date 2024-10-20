package py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia2;

import java.sql.Date;

public class Jugador extends Usuario {
    protected String plataforma;
    protected Date ultimoAcceso;

    public Jugador(int id, String nombre, double monedas) {
        super(id, nombre, monedas);
        // TODO Auto-generated constructor stub
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Date getUltimoAcceso() {
        return ultimoAcceso;
    }

    public void setUltimoAcceso(Date ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }

    public void recuperarCuenta() {
        // Lógica de recuperar cuenta
    }

}
