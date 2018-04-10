package imagem.efeitos;

import imagem.Imagem;

public class EfeitosCor {
    private Imagem imagemPai;
    private Negativo negativo;
    
    public EfeitosCor(Imagem imagemPai) {
        this.imagemPai = imagemPai;
        negativo = new Negativo(imagemPai);
    }
    
    public Negativo getNegativo() {
        return negativo;
    }
}
