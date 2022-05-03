package control;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;


public class Enterinfo {
public Label label2;
    private Frivillig frivilligApp;

    public Label getLabel2() {
        label2.setText("infooo");
        return label2;
    }


    public void setMainController(Frivillig frivillig) {
        this.frivilligApp=frivillig;
    }
}
