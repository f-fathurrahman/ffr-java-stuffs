import java.util.Random;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Test_06_DrawingText extends Application {

  @Override
  public void start(Stage stage) {
    stage.setTitle("Drawing Text");
    Group root = new Group();
    Scene scene = new Scene(root, 300, 250, Color.WHITE);

    // Random number generator
    Random rand = new Random(System.currentTimeMillis());
    for(int i = 0; i < 100; i++) {
      // for random position
      int x = rand.nextInt((int) scene.getWidth());
      int y = rand.nextInt((int) scene.getHeight());
      // for random color
      int red = rand.nextInt(255);
      int green = rand.nextInt(255);
      int blue = rand.nextInt(255);
      // random rotation angle
      int rot = rand.nextInt(360);
      //            
      Text text = new Text(x, y, "eFeFeR - JavaFX");
      text.setFill(Color.rgb(red, green, blue, 0.99));
      text.setRotate(rot);
      // add
      root.getChildren().add(text);
    }


    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}