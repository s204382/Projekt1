package control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.text.TextFlow;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FrivilligSide {
    public Label label1;
    //oversigt over stuff
    public control.Frivillig frivilligApp;


    public void setMainController(Frivillig frivillig) {
        this.frivilligApp = frivillig;

    }

    @FXML public ListView shiftList;
    @FXML public TextFlow information;

    shiftList.addAll("1","2","3");


    //textflow part

    /* public void oplysninger?ButtonPushed()
     {
        String textAreaString = "";

        ObservableList listOfItems = listView.getSelectionModel().getSelectedItems();

        for (Object item : listOfItems)
        {
            textAreaString += String.format("%s%n",(String) item);
        }

        this.golfTextArea.setText(textAreaString);
     }*/



}



    //se vagtplan
    /*
    - adgang til shift fil (info om vagt er heri)

    -
     */

    //ændre stamoplysninger
    /*
    - adgang til coworker fil
    -
     */
//anther option is using textview for shifts, and editext for editable texts (stamoplysninger)