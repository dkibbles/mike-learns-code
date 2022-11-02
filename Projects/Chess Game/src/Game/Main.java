package Game;

import board.Board;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) { 
        Parent root;
try {
    root = FXMLLoader.load(getClass().getResource("Main.fxml"));
    Scene scene = new Scene(root);

  
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
} catch (Exception e) {
    System.out.println(e);
}
  
    }
    
    public static void main(String[] args) {

        Board board = new Board();

        board.printBoard();

        launch(args);

    }
}
