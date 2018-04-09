package imagem;

import java.util.ArrayList;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Rgb {
    private ArrayList<Integer> red;
    private ArrayList<Integer> green;
    private ArrayList<Integer> blue;
    
    public Rgb(BufferedImage imagem) {
        //ColorModel e usado para converter os valores de cada pixel para o formato
        //que o programa ira utilizar
        ColorModel colorModel = imagem.getColorModel();
        int height = imagem.getHeight();
        int width = imagem.getWidth();
        int[] coresRgb = imagem.getRGB(0, 0, width, height, null, width, 0);
        for (int pixel : coresRgb) {
            red.add(colorModel.getRed(pixel));
            green.add(colorModel.getGreen(pixel));
            blue.add(colorModel.getBlue(pixel));
        }
    }
}
