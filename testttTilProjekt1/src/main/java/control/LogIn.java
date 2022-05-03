package control;


import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;

public class LogIn {
    public Label label1;

    public TextField fieldMail;
    public TextField fieldCode;

    public Button buttonLogin;

    public control.Frivillig frivilligApp;

    public LogIn() throws FileNotFoundException {
    }


    public void setMainController(Frivillig frivillig){
        this.frivilligApp =frivillig;

    }


    public void btnClick(ActionEvent actionEvent) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("medarbejder.txt"));

        String enteredMail;
        String enteredCode;
        //String lines;
        enteredMail = fieldMail.getText();
        enteredCode = fieldCode.getText();

        //randomaccess file til at finde specifik linje

    /*while((lines = reader.readLine())!=null){
        if(enteredMail == reader.readLine() != null){

        }
    }*/



        //læs fra fil og tjek om kodeord svarer til mail
        //tjek brugernavn om det findes
        //tjek om kode passer til
        if (enteredMail.equalsIgnoreCase("frivillig") && enteredCode.equalsIgnoreCase("kode")){

            frivilligApp.FrivilligSide();
        }
        if (enteredMail.equalsIgnoreCase("ansvarlig") && enteredCode.equalsIgnoreCase("kode")){
            frivilligApp.AnsvarligSide();
        }
        else{
            label1.setText("fejl i kode eller mail");
        }
    }
}
