import processing.core.PApplet;

public class Main extends PApplet {

    private static final int HEIGHT = 480;
    private static final int WIDTH = 640;

    private Circle[] circles ;


    public static void main(String[] args) {
        PApplet.main("Main" , args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH , HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        circles = new Circle[4];
        circles[0]= new Circle(0,0.2f , 1);
        circles[1]= new Circle(0,0.4f , 2);
        circles[2]= new Circle(0,0.6f , 3);
        circles[3]= new Circle(0,0.8f , 4);
    }

    @Override
    public void draw() {
        for(Circle circle : circles)
        {
            circle.draw();
        }
    }

    class Circle
    {
        private int xAxis;
        private int height;
        private  int speed ;

        Circle(int xAxis , float percentage , int speed)
        {
            this.xAxis = xAxis ;
            this.height = (int) (HEIGHT * percentage);
            this.speed = speed;
        }


        void draw()
        {
            ellipse(xAxis , height , 10 , 10 );
            xAxis+=speed;
        }
    }

}