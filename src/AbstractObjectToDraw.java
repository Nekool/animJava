import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.Random;
import java.awt.Color;

abstract class AbstractObjectToDraw implements InterfaceObjectToDraw, MouseListener {
    private int posX ;
    private int speedX ;

    private int posY ;
    private int speedY ;

    private Panneau context;

    private int thisWidth;
    private int thisHeight;
    boolean changeDirectionX;

    boolean changeDirectionY;
    private Random r;
    private Color myColor;
    private RandomColor couleur;

    public void setR() {
        this.r = new Random();
    }

    public void setCouleur() {
        this.couleur = new RandomColor();
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setMyColor(){

        this.myColor=couleur.CreateRandomColor(256);
    }

    public Color getMyColor(){
        return myColor;
    }

    public void setSpeedX() {
        int Low = 1;
        int High = 5;
        int Result = this.r.nextInt(High-Low) + Low;
        if(this.speedX>0&& this.getPosX()>0){
            Result=Result*(-1);
            this.speedX = Result;
        }
        else{
            this.speedX = Result;
        }
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY() {
        int Low = 1;
        int High = 5;
        int Result = r.nextInt(High-Low) + Low;
        if(this.speedY>0 && this.getPosY()>0){
            Result=Result*(-1);
            this.speedY = Result;
        }
        else{
            this.speedY = Result;
        }
    }
    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getthisWidth() {
        return thisWidth;
    }

    public void setthisWidth(int thisWidth) {
        this.thisWidth = thisWidth;
    }

    public int getThisHeight() {
        return thisHeight;
    }

    public void setThisHeight(int thisHeight) {
        this.thisHeight = thisHeight;
    }

    public Panneau getContext() {
        return context;
    }

    public void setContext(Panneau context) {
        this.context = context;
    }

    public void colision(List<AbstractObjectToDraw> liste) {

        try{
            changeDirectionY=false;
            changeDirectionX=false;
        for (AbstractObjectToDraw mon_objet : liste) {
            if (this != mon_objet){

                if (this.getPosX()<=mon_objet.getPosX() &&
                        mon_objet.getPosX()  <= this.getPosX()+this.getthisWidth()) {
                    this.setSpeedX();
                    this.setMyColor();
                    changeDirectionX=true;
                }
                if (this.getPosY()<=mon_objet.getPosY() &&
                        mon_objet.getPosY()  <= this.getPosY()+this.getThisHeight()) {
                    this.setSpeedY();
                    this.setMyColor();
                    changeDirectionY=true;
                }
            }
           
        } 
        if(changeDirectionX==false){
                if(this.getPosX()+this.getthisWidth()>=this.getContext().getWidth()||this.getPosX()<=0){
                    this.setSpeedX();
                    this.setMyColor();
                }
        }
        if(changeDirectionY==false) {

            if (this.getPosY() + this.getThisHeight() >= this.getContext().getHeight() || this.getPosY() <= 0) {
                this.setSpeedY();
                this.setMyColor();
            }
        }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void mouvement(){
        this.colision(this.context.getListe());
        this.setPosX(this.getPosX()+this.getSpeedX());
        this.setPosY(this.getPosY()+this.getSpeedY());
    }
    public void ObjectToDraw(int thisHeight, int thisWidth, int posX, int posY, Panneau context, List liste){
        this.setThisHeight(thisHeight);
        this.setthisWidth(thisWidth);
        this.setPosX(posX);
        this.setPosY(posY);
        this.setR();
        this.setCouleur();
        this.getMyColor();
        this.setSpeedX();
        this.setSpeedY();
        this.setContext(context);

    }

    /**
     * Méthode pour dessiner l'oblet
     * @param g
     */
    public abstract void drawMe(Graphics g);

    public abstract void mouseClicked(MouseEvent event);

    public abstract void mouseEntered(MouseEvent event);

    public abstract void mouseExited(MouseEvent event);

    public abstract void mousePressed(MouseEvent event);

    public abstract void mouseReleased(MouseEvent event);
}
