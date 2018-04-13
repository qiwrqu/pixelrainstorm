package imagem.efeitos;

import imagem.Imagem;

public class Negativo {
    private Imagem imagemPai;
    
    public Negativo(Imagem imagemPai) {
        this.imagemPai = imagemPai;
    }
    
    public void aplicarEfeito() {
        imagemPai.comecarAlteracao();
        inverterCores(imagemPai.getRgb().getRed());
        inverterCores(imagemPai.getRgb().getGreen());
        inverterCores(imagemPai.getRgb().getBlue());
        imagemPai.terminarAlteracao();
    }
    
    private void inverterCores(int[] pixels) {
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = 255 - pixels[i];
        }
    }
}
