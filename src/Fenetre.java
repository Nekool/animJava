
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Fenetre extends JFrame{
    private Panneau pan = new Panneau();



    public Fenetre(){
        this.setTitle("Animation");
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(pan);
        this.setVisible(true);
        pan.addcarres();

        go();

    }
    private void go(){
        int deplacementX =2,deplacementY=1;
        System.out.println("debut boucle");
        for(int i = 0; i <1; i--){

            try {
                System.out.println("check colision");
                for (objetCarre mon_objet : pan.carres) {
                    if(mon_objet.getPosX()+mon_objet.getThisHeight()>=this.getHeight()||mon_objet.getPosX()<=0){
                        mon_objet.setSpeedX();
                        mon_objet.setMyColor();
                    }
                    if(mon_objet.getPosY()+mon_objet.getThisWith()>=this.getWidth()||mon_objet.getPosY()<=0){
                        mon_objet.setSpeedY();
                        mon_objet.setMyColor();
                    }
                    mon_objet.setPosX(mon_objet.getPosX()+mon_objet.getSpeedX());
                    mon_objet.setPosY(mon_objet.getPosY()+mon_objet.getSpeedY());
                    pan.repaint();
                }
                Thread.sleep(10);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}