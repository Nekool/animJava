import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Panneau extends JPanel {

    Panneau(Fenetre fenetre){
        Point p = MouseInfo.getPointerInfo().getLocation();
        this.setFenetre(fenetre);
    }
    private int i;

    private List<AbstractObjectToDraw> liste = new ArrayList<>();
    private Fenetre fenetre;

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    int widthscreen=screenSize.width;
    int heightscreen=screenSize.height;

    public List<AbstractObjectToDraw> getListe(){
        return liste;
    }

    public Fenetre getFenetre() {
        return fenetre;
    }

    public void setFenetre(Fenetre fenetre) {
        this.fenetre = fenetre;
    }
    public void paintComponent(Graphics g){

        g.setColor(Color.black);

        g.fillRect(0,0,this.getWidth(),this.getHeight());
        int xdrawString=10;
        int ydrawString=20;
        for (AbstractObjectToDraw mon_objet : this.getListe()) {
            mon_objet.drawMe(g);
//            System.out.println("dessine");
            g.setColor(Color.red);
            g.drawString(mon_objet.getPosX()+" "+ mon_objet.getPosY(), xdrawString, ydrawString);
            ydrawString+=15;

        }
        i=liste.size();
        g.drawString(Integer.toString(i), 100, 20);
        if(getMousePosition()!=null) {
            g.drawString(Integer.toString(getMousePosition().x) + " " + Integer.toString(getMousePosition().y), 100, 40);
        }

    }


}