import java.awt.*;
import java.util.Random;
import java.awt.Color;
public class ObjetCarre extends AbstractObjectToDraw{

    ObjetCarre(int thisHeight,int thisWith,int posX,int posY) {
        this.setThisHeight(thisHeight);
        this.setThisWith(thisWith);
        this.setPosX(posX);
        this.setPosY(posY);
        this.setR();
        this.setCouleur();
        this.setMyColor();
        this.setSpeedX();
        this.setSpeedY();
    }

    public void  drawMe(Graphics g){
        g.setColor(this.getMyColor());
        g.fillRect(this.getPosX(), this.getPosY(), this.getThisHeight(), this.getThisWith());
    }
}
