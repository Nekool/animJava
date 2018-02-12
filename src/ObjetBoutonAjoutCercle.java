import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.Random;

public class ObjetBoutonAjoutCercle extends JButton implements MouseListener{

    private String name;
    private List liste;
    private Panneau context;



    public ObjetBoutonAjoutCercle(String str ,List liste,Panneau context){
        super(str);
        this.setListe(liste);
        this.setContext(context);
        this.name = "creation";
        this.addMouseListener(this);
        this.setBounds(550, 100, 100, 60);
    }
    public void mouseClicked(MouseEvent event) {
        Random r1 = new Random();
        Random r2 = new Random();
        int intr1 =r1.nextInt(900-200) + 100;
        int intr2 =r2.nextInt(900-200) + 100;
        ObjetCercle lastCercle=new ObjetCercle(50,50,intr1 ,intr2,this.getContext());
        this.liste.add(lastCercle);
        String myString = "#"+Integer.toHexString(lastCercle.getMyColor().getRGB());
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
    }
    public List getListe() {
        return liste;
    }

    public void setListe(List liste) {
        this.liste = liste;
    }

    public Panneau getContext() {
        return context;
    }

    public void setContext(Panneau context) {
        this.context = context;
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
