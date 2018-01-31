import java.awt.*;
import java.util.Random;
import java.awt.Color;
public class ObjetCarre extends AbstractObjectToDraw{

    ObjetCarre(int thisHeight,int thisWith,int posX,int posY) {
//        super(thisHeight, thisWith, posX, posY);
        System.out.println("ajout carre");

    }

    public void  drawMe(Graphics g){
        g.setColor(this.getMyColor());
        g.fillRect(this.getPosX(), this.getPosY(), this.getThisHeight(), this.getThisWith());
    }
}
