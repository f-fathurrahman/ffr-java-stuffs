import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Test_07_TextFont extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    stage.setTitle("Changing Text Fonts");
    Group root = new Group();
    Scene scene = new Scene(root, 580, 250, Color.WHITE);

    Text text2 = new Text(50, 50, "Hello JavaFX by eFeFeR");
    Font serif = Font.font("Serif", 30);
    text2.setFont(serif);
    text2.setFill(Color.RED);
    //
    root.getChildren().add(text2);
    //
    Text arabicText = new Text(50,100,"اِنَّا اَنْزَلْنٰهُ");
    //Font arabicFont = Font.font("me_quran", 32);
    Font arabicFont = Font.font("Amiri Quran", 32);
    arabicText.setFont(arabicFont);
    root.getChildren().add(arabicText);
    //
    stage.setScene(scene);
    stage.show();
  }

}