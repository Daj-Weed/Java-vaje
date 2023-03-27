import javafx.scene.shape.Circle;

public class Krog {
    public static double tockaX = 0;
    public static double tockaY = 0;
    public static double radij = 0;
    
    
    public static double getX() {
        tockaX = Math.random() * 700;
        return tockaX;
    }
    public static double getY() {
        tockaY = Math.random() * 700;
        return tockaY;
    }
    public static double getRadij() {
        radij = Math.random() * (40 - 5) + 5;
        return radij;
    }
}
