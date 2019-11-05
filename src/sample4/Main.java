package sample4;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Combined");

        TextField textField = new TextField();

        Button button = new Button("Click for at indsætte");
        Button button2 = new Button("Afslut");
        button2.setStyle("-fx-text-fill: #ff0000");
        button2.setOnAction(e -> Platform.exit());
        button.setOnAction(action -> {
            System.out.println(textField.getText());

        });
        //image
        FileInputStream input = new FileInputStream("resources/images/dku.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        //Label
        Label label = new Label("Indtast navn");
        //scene
        VBox vbox = new VBox(label,textField, button, button2, imageView);
        Scene scene = new Scene(vbox, 400, 400);
        scene.setCursor(Cursor.DEFAULT);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}