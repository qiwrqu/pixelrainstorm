package imagem.efeitos;

import imagem.Imagem;

public class EfeitosCor {
    private Imagem imagemPai;
    private Negativo negativo;
    private PretoBranco pretoBranco;
    
    public EfeitosCor(Imagem imagemPai) {
        this.imagemPai = imagemPai;
        negativo = new Negativo(imagemPai);
        pretoBranco = new PretoBranco(imagemPai);
    }
    
    public Negativo getNegativo() {
        return negativo;
    }
    
    public PretoBranco getPretoBranco(){
        return pretoBranco;
    }
    
}
