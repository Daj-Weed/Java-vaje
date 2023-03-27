import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color; 
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Write a description of JavaFX class abc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class vaja extends Application
{
    // We keep track of the count, and label displaying the count:
    private int count = 0;
    private Label myLabel = new Label("0");

    /**
     * The start method is the main entry point for every JavaFX application. 
     * It is called after the init() method has returned and after 
     * the system is ready for the application to begin running.
     *
     * @param  stage the primary stage for this application.
     */
    @Override
    public void start(Stage stage)
    {
        // Create a Button or any control item
        Group root = new Group();
        
        int kolikokratP = (int)(Math.random()*10 + 30);
        for (int i = 0; i < kolikokratP; i++) {
            Rectangle rectangle = new Rectangle();
            rectangle.setWidth((Math.random() * (40 - 5)) + 5);
            rectangle.setHeight((Math.random() * (40 - 5)) + 5);
            rectangle.setX(Math.random() * 700);
            rectangle.setY(Math.random() * 700);
            int red = (int)(Math.random() * 255);
            int blue = (int)(Math.random() * 255);
            int green = (int)(Math.random() * 255);
            rectangle.setFill(Color.rgb(red, blue, green)); 
            root.getChildren().add(rectangle);
        }
        
        int kolikokratT = (int)(Math.random()*10 + 20);
        for (int i = 0; i < 1; i++) {
            Polygon trikotnik = new Polygon();
            double tocke[] = new double[6];
            double premikX = Math.random() * 700;
            double premikY = Math.random() * 700;
            tocke[0] = 0.0 + premikX;
            tocke[1] = 0.0 + premikY;
            tocke[2] = (Math.random() * (40 - 5) + 5) + premikX;
            tocke[3] = (Math.random() * (40 - 5) + 5) + preminY;
            tocke[4] = (Math.random() * (40 - 5) + 5) + premikX;
            tocke[5] = (Math.random() * (40 - 5) + 5) + premikY;
            trikotnik.getPoints().addAll(new Double[]{tocke[0],tocke[1],tocke[2],tocke[3],tocke[4],tocke[5]});
            int red = (int)(Math.random() * 255);
            int blue = (int)(Math.random() * 255);
            int green = (int)(Math.random() * 255);
            trikotnik.setFill(Color.rgb(red, blue, green)); 
            root.getChildren().add(trikotnik);
        }
        
        int kolikokratK = (int)(Math.random()*10 + 40);
        for (int i = 0; i < kolikokratK; i++) {
            Circle krog = new Circle();
            krog.setCenterX(Math.random() * 700);
            krog.setCenterY(Math.random() * 700);
            krog.setRadius((Math.random() * (40 - 5)) + 5);
            int red = (int)(Math.random() * 255);
            int blue = (int)(Math.random() * 255);
            int green = (int)(Math.random() * 255);
            krog.setFill(Color.rgb(red, blue, green)); 
            root.getChildren().add(krog);
        }
        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(root, 1000, 1000);
        stage.setTitle("JavaFX Example");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }
    
    public static void main(String args[]){ 
      launch(args); 
    }
}
