package imagem;

import java.awt.image.BufferedImage;

public class Rgb {
    //Arrays sao usadas ao inves de ArrayList pois ArrayList usa muita CPU e RAM.
    private int[] red;
    private int[] green;
    private int[] blue;
    
    public Rgb(BufferedImage imagem) {
        int height = imagem.getHeight();
        int width = imagem.getWidth();
        red = new int[width * height];
        green = new int[width * height];
        blue = new int[width * height];
        int[] coresRgb = imagem.getRGB(0, 0, width, height, null, 0, width);
        for (int i = 0; i < width * height; i++) {
            /*Uso de bitshifts para calcular cada pixel. Os pixels que o metodo
            *getRGB acima retorna estao no formato ARGB (Alpha, Red, Green, Blue),
            *cada letra representando um byte do int. Os bitshifts transferem o
            *byte da cor para o ultimo byte do int, que e recuperado com o AND 
            *realizado com o numero 0xff (ultimos 8 bits 1, outros sao 0).*/
            red[i] = coresRgb[i] >> 16 & 0xff;
            green[i] = coresRgb[i] >> 8 & 0xff;
            blue[i] = coresRgb[i] & 0xff;
        }
    }
}
