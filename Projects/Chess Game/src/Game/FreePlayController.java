package Game;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class FreePlayController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    void switchToMain(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void addAndRemovePiece(MouseEvent event) {

    }
    
    @FXML
    void newBlackBishop(MouseEvent event) {

    }

    @FXML
    void newBlackKing(MouseEvent event) {

    }

    @FXML
    void newBlackKnight(MouseEvent event) {

    }

    @FXML
    void newBlackPawn(MouseEvent event) {

    }

    @FXML
    void newBlackQueen(MouseEvent event) {

    }

    @FXML
    void newBlackRook(MouseEvent event) {

    }

    @FXML
    void newWhiteBishop(MouseEvent event) {

    }

    @FXML
    void newWhiteKing(MouseEvent event) {

    }

    @FXML
    void newWhiteKnight(MouseEvent event) {

    }

    @FXML
    void newWhitePawn(MouseEvent event) {

    }

    @FXML
    void newWhiteQueen(MouseEvent event) {

    }

    @FXML
    void newWhiteRook(MouseEvent event) {

    }

}
