import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import org.jqurantree.orthography.Document;

/**
 *
 * @author efefer
 */
public class TestArabicTextFlow extends Application {
  
  public static void main(String[] args) {
    Application.launch(args);
  }
  
  @Override
  public void start(Stage stage) {
    
    String tmpstr;
    
    TextFlow flow = new TextFlow();
    flow.setStyle("-fx-font-size: 36;" +
                  "-fx-font-family: Amiri Quran;" +
                  "-fx-padding: 10;");
    flow.setTextAlignment(TextAlignment.RIGHT);
    
    for(int i = 1; i<31; i++) {
      tmpstr = Document.getToken(2,286,i).toString();
      Text tt = new Text(tmpstr);
      flow.getChildren().add(tt);
    }
    
    Scene scene;
    scene = new Scene(flow);
    stage.setScene(scene);
    stage.setTitle("Using Text Nodes");
    stage.show();
  }

}
