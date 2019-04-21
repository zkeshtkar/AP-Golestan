package model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import  javafx.scene.image.Image;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.nio.file.Paths;
public class PageLoader {
    private static final int width=875;
    private static final int hiegth=900;
    private static Stage stage;


    public static void initStage(Stage PrimaryStage)
    {
        stage=PrimaryStage;
        stage.setTitle("سیستم جامع دانشگاهی - دانشگاه شهید بهشتی");
        stage.setWidth(width);
        stage.setWidth(hiegth);
        stage.initStyle(StageStyle.DECORATED);
        stage.getIcons().add(new Image(Paths.get("resources/2.png").toUri().toString()));
        stage.getIcons().add(new Image(Paths.get("resources/3.png").toUri().toString()));
    }
    public void load(String URL) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(URL));
        stage.setScene(new Scene(root,width, hiegth));
        stage.show();
    }
}