import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class Panneau extends JPanel {

    private int i;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int widthscreen=screenSize.width;
    int heightscreen=screenSize.height;
    public List<AbstractObjectToDraw> getCarres() {

        return carres;
    }

    private List<AbstractObjectToDraw> carres = new ArrayList<>();

    public void paintComponent(Graphics g){

        g.setColor(Color.black);

        g.fillRect(0,0,this.getWidth(),this.getHeight());
        int xdrawString=10;
        int ydrawString=20;
        for (AbstractObjectToDraw mon_objet : carres) {
            mon_objet.drawMe(g);
//            System.out.println("dessine");
            g.setColor(Color.red);
            g.drawString(mon_objet.getPosX()+" "+ mon_objet.getPosY(), xdrawString, ydrawString);
            ydrawString+=15;

        }
        i=carres.size();
        g.drawString(Integer.toString(i), 100, 20);
        g.drawString(Integer.toString(widthscreen)+" "+Integer.toString(heightscreen), 100, 40);


    }


}