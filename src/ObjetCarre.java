import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Random;
import java.awt.Color;
public class ObjetCarre extends AbstractObjectToDraw{

    ObjetCarre(int thisHeight, int thisWith, int posX, int posY, Panneau context) {
        this.setThisHeight(thisHeight);
        this.setthisWidth(thisWith);
        this.setPosX(posX);
        this.setPosY(posY);
        this.setR();
        this.setCouleur();
        this.setMyColor();
        this.setSpeedX();
        this.setSpeedY();
        this.setContext(context);
    }

    public void  drawMe(Graphics g){
        g.setColor(this.getMyColor());
        g.fillRect(this.getPosX(), this.getPosY(), this.getThisHeight(), this.getthisWidth());
    }
    public  void mouseClicked(MouseEvent event){}

    public  void mouseEntered(MouseEvent event){}

    public  void mouseExited(MouseEvent event){}

    public  void mousePressed(MouseEvent event){}

    public  void mouseReleased(MouseEvent event){}
}
