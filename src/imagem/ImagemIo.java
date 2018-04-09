package imagem;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.awt.Component;
import java.awt.image.BufferedImage;

public class ImagemIo {
    JFileChooser EscolherArquivo;
    
    public ImagemIo() {
        EscolherArquivo = new JFileChooser();
    }
    
    public Imagem abrirImagem(Component pai) {
        EscolherArquivo.showOpenDialog(pai);
        File imagem = EscolherArquivo.getSelectedFile();
        BufferedImage imagemInterna;
        try {
            imagemInterna = ImageIO.read(imagem);
            return new Imagem(imagemInterna);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    public void SalvarImagem(Component pai, BufferedImage imagem) {
        EscolherArquivo.showSaveDialog(pai);
        File imagemSalvar = EscolherArquivo.getSelectedFile();
        String imagemEndereco = imagemSalvar.getAbsolutePath();
        String formatoImagem = imagemEndereco.substring(imagemEndereco.lastIndexOf(".") + 1);
        try {
            ImageIO.write(imagem, formatoImagem, imagemSalvar);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
