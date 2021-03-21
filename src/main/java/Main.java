import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Main extends Application {

    //load image
    Image image_1 = new Image("Titan Ares Attack 2 F01.png");
    Image image_2 = new Image("Titan Ares Attack 2 F02.png");
    Image image_3 = new Image("Titan Ares Attack 2 F03.png");
    Image image_4 = new Image("Titan Ares Attack F01.png");

    ImageView ivTitanF1 = new ImageView(image_1);
//        ivTitanF1.setFitWidth(100);
//        ivTitanF1.setScaleX(2);
//        ivTitanF1.setScaleY(2);
//        ivTitanF1.setPreserveRatio(true);
//        ivTitanF1.setSmooth(!ImageView.SMOOTH_DEFAULT);
//        ivTitanF1.setTranslateX(50);
//        ivTitanF1.setTranslateY(70);
    ImageView ivTitanF2 = new ImageView(image_2);
    ImageView ivTitanF3 = new ImageView(image_3);
    ImageView ivTitanF4 = new ImageView(image_4);


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        Image ifxHit_1 = new Image("images/Enemy Hit FX 02 F01.png");
        Image ifxHit_2 = new Image("images/Enemy Hit FX 02 F02.png");
        Image ifxHit_3 = new Image("images/Enemy Hit FX 02 F03.png");
        Image ifxHit_4 = new Image("images/Enemy Hit FX 02 F04.png");
        Image ifxHit_5 = new Image("images/Enemy Hit FX 02 F05.png");

        Image ifxSmoke_1 = new Image("images/SFX Smoke F01.png");
        Image ifxSmoke_2 = new Image("images/SFX Smoke F02.png");
        Image ifxSmoke_3 = new Image("images/SFX Smoke F03.png");
        Image ifxSmoke_4 = new Image("images/SFX Smoke F04.png");
        Image ifxSmoke_5 = new Image("images/SFX Smoke F05.png");
        Image ifxSmoke_6 = new Image("images/SFX Smoke F06.png");

        ImageView ivHitF1 = new ImageView(ifxHit_1);
        ImageView ivHitF2 = new ImageView(ifxHit_2);
        ImageView ivHitF3 = new ImageView(ifxHit_3);
        ImageView ivHitF4 = new ImageView(ifxHit_4);
        ImageView ivHitF5 = new ImageView(ifxHit_5);

        ImageView ivSmokeF1 = new ImageView(ifxSmoke_1);
        ivSmokeF1.setTranslateX(Math.floor(Math.random() * 30));
        ivSmokeF1.setTranslateY(Math.floor(Math.random() * 10));

        ImageView ivSmokeF2 = new ImageView(ifxSmoke_2);
        ivSmokeF2.setTranslateX(Math.floor(Math.random() * 30));
        ivSmokeF2.setTranslateY(Math.floor(Math.random() * 20));

        ImageView ivSmokeF3 = new ImageView(ifxSmoke_3);
        ivSmokeF3.setTranslateX(Math.floor(Math.random() * 30));
        ivSmokeF3.setTranslateY(Math.floor(Math.random() * 30));

        ImageView ivSmokeF4 = new ImageView(ifxSmoke_4);
        ivSmokeF4.setTranslateX(Math.floor(Math.random() * 30));
        ivSmokeF4.setTranslateY(Math.floor(Math.random() * 10));

        ImageView ivSmokeF5 = new ImageView(ifxSmoke_5);
        ivSmokeF5.setTranslateX(Math.floor(Math.random() * 30));
        ivSmokeF5.setTranslateY(Math.floor(Math.random() * 20));

        ImageView ivSmokeF6 = new ImageView(ifxSmoke_6);
        ivSmokeF6.setTranslateX(Math.floor(Math.random() * 30));
        ivSmokeF6.setTranslateY(Math.floor(Math.random() * 30));


        Group titan = new Group();
//        titan.getChildren().add(ivTitanF1);
        titan.setScaleX(2);
        titan.setScaleY(2);
        titan.setTranslateX(50);
        titan.setTranslateY(225);

        Timeline timelineTitan = new Timeline();
        timelineTitan.setCycleCount(Timeline.INDEFINITE);

        timelineTitan.getKeyFrames().add( new KeyFrame(
                Duration.millis(100),
                (ActionEvent e) -> {
                    titan.getChildren().setAll(ivTitanF1);
                } ));

        timelineTitan.getKeyFrames().add( new KeyFrame(
                Duration.millis(400),
                (ActionEvent e) -> {
                    titan.getChildren().setAll(ivTitanF2);
                } ));

        timelineTitan.getKeyFrames().add( new KeyFrame(
                Duration.millis(600),
                (ActionEvent e) -> {
                    titan.getChildren().setAll(ivTitanF3);
                } ));

        timelineTitan.getKeyFrames().add( new KeyFrame(
                Duration.millis(800),
                (ActionEvent e) -> {
                    titan.getChildren().setAll(ivTitanF2);
                } ));

        timelineTitan.getKeyFrames().add( new KeyFrame(
                Duration.millis(1000),
                (ActionEvent e) -> {
                    titan.getChildren().setAll(ivTitanF3);
                } ));

        timelineTitan.getKeyFrames().add( new KeyFrame(
                Duration.millis(1200),
                (ActionEvent e) -> {
                    titan.getChildren().setAll(ivTitanF4);
                } ));

        timelineTitan.getKeyFrames().add( new KeyFrame(
                Duration.millis(1300),
                (ActionEvent e) -> {
                    titan.getChildren().setAll(ivTitanF4);
                } ));

        Group hitFX = new Group();
        hitFX.setScaleX(2);
        hitFX.setScaleY(2);
        hitFX.setTranslateX(titan.getTranslateX() + 50);
        hitFX.setTranslateY(titan.getTranslateY() + 10);

        Timeline timelineHitFX = new Timeline();
        timelineHitFX.setCycleCount(Timeline.INDEFINITE);

        timelineHitFX.getKeyFrames().add( new KeyFrame(
                Duration.millis(600),
                (ActionEvent e) -> {
                hitFX.getChildren().setAll(ivHitF1);
                } ));

        timelineHitFX.getKeyFrames().add( new KeyFrame(
                Duration.millis(625),
                (ActionEvent e) -> {
                    hitFX.getChildren().setAll(ivHitF2);
                } ));

        timelineHitFX.getKeyFrames().add( new KeyFrame(
                Duration.millis(650),
                (ActionEvent e) -> {
                    hitFX.getChildren().setAll(ivHitF3);
                } ));

        timelineHitFX.getKeyFrames().add( new KeyFrame(
                Duration.millis(675),
                (ActionEvent e) -> {
                    hitFX.getChildren().setAll(ivHitF4);
                } ));

        timelineHitFX.getKeyFrames().add( new KeyFrame(
                Duration.millis(700),
                (ActionEvent e) -> {
                    hitFX.getChildren().setAll(ivHitF5);
                } ));

        timelineHitFX.getKeyFrames().add( new KeyFrame(
                Duration.millis(1000),
                (ActionEvent e) -> {
                    hitFX.getChildren().setAll(ivHitF1);
                } ));

        timelineHitFX.getKeyFrames().add( new KeyFrame(
                Duration.millis(1025),
                (ActionEvent e) -> {
                    hitFX.getChildren().setAll(ivHitF2);
                } ));

        timelineHitFX.getKeyFrames().add( new KeyFrame(
                Duration.millis(1050),
                (ActionEvent e) -> {
                    hitFX.getChildren().setAll(ivHitF3);
                } ));

        timelineHitFX.getKeyFrames().add( new KeyFrame(
                Duration.millis(1075),
                (ActionEvent e) -> {
                    hitFX.getChildren().setAll(ivHitF4);
                } ));

        timelineHitFX.getKeyFrames().add( new KeyFrame(
                Duration.millis(1100),
                (ActionEvent e) -> {
                    hitFX.getChildren().setAll(ivHitF5);
                } ));

        timelineHitFX.getKeyFrames().add( new KeyFrame(
                Duration.millis(1200),
                (ActionEvent e) -> {
                    hitFX.getChildren().setAll(ivSmokeF1);
                } ));

        timelineHitFX.getKeyFrames().add( new KeyFrame(
                Duration.millis(1225),
                (ActionEvent e) -> {
                    hitFX.getChildren().setAll(ivSmokeF2);
                } ));

        timelineHitFX.getKeyFrames().add( new KeyFrame(
                Duration.millis(1250),
                (ActionEvent e) -> {
                    hitFX.getChildren().setAll(ivSmokeF3);
                } ));

        timelineHitFX.getKeyFrames().add( new KeyFrame(
                Duration.millis(1275),
                (ActionEvent e) -> {
                    hitFX.getChildren().setAll(ivSmokeF4);
                } ));

        timelineHitFX.getKeyFrames().add( new KeyFrame(
                Duration.millis(1288),
                (ActionEvent e) -> {
                    hitFX.getChildren().setAll(ivSmokeF5);
                } ));

        timelineHitFX.getKeyFrames().add( new KeyFrame(
                Duration.millis(1300),
                (ActionEvent e) -> {
                    hitFX.getChildren().setAll(ivSmokeF6);
                } ));

        timelineTitan.play();
        timelineHitFX.play();

        // ---------------------------------------------------------------

//        Pane root = new Pane();
        Pane root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        root.getChildren().add(titan);
        root.getChildren().add(hitFX);

        Scene scene = new Scene(root);
//        scene.getStylesheets().add("style.css");
        scene.setFill(Color.DIMGRAY);

        primaryStage.setTitle("Image View Example");
        primaryStage.setScene(scene);
        primaryStage.setWidth(300);
        primaryStage.setHeight(450);
//        primaryStage.sizeToScene();
        primaryStage.show();
    }
}
