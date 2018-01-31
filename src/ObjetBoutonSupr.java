import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class ObjetBoutonSupr extends JButton implements MouseListener {
    private String name;
    private List liste;

    public ObjetBoutonSupr(String str, List liste) {
        super(str);
        this.liste = liste;
        this.name = str;
        this.addMouseListener(this);
        this.setBounds(40, 200, 100, 60);
    }

    public void mouseClicked(MouseEvent event) {
        System.out.println("Supprime carre");
        try {
            this.liste.remove(this.liste.get(0));
        } catch (Exception e) {
            System.out.println("rien a supprimer");
        }
    }

    public void mouseEntered(MouseEvent event) {

    }


    public void mouseExited(MouseEvent event) {

    }


    public void mousePressed(MouseEvent event) {

    }


    public void mouseReleased(MouseEvent event) {


    }
}
