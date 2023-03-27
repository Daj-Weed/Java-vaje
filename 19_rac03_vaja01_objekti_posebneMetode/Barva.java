import javafx.scene.paint.Color; 

public class Barva {
    public static Color nakljucnaBarva() {
        int red = (int)(Math.random() * 255);
        int blue = (int)(Math.random() * 255);
        int green = (int)(Math.random() * 255);
        return Color.rgb(red, blue, green);
    }
}
