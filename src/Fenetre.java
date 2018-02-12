import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    private Panneau pan = new Panneau(this);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int widthscreen = screenSize.width;
    int heightscreen = screenSize.height;
    JButton boutonCarre = new ObjetBoutonAjoutCarre("Création Carre", pan.getListe(), pan);
    JButton boutonCercle = new ObjetBoutonAjoutCercle("Création Cercle", pan.getListe(), pan);
    JButton boutonSupr = new ObjetBoutonSupr("Supression", pan.getListe());

    public Fenetre() {
        this.setTitle("Animation");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setContentPane(pan);
        this.setVisible(true);
        pan.add(boutonCarre);
        pan.add(boutonCercle);
        pan.add(boutonSupr);
        pan.setSize(widthscreen, heightscreen);
        go();
    }

    private void go() {
        int deplacementX = 2, deplacementY = 1;
        for (int i = 0; i < 1; i--) {
            try {
                if (pan.getListe() != null) {
                    for (AbstractObjectToDraw mon_objet : pan.getListe()) {
                        mon_objet.mouvement();
                    }
                    pan.repaint();
                    Thread.sleep(1000 / 60);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}