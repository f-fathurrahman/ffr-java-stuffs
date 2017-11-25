import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

// A slight variation of Test_01_Hello, using two buttons

public class Test_02_Hello extends Application {
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
    Scene scene = new Scene(root, 800, 500);
    //
    // Prepare a button
    //
    Button btn1 = new Button();
    btn1.setLayoutX(100);
    btn1.setLayoutY(80);
    btn1.setText("Click me!");
    btn1.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
          System.out.println("Button 1 is clicked");
      }
    });
    // add the button
    root.getChildren().add(btn1);
    //
    // Second button
    //
    Button btn2 = new Button("Second button");
    btn2.setLayoutX(200);
    btn2.setLayoutY(300);
    btn2.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        System.out.println("Button 2 is clicked");
      }
    });
    root.getChildren().add(btn2);
    //
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}