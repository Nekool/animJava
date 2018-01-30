import java.awt.*;
import java.util.Random;
import java.awt.Color;
public class objetCarre {
    private int posX = 1;
    private int speedX = 1;

    private int posY = 1;
    private int speedY = 1;

    private int thisWith = 50;
    Random r = new Random();

    private int thisHeight= 50;
    private RandomColor couleur=new RandomColor();
    private Color myColor=this.getMyColor();
    public int getSpeedX() {
        return speedX;
    }
    public void setMyColor(){
        this.myColor=couleur.CreateRandomColor(256);
    }
    public Color getMyColor(){
        return couleur.CreateRandomColor(256);
    }
    public void setSpeedX() {
        int Low = 1;
        int High = 5;
        int Result = r.nextInt(High-Low) + Low;
        if(this.speedX>0){
            Result=Result*(-1);
            this.speedX = Result;
            this.setMyColor();
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
        if(this.speedY>0){
            Result=Result*(-1);
            this.speedY = Result;
            this.setMyColor();
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
    public objetCarre(int thisHeight,int thisWith,int posX,int posY){
        this.thisHeight=thisHeight;
        this.thisWith=thisWith;
        this.posX=posX;
        this.posY=posY;
        setSpeedX();
        setSpeedY();

    }
    public void  drawMe(Graphics g){
        g.setColor(myColor);
        g.fillRect(this.posX, this.posY, this.thisHeight, this.thisWith);
    }
}
