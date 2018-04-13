package imagem;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import java.awt.Image;
import imagem.efeitos.EfeitosCor;

public class Imagem {
    private BufferedImage imagemInterna;
    private ImageIcon iconeImagem;
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
    
    public void criarNovaImagem(int[] red, int[] green, int[] blue, int width, int height) {
        this.corRgb = new Rgb(red, green, blue);
        this.imagemInterna = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        this.corRgb.converterParaFormatoInterno(imagemInterna);
    }
    
    public BufferedImage getImagemInterna() {
        return this.imagemInterna;
    }
    
    public void atualizarIcone(int labelWidth, int labelHeight) {
        iconeImagem = new ImageIcon(imagemInterna.getScaledInstance(
                labelWidth, labelHeight, Image.SCALE_SMOOTH));
    }
    
    public ImageIcon getIcone() {
        return this.iconeImagem;
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
