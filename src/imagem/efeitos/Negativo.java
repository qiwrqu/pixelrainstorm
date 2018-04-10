package imagem.efeitos;

import imagem.Imagem;

public class Negativo {
    private Imagem imagemPai;
    
    public Negativo(Imagem imagemPai) {
        this.imagemPai = imagemPai;
    }
    
    public void aplicarEfeito() {
        imagemPai.comecarAlteracao();
        reverterCores(imagemPai.getRgb().getRed());
        reverterCores(imagemPai.getRgb().getGreen());
        reverterCores(imagemPai.getRgb().getBlue());
        imagemPai.terminarAlteracao();
    }
    
    private void reverterCores(int[] pixels) {
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = 255 - pixels[i];
        }
    }
}
