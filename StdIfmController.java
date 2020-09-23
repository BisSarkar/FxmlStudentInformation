/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentInformation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class StdIfmController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField txtStdId;

    @FXML
    private TextField txtStdName;

    @FXML
    private TextField txtGrade;

    @FXML
    private Label lblStdId;

    @FXML
    private Label lblStdName;

    @FXML
    private Label lblGrade;

    @FXML
    private Label lblblank;
    @FXML
    private Label lblblank1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        lblStdId.setText("Student ID");

        lblStdName.setText("Student Name");

        lblGrade.setText("Grade");

    }

    @FXML
    private void addStudent(ActionEvent event) {

        try {

            FileWriter fstream = new FileWriter("E:\\Student.txt", true);
            BufferedWriter out = new BufferedWriter(fstream);
            String ss = txtStdId.getText() + "," + txtStdName.getText() + "," + txtGrade.getText();
            out.write(ss);
            out.write("\n");
            //Close the output stream
            out.close();

        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

    }

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);

    }

}
