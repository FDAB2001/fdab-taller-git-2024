package py.edu.uc.lp3.apirestjava11;

public class SkinPersonajes extends Skin{
    String nombreSkinPersonajes;

    public void SkinPersonajes(String nombreSkinPersonajes){
        this.nombreSkinPersonajes=nombreSkinPersonajes;
    }
    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }
}
