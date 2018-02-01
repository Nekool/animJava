import java.awt.*;
import java.util.Random;
import java.awt.Color;

abstract class AbstractObjectToDraw implements InterfaceObjectToDraw{
    private int posX ;
    private int speedX ;

    private int posY ;
    private int speedY ;

    private int thisWith;
    private int thisHeight;

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
//            this.setMyColor();
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
//            this.setMyColor();
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

    public int getThisWith() {
        return thisWith;
    }

    public void setThisWith(int thisWith) {
        this.thisWith = thisWith;
    }

    public int getThisHeight() {
        return thisHeight;
    }

    public void setThisHeight(int thisHeight) {
        this.thisHeight = thisHeight;
    }

    public void ObjectToDraw(int thisHeight,int thisWith,int posX,int posY){
        this.setThisHeight(thisHeight);
        this.setThisWith(thisWith);
        this.setPosX(posX);
        this.setPosY(posY);
        this.setR();
        this.setCouleur();
        this.getMyColor();
        this.setSpeedX();
        this.setSpeedY();
    }
    public void  drawMe(Graphics g){

    }
}
