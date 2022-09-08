import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {

    
    BouncingBox box;
    BouncingBox box2;
    BouncingBox box3;

    ArrayList<BouncingBox> boxes;

    /** Initializes this class for drawing. */

    public DrawGraphics() {
        
        box = new BouncingBox(200, 50, Color.RED);
        box2 = new BouncingBox(100, 150, Color.ORANGE);
        box3 = new BouncingBox(25, 250, Color.BLUE);
        boxes = new ArrayList<BouncingBox>();

        boxes.add(box);
        boxes.add(box2);
        boxes.add(box3);

        box.setMovementVector(-10, +14);
        box2.setMovementVector(-4, -8);
        box3.setMovementVector(1, 1);


    }

/** Draw the contents of the window on surface. Called 20 times per second. */

    public void draw(Graphics surface) {
        int[] xPoints = {150,225,75};
        int[] yPoints = {275,150,150};
        int nPoints = 3;

        surface.drawPolygon(xPoints, yPoints, nPoints);
        surface.fillPolygon(xPoints, yPoints, nPoints);
        surface.setColor(Color.blue);

        surface.drawOval(125, 125, 50, 50);
        surface.fillOval(125, 125, 50, 50);
        surface.setColor(Color.GREEN);

        surface.drawRect(150, 150, 25, 25);
        surface.fillRect(150, 150, 25, 25);
        surface.setColor(Color.MAGENTA);

        for(int i = 0; i < boxes.size(); i++) {
            boxes.get(i).draw(surface);
        }

    }

}
