import processing.core.PApplet;
class Balls
{
    int height;
    int x=0;
    int index;
    int diameter=10;
    Balls(int index )
    {
        this.index=index;
        this.height=(100)*this.index;
    }
    int getX(int index)
    {
        this.x=this.x+index;
        return this.x;
    }
}
public class TryProcessing extends PApplet {

    Balls ball1=new Balls(1);
    Balls ball2=new Balls(2);
    Balls ball3=new Balls(3);
    Balls ball4=new Balls(4);

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        drawCircle(ball1);
        drawCircle(ball2);
        drawCircle(ball3);
        drawCircle(ball4);
    }
    void drawCircle(Balls ball)
    {
        ellipse(ball.getX(ball.index),ball.height,ball.diameter,ball.diameter);
    }

}
