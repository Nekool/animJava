import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class Panneau extends JPanel {
//    objetCarre monCarre  = new objetCarre(50,50,200 ,500);
//    objetCarre monCarre2 = new objetCarre(50,50,350 ,100);
//    objetCarre monCarre3 = new objetCarre(50,50,150 ,200);
//    objetCarre monCarre4 = new objetCarre(50,50,200 ,300);
    int i;
    public List<objetCarre> carres = new ArrayList<>();
    //public void addcarres(){
//        carres.add(monCarre);
//        carres.add(monCarre2);
//        carres.add(monCarre3);
//        carres.add(monCarre4);
   // }

    public void mouseClicked(MouseEvent e) {
        i++;
    }
    public void paintComponent(Graphics g){

        g.setColor(Color.black);

        g.fillRect(0,0,this.getWidth(),this.getHeight());
        int xdrawString=10;
        int ydrawString=20;
        for (objetCarre mon_objet : carres) {
            mon_objet.drawMe(g);
//            System.out.println("dessine");
            g.setColor(Color.red);
            g.drawString(mon_objet.getPosX()+" "+ mon_objet.getPosY(), xdrawString, ydrawString);
            ydrawString+=15;
        }
        g.drawString(Integer.toString(i), 10, 120);

    }


}