package control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Frivillig extends Application {
    //Scene seeInfo, changeInfo;
    public Stage stage;

    public static void run(){
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        this.stage = primaryStage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Primary.fxml")); //loader fra en class i re
        FlowPane flowPane = loader.load();

        primaryScene guiContr = loader.getController();
        guiContr.setMainController(this);

        Scene scene = new Scene(flowPane,800,600 );
        stage.setScene(scene);
        stage.show();


    }
public void Login() throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/LogIn.fxml")); //loader fra en class i re
    FlowPane pane = loader.load();
    LogIn controller = loader.getController();
    controller.setMainController(this);
    Scene scene = new Scene(pane,800,600 );
    stage.setScene(scene);

}

    public void FrivilligSide() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FrivilligSide.fxml")); //loader fra en class i re
        FlowPane pane = loader.load();
        FrivilligSide controller = loader.getController();
        controller.setMainController(this);
        Scene scene = new Scene(pane,800,600 );
        stage.setScene(scene);

    }
    public void AnsvarligSide() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/AnsvarligSide.fxml")); //loader fra en class i re
        FlowPane pane = loader.load();
        AnsvarligSide controller = loader.getController();
        controller.setMainController(this);
        Scene scene = new Scene(pane,800,600 );
        stage.setScene(scene);

    }


}
