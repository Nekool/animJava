import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ObjetBouton extends JButton implements MouseListener{
    private String name;
    private List liste;
    public ObjetBouton(String str ,List liste){
        super(str);
        this.liste=liste;
        this.name = str;
        this.addMouseListener(this);

    }
    public void mouseClicked(MouseEvent event) {
        System.out.println("clicked");
        Random r1 = new Random();
        Random r2 = new Random();
        int intr1 =r1.nextInt(800-200) + 200;
        int intr2 =r2.nextInt(800-200) + 200;
        this.liste.add(new objetCarre(50,50,intr1 ,intr2));
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
