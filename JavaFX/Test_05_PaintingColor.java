import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Test_05_PaintingColor extends Application {

  @Override
  public void start(Stage stage) {
    stage.setTitle("Chapter 2 Painting Colors");
    Group root = new Group();
    Scene scene = new Scene(root, 350, 300, Color.WHITE);
    //
    // Red ellipse with radial gradient color
    //
    Ellipse ellipse = new Ellipse(
      100, 50 + 70/2, // centerX, centerY
      50, 70/2); // radiusX, radiusY
    //
    RadialGradient gradient1 = new RadialGradient( 
      0,  // focusAngle
      0.0, // focusDistance
      100, 50 + 70/2, // centerX, centerY
      120,  // radius
      false, // proportional
      CycleMethod.NO_CYCLE,
      new Stop(0, Color.RED),
      new Stop(1, Color.BLACK) );
    //
    ellipse.setFill(gradient1);
    //
    root.getChildren().add(ellipse);
    double ellipseHeight = ellipse.getBoundsInParent().getHeight();
    //
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}