import java.util.Scanner;

public class Foot {

    public void draw() {
        FootShape footShape = new FootShape();
        Scanner input = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int shape = input.nextInt();

        switch (shape) {
            case 1:
                footShape.drawAsEllipse();
                break;
            case 2:
                footShape.drawAsRectangle();
                break;
        }
    }
    public static void main(String[] args) {
        Foot foot = new Foot();
        foot.draw();
    }
    
}