package py.edu.uc.lp3.apirestjava11;

public class Empleado extends Usuario {
    private String puesto;
    private double salario;
    private String departamento;

    public Empleado(int id, String nombre, String contraseña, String puesto, double salario, String departamento) {
        super(id, nombre, id, contraseña, departamento, departamento, departamento);
        this.puesto = puesto;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
