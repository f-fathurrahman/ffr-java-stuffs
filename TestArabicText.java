import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.jqurantree.arabic.encoding.EncodingType;
import org.jqurantree.orthography.Document;
import org.jqurantree.orthography.Token;

/**
 *
 * @author efefer
 */
public class TestArabicText extends Application {
  
  public static void main(String[] args) {
    Application.launch(args);
  }
  
  @Override
  public void start(Stage stage) {
    String str1 = "This is an Arabic text:";
    Token token = Document.getToken(19, 7, 6);
    
    String str2 = str1 + token.toString();
    System.out.println("str2 = " + str2);
    Text t1 = new Text(str2);
    
    str2 = "";
    for(int i = 1; i<7; i++) {
      str2 += " " + Document.getToken(19,7,i).toString();
    }
    System.out.println("str2 = " + str2);
    Text t2 = new Text(str2);
    
    String str3 = Document.getVerse(1,2).toString(EncodingType.Unicode);
    System.out.println(str3);
    Text t3 = new Text("QS 1:2 " + str3);
    
    VBox root = new VBox(t1, t2, t3);
    root.setStyle("-fx-font-size: 40;");
    
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.setTitle("Using Text Nodes");
    stage.show();
  }

}
