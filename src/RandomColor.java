import java.util.Random;
import java.awt.Color;
public class RandomColor {

     Color CreateRandomColor(int limit){
        int R = (int)(Math.random()*limit);
        int G = (int)(Math.random()*limit);
        int B = (int)(Math.random()*limit);
        Color couleur = new Color(R, G, B);

        return couleur;
    }
}
