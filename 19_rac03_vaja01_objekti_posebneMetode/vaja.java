import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.scene.Node;

public class vaja extends Application {
    @Override
    public void start(Stage stage) {
        // Create a Button or any control item
        Group root = new Group();
        Node tNode[] = new Node[100];
	int tNodePointer = 0;
        
        int kolikokratP = (int)(Math.random()*10 + 30);
        for (int i = 0; i < kolikokratP; i++) {
            Rectangle pravokotnik = new Rectangle();
            
            pravokotnik.setWidth(Pravokotnik.getDolzina());
            pravokotnik.setHeight(Pravokotnik.getVisina());
            pravokotnik.setY(Pravokotnik.getX());
            pravokotnik.setX(Pravokotnik.getY());
            pravokotnik.setFill(Barva.nakljucnaBarva()); 
            root.getChildren().add(pravokotnik);
            tNode[tNodePointer++] = pravokotnik;
        }
        
        int kolikokratT = (int)(Math.random()*10 + 20);
        for (int i = 0; i < kolikokratT; i++) {
            Polygon trikotnik = new Polygon();
            double tocke[] = Trikotnik.getTocke();
            trikotnik.getPoints().addAll(new Double[]{tocke[0], tocke[1], tocke[2], tocke[3], tocke[4], tocke[5]});
            trikotnik.setFill(Barva.nakljucnaBarva()); 
            root.getChildren().add(trikotnik);
            tNode[tNodePointer++] = trikotnik;
        }
        
        int kolikokratK = (int)(Math.random()*10 + 40);
        for (int i = 0; i < kolikokratK; i++) {
            Circle krog = new Circle();
            krog.setCenterX(Krog.getX());
            krog.setCenterY(Krog.getY());
            krog.setRadius(Krog.getRadij());
            krog.setFill(Barva.nakljucnaBarva()); 
            root.getChildren().add(krog);
            tNode[tNodePointer++] = krog;
        }
        
        for (Node a : tNode) {
            if(a instanceof Polygon p) {
        	System.out.println("tala je poligon aka trikotnik ... ");
		System.out.println(p);
            } else if(a instanceof Rectangle r) {
		System.out.println("tala je kradvat ... ");
		System.out.println(r);
	    } else if(a instanceof Circle c) {
		System.out.println("tala je krog ... ");
		System.out.println(c);
            }
        }
        //JA
        
        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(root, 1000, 1000);
        stage.setTitle("JavaFX Example");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }
    
    public static void main(String args[]) { 
      launch(args); 
    }
}