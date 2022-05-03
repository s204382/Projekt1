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

    //public LogIn() throws FileNotFoundException {}


    public void setMainController(Frivillig frivillig){
        this.frivilligApp =frivillig;

    }


    public void btnClick(ActionEvent actionEvent) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\charl\\OneDrive\\Skrivebord\\Object Oriented Programming\\Projekt1\\testttTilProjekt1\\coworker.txt"));


        String enteredMail;
        String enteredCode;
        String readlines;
        String mailintxt;

        //String codeintxt;
        readlines=reader.readLine();
        //mailintxt= String.valueOf(reader.readLine());
        //codeintxt=String.valueOf(reader.readLine());

        enteredMail = fieldMail.getText();
        enteredCode = fieldCode.getText();

        //randomaccess file til at finde specifik linje



        while(readlines!=null){ //læser ligner i dokument


            String[] infosplit = readlines.trim().split("\\s+");
            String mailfromtxt = infosplit[0]; // mail
            String codefromtxt = infosplit[1]; // code
            String rolefromtxt = infosplit[3]; // role
            //String codefromtxt = infosplit[1]; // firstname
            //String codefromtxt = infosplit[1]; // last name


            if(enteredMail.equalsIgnoreCase(mailfromtxt) && enteredCode.equals(codefromtxt)){

                if(rolefromtxt.equals("ansvarlig")){
                    frivilligApp.AnsvarligSide();
                }
                else{
                    frivilligApp.FrivilligSide();
                }


            }


            readlines=reader.readLine();

        }








    }
}
