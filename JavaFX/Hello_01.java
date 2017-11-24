import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Hello_01 extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }
  
  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Hello JavaFX from ffr");
    //
    // Prepare a scene
    //
    Group root = new Group();
    Scene scene = new Scene(root, 300, 250);
    //
    // Prepare a button
    //
    Button btn = new Button();
    btn.setLayoutX(100);
    btn.setLayoutY(80);
    btn.setText("Click me!");
    btn.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
          System.out.println("Button in clicked");
      }
    });
    // add the button
    root.getChildren().add(btn);
    //
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}