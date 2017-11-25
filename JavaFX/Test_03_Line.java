import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Text;

public class Test_03_Line extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    stage.setTitle("Drawing Lines");

    Group root = new Group();
    Scene scene = new Scene(root, 300, 150, Color.GRAY);

    Line redLine = new Line(10, 10, 200, 10);
    redLine.setStroke(Color.RED);
    redLine.setStrokeWidth(10);
    redLine.setStrokeLineCap(StrokeLineCap.BUTT);
    // dashed pattern
    redLine.getStrokeDashArray().addAll(10d, 5d, 15d, 5d, 20d);
    redLine.setStrokeDashOffset(0);
    //
    root.getChildren().add(redLine);

    //
    // white line
    //
    Line whiteLine = new Line(10, 30, 200, 30);
    whiteLine.setStroke(Color.WHITE);
    whiteLine.setStrokeWidth(10);
    whiteLine.setStrokeLineCap(StrokeLineCap.ROUND);
    //
    root.getChildren().add(whiteLine);

    //
    // setup slider
    //
    Slider slider = new Slider(0, 100, 0);
    slider.setLayoutX(10);
    slider.setLayoutY(95);
    // bind stroke dash offset property
    redLine.strokeDashOffsetProperty().bind(slider.valueProperty());
    root.getChildren().add(slider);

    //
    // prepare a text
    //
    Text offsetText = new Text("Stroke Dash Offset: 0.0");
    offsetText.setX(10);
    offsetText.setY(80);
    offsetText.setStroke(Color.WHITE);
    //
    slider.valueProperty().addListener( (ov, curVal, newVal ) ->
        offsetText.setText("Stroke Dash Offset: " + slider.getValue())
    );
    //
    root.getChildren().add(offsetText);


    stage.setScene(scene);
    stage.show();
  }

}
