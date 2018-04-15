package imagem.efeitos;

import gui.JanelaPrincipal;
import gui.SliderPretoBranco;
import imagem.Imagem;

public class PretoBranco {
    private int limiar;
    private Imagem imagemPai;
    
    public PretoBranco(Imagem imagemPai) {
        this.imagemPai = imagemPai;
        this.limiar = 128;
    }
    
    private void consultarUsuario() {
        JanelaPrincipal auxiliar = new JanelaPrincipal();
        SliderPretoBranco slide = new SliderPretoBranco(auxiliar, true);
        slide.setVisible(true);
        this.setLimiar(slide.getLimiar());
    }
    
    public void aplicarEfeito() {
        imagemPai.comecarAlteracao();
        consultarUsuario();
        alterarPretoBranco(imagemPai.getRgb().getRed(),imagemPai.getRgb().getGreen(),imagemPai.getRgb().getBlue());
        imagemPai.terminarAlteracao();
    }
    
    private void alterarPretoBranco(int[] red, int[] green, int[] blue) {
        for (int i = 0; i < red.length; i++) {
            int maximo = Math.max(Math.max(red[i], green[i]), blue[i]);
            if (this.limiar > maximo) {
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
