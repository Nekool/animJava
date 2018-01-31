import java.util.Random;
import java.awt.Color;
public class RandomColor {

     Color CreateRandomColor(int limit){
         Random randomGenerator = new Random();
        int R = randomGenerator.nextInt(limit);
        int G = randomGenerator.nextInt(limit);
        int B = randomGenerator.nextInt(limit);
        Color couleur = new Color(R, G, B);

        return couleur;
    }
}
