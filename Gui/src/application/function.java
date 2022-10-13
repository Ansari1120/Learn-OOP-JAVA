package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class function {

    @FXML
    private TextField txtsub2;

    @FXML
    private TextField txtsub1;

    @FXML
    private TextField txtsub3;

    @FXML
    private TextField txtsub4;

    @FXML
    private TextField txtsub5;

    @FXML
    private Button calculate;

    @FXML
    private TextField sum1;

    @FXML
    private TextField percentage1;
    @FXML
    void calculation(ActionEvent event) {
    	int num1,num2,num3,num4,num5,tot;
    	double Percentage;
    	
    	num1=Integer.parseInt(txtsub1.getText());
    	num2=Integer.parseInt(txtsub2.getText());
    	num3=Integer.parseInt(txtsub3.getText());
    	num4=Integer.parseInt(txtsub4.getText());
    	num5=Integer.parseInt(txtsub5.getText());
    	tot =num1+num2+num3+num4+num5;
    	sum1.setText(String.valueOf(tot));
    	Percentage=tot/500*100;
    	percentage1.setText(String.valueOf(Percentage));
    }


}
