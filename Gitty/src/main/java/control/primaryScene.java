package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class primaryScene  {
   public Label label1;

    public control.Frivillig frivilligApp;


    public void setMainController(Frivillig frivillig){
        this.frivilligApp =frivillig;
    }
    @FXML
    public void btnClick(ActionEvent actionEvent) throws IOException {


        frivilligApp.Login();


    }



}
