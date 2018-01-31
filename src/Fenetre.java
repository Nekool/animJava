import javax.swing.*;


public class Fenetre extends JFrame{
    private Panneau pan = new Panneau();
    JButton bouton = new ObjetBouton("Création",pan.getCarres());
    JButton boutonSupr = new ObjetBoutonSupr("Supression",pan.getCarres());

    public Fenetre(){
        this.setTitle("Animation");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setContentPane(pan);
        this.setVisible(true);
        pan.add(bouton);
        pan.add(boutonSupr);
        pan.setSize(this.getWidth(),this.getHeight());
        go();

    }
    private void go(){
        int deplacementX =2,deplacementY=1;
        System.out.println("debut boucle");
        for(int i = 0; i <1; i--){
            try {
                for (AbstractObjectToDraw mon_objet : pan.getCarres()) {
                    if(mon_objet.getPosX()+mon_objet.getThisHeight()>=this.getHeight()||mon_objet.getPosX()<=0){
                        mon_objet.setSpeedX();
                    }
                    if(mon_objet.getPosY()+mon_objet.getThisWith()>=this.getWidth()||mon_objet.getPosY()<=0){
                        mon_objet.setSpeedY();
                    }
                    mon_objet.setPosX(mon_objet.getPosX()+mon_objet.getSpeedX());
                    mon_objet.setPosY(mon_objet.getPosY()+mon_objet.getSpeedY());
                    pan.repaint();

                }
                Thread.sleep(1000/60);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}