package py.edu.uc.lp3.apirestjava11;

// Usuario.java
public class Usuario extends Persona {
    private String contraseña;

    public Usuario(int id, String nombre, int edad, String direccion, String telefono, String email,
            String contraseña) {
        super(id, nombre, edad, direccion, telefono, email);
        this.contraseña = contraseña;
    }

    // Getters y Setters
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
