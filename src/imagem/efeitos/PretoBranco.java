package imagem.efeitos;

import imagem.Imagem;

public class PretoBranco {
    private Imagem imagemPai;
    private int limiar;
    
    public PretoBranco(Imagem imagemPai) {
        this.imagemPai = imagemPai;
        this.limiar = 128;
    }
    
    public void aplicarEfeito() {
        imagemPai.comecarAlteracao();
        alterarPretoBranco(imagemPai.getRgb().getRed(),imagemPai.getRgb().getGreen(),imagemPai.getRgb().getBlue());
        imagemPai.terminarAlteracao();
    }
    
    private void alterarPretoBranco(int[] red, int[] green, int[] blue) {
        for (int i = 0; i < red.length; i++) {
            if ((red[i] & green[i] & blue[i]) <= this.limiar) {
                red[i] = 0;
                green[i] = 0;
                blue[i] = 0;
            } else {
                red[i] = 255;
                green[i] = 255;
                blue[i] = 255;
            }
        }
    }
    public void setLimiar(int limiar) {
        this.limiar = limiar;
    }
    
    public int getLimiar() {
        return this.limiar;
    }
}
