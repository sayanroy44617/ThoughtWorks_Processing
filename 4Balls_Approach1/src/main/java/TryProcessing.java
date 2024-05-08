import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public int circlePos1 =0 , circlePos2 =0 , circlePos3 =0 , circlePos4 =0;



    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();

    }

    @Override
    public void draw() {
        drawCircle();

    }

    private void drawCircle() {

        ellipse(circlePos1, HEIGHT * 0.2f, DIAMETER, DIAMETER);
        circlePos1++;
        ellipse(circlePos2, HEIGHT * 0.4f, DIAMETER, DIAMETER);
        circlePos2 +=2;
        ellipse(circlePos3, HEIGHT * 0.6f, DIAMETER, DIAMETER);
        circlePos3 +=3;
        ellipse(circlePos4, HEIGHT * 0.8f, DIAMETER, DIAMETER);
        circlePos4 +=4;



    }


    public static void main(String[] args) {

        PApplet.main("TryProcessing" , args);


    }
}