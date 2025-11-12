import java.awt.Robot;
import java.awt.AWTException;

public class MouseMover {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            
            // Coordinates to move the mouse to (e.g., x=500, y=300)
            int x = 500;
            int y = 300;
            
            System.out.println("Moving mouse to (" + x + ", " + y + ")");
            robot.mouseMove(x, y);
            
            // Optionally, add a delay so you can see the movement
            robot.delay(1000);
            
            // Move to another position
            x = 800;
            y = 600;
            System.out.println("Moving mouse to (" + x + ", " + y + ")");
            robot.mouseMove(x, y);
            
        } catch (AWTException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}