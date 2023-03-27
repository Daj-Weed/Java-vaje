import javafx.scene.shape.Rectangle;

public class Pravokotnik {
    private static double dolzina = 0;
    private static double visina = 0;
    private static double tockaX = 0;
    private static double tockaY = 0;
    
    public static double getDolzina() {
        dolzina = Math.random() * (40 - 5) + 5;
        return dolzina;
    }
    
    public static double getVisina() {
        visina = Math.random() * (40 - 5) + 5;
        return visina;
    }
    
    public static double getX() {
        tockaX = Math.random() * 700;
        return tockaX;
    }
    
    public static double getY() {
        tockaY = Math.random() * 700;
        return tockaY;
    }
}
