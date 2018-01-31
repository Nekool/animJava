import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class Panneau extends JPanel {
    int i;

    private List<AbstractObjectToDraw> objetDessins = new ArrayList<>();
    private List<ObjetCercle> cercles = new ArrayList<>();
    private List<ObjetCarre> carres = new ArrayList<>();

    public List<ObjetCarre> getCarres() {
        return carres;
    }
    public List<ObjetCercle> getCercles() {
        return cercles;
    }
    public List<AbstractObjectToDraw> getObjetDessins() {
        return objetDessins;
    }
    public void paintComponent(Graphics g){

        g.setColor(Color.black);

        g.fillRect(0,0,this.getWidth(),this.getHeight());

        int xdrawString=10;
        int ydrawString=20;
        for (AbstractObjectToDraw mon_objet : this.carres) {
            mon_objet.drawMe(g);
//            System.out.println("dessine");
            g.setColor(Color.red);
            g.drawString(mon_objet.getPosX()+" "+ mon_objet.getPosY(), xdrawString, ydrawString);
            ydrawString+=15;

        }
        i=carres.size();
        g.drawString(Integer.toString(i), 100, 20);

    }


}