import javax.swing.*;
import java.awt.*;


public class Fenetre extends JFrame{
    private Panneau pan = new Panneau();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int widthscreen=screenSize.width;
    int heightscreen=screenSize.height;
    JButton boutonCarre = new ObjetBoutonAjoutCarre("Création Carre",pan.getCarres());
    JButton boutonCercle = new ObjetBoutonAjoutCercle("Création Cercle",pan.getCarres());
    JButton boutonSupr = new ObjetBoutonSupr("Supression",pan.getCarres());

    public Fenetre(){
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
        pan.setSize(widthscreen,heightscreen);
        go();

    }
    private void go(){
        int deplacementX =2,deplacementY=1;
        for(int i = 0; i <1; i--){
            try {
                for (AbstractObjectToDraw mon_objet : pan.getCarres()) {
                    if(mon_objet.getPosX()+mon_objet.getThisWith()>=this.getWidth()||mon_objet.getPosX()<=0){
                        mon_objet.setSpeedX();
                        mon_objet.setMyColor();

                    }
                    if(mon_objet.getPosY()+mon_objet.getThisHeight()>=this.getHeight()||mon_objet.getPosY()<=0){
                        mon_objet.setSpeedY();
                        mon_objet.setMyColor();

                    }
                    mon_objet.setPosX(mon_objet.getPosX()+mon_objet.getSpeedX());
                    mon_objet.setPosY(mon_objet.getPosY()+mon_objet.getSpeedY());

                }
                pan.repaint();
                Thread.sleep(1000/60);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}