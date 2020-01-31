import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class PictureViewController implements Initializable {

    @FXML
    private ImageView imageView;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        imageView.setImage(new Image("chipmunk.jpg"));
    }
}
