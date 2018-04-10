package imagem;

import java.awt.image.BufferedImage;
import imagem.efeitos.EfeitosCor;

public class Imagem {
    private BufferedImage imagemInterna;
    private Rgb corRgb;
    private EfeitosCor efeitosCor;
    private final int width;
    private final int height;
    
    public Imagem(BufferedImage imagemInterna) {
        this.imagemInterna = imagemInterna;
        this.corRgb = new Rgb(imagemInterna);
        this.efeitosCor = new EfeitosCor(this);
        this.width = imagemInterna.getWidth();
        this.height = imagemInterna.getHeight();
    }
    
    public BufferedImage getImagemInterna() {
        return this.imagemInterna;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public Rgb getRgb() {
        return this.corRgb;
    }
    
    public EfeitosCor getEfeitosCor() {
        return this.efeitosCor;
    }
    
    public void comecarAlteracao() {
        
    }
    
    public void terminarAlteracao() {
        corRgb.converterParaFormatoInterno(imagemInterna);
    }
}
