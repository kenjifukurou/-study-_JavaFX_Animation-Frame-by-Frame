import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class Controller {

    @FXML
    private ImageView skyBackground;

    Timeline tlRotate = new Timeline();

    @FXML
    public void handleRotateImage(MouseEvent event) {

        DoubleProperty r = skyBackground.rotateProperty();

        tlRotate.getKeyFrames().addAll(
                new KeyFrame(new Duration(0), new KeyValue(r, 0)),
                new KeyFrame(new Duration(23000), new KeyValue(r, 360))
                );

        tlRotate.play();
    }
}
