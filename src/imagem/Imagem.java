package imagem;

import java.awt.image.BufferedImage;

public class Imagem {
    private BufferedImage imagemInterna;
    private Rgb corRgb;
    private final int width;
    private final int height;
    
    public Imagem(BufferedImage imagemInterna) {
        this.imagemInterna = imagemInterna;
        this.corRgb = new Rgb(imagemInterna);
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
}
