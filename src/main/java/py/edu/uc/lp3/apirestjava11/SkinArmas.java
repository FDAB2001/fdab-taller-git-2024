package py.edu.uc.lp3.apirestjava11;

public class SkinArmas extends Skin{
    String nombreSkinArma;

    public SkinArmas(String armaSkin){
        super();
        this.nombreSkinArma=armaSkin;
    }

    public SkinArmas(int rareza) {
        super(rareza);
    }

    public void setNombreSkinArma(String nombreSkinArma) {
        this.nombreSkinArma = nombreSkinArma;
    }
}
