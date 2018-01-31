import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.Random;

public class ObjetBoutonAjoutCercle extends JButton implements MouseListener{

    private String name;
    private List liste;

    public ObjetBoutonAjoutCercle(String str , List liste){
        super(str);
        this.liste=liste;
        this.name = "creation cercle";
        this.addMouseListener(this);
        this.setBounds(550, 100, 100, 60);
    }

    public void mouseClicked(MouseEvent event) {
        Random r1 = new Random();
        Random r2 = new Random();
        int intr1 =r1.nextInt(900-100) + 100;
        int intr2 =r2.nextInt(900-100) + 100;
        this.liste.add(new ObjetCercle(50,50,intr1 ,intr2));
    }

    public void mouseEntered(MouseEvent event) {
        System.out.println("entered");
    }
    public void mouseExited(MouseEvent event) {
        System.out.println("exited");
    }
    public void mousePressed(MouseEvent event) {
        System.out.println("pressed");
    }
    public void mouseReleased(MouseEvent event) {
   }
}
