package HelloWorld;
 
import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.shape.*;

public class MyJavaFXApplication extends Application {
       
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("LAB 1");
        
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250);
        scene.setFill(Color.GREEN);
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(130.0, 30.0,
                220.0, 150.0,
                60.0, 150.0, 10.0);
        root.getChildren().add(polygon);
        polygon.setFill(Color.YELLOW);


        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(20.0, 30.0,
                50.0, 190.0,
                230.0, 190.0,
                270.0, 30.0);
        root.getChildren().add(polyline);
        polyline.setStroke(Color.RED);
        polyline.setStrokeWidth(4);

        Line line1 = new Line(40.0, 30.0, 90.0 , 30.0);
        Line line2 = new Line(160.0, 30.0, 220.0 , 30.0);

        root.getChildren().add(line1);
        root.getChildren().add(line2);
        line1.setStroke(Color.BLUE);
        line2.setStroke(Color.BLUE);
        line1.setStrokeWidth(4);
        line2.setStrokeWidth(4);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
