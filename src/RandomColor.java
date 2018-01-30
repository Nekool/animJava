import java.util.Random;
import java.awt.Color;
public class RandomColor {

     Color CreateRandomColor(){
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B = (int)(Math.random()*256);
        Color couleur = new Color(R, G, B);

        return couleur;
    }
}
