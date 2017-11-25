import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

public class Test_04_Shape extends Application {

  @Override
  public void start(Stage stage) {
    stage.setTitle("Drawing Shapes");
    Group root = new Group();
    Scene scene = new Scene(root, 306, 550, Color.WHITE);
    // sine
    CubicCurve cubicCurve = new CubicCurve(
       50,  // start x point
       75,  // start y point
       80,  // control x1 point
      -25,  // control y1 point
      110,  // control x2 point
      175,  // control y2 point
      140,  // end x point
       75); // end y point
    //
    cubicCurve.setStrokeType(StrokeType.CENTERED);
    cubicCurve.setStroke(Color.BLACK);
    cubicCurve.setStrokeWidth(3);
    cubicCurve.setFill(Color.WHITE);
    //
    root.getChildren().add(cubicCurve);
    
    // initialize a path to draw ice cream shape
    Path path = new Path();
    path.setStrokeWidth(3);
    // top part beginning on the left
    MoveTo moveTo = new MoveTo();
    moveTo.setX(50);
    moveTo.setY(150);
    // curved part of ice-cream shape
    QuadCurveTo quadCurveTo = new QuadCurveTo();
    quadCurveTo.setX(150);
    quadCurveTo.setY(150);
    quadCurveTo.setControlX(100);
    quadCurveTo.setControlY(50);
    // cone rim
    LineTo lineTo1 = new LineTo();
    lineTo1.setX(50);
    lineTo1.setY(150);
    // left side of cone
    LineTo lineTo2 = new LineTo();
    lineTo2.setX(100);
    lineTo2.setY(275);
    // right side of cone
    LineTo lineTo3 = new LineTo();
    lineTo3.setX(150);
    lineTo3.setY(150);
    //
    // add all path elements
    path.getElements().addAll(moveTo, quadCurveTo, lineTo1, lineTo2, lineTo3);
    path.setTranslateY(30); // lower a bit
    //
    root.getChildren().add(path);

    // add the scene and show
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}