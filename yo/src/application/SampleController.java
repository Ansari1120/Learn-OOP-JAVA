package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SampleController {


    @FXML
    private TextField txtsub1;

    @FXML
    private TextField txtsub2;

    @FXML
    private TextField txtsub4;

    @FXML
    private TextField txtsub5;

    @FXML
    private Button calligraphy;

    @FXML
    private TextField sum1;

    @FXML
    private TextField perce1;

    @FXML
    private TextField txtsub3;

    @FXML
    private TextField m1;

    @FXML
    private TextField m2;

    @FXML
    private TextField g1;
    @FXML 
    private Text Remarks;

    @FXML
    private TextField gpa;
    
    @FXML
    void cal(ActionEvent event) {
    	int num1,num2,num3,num4,num5,tot;
    	
    	num1=Integer.parseInt(txtsub1.getText());
    	num2=Integer.parseInt(txtsub2.getText());
    	num3=Integer.parseInt(txtsub3.getText());
    	num4=Integer.parseInt(txtsub4.getText());
    	num5=Integer.parseInt(txtsub5.getText());
    	tot =num1+num2+num3+num4+num5;
    	sum1.setText(String.valueOf(tot));
        int total;
    	double Percentage;
    	num1=Integer.parseInt(txtsub1.getText());
    	num2=Integer.parseInt(txtsub2.getText());
    	num3=Integer.parseInt(txtsub3.getText());
    	num4=Integer.parseInt(txtsub4.getText());
    	num5=Integer.parseInt(txtsub5.getText());
    	total=600;
  Percentage= tot*100 / total;
    	perce1.setText(String.valueOf(Percentage));
    	
    	if(num1>num2 && num1>num3 && num1>num4 && num1>num5) {
        	m1.setText(String.valueOf(num1));
    	}
    	else if(num2>num1 && num2>num3 && num2>num4 && num2>num5) {
        	m1.setText(String.valueOf(num2));
    	}
    	else if(num3>num1 && num3>num2 && num3>num4 && num3>num5) {
        	m1.setText(String.valueOf(num3));
    	}
    	else if(num4>num1 && num4>num2 && num4>num3 && num4>num5) {
        	m1.setText(String.valueOf(num4));
    	}
    	else{
        	m1.setText(String.valueOf(num5));
    	}
    	
      	if(num1<num2 && num1<num3 && num1<num4 && num1<num5) {
        	m2.setText(String.valueOf(num1));
    	}
    	else if(num2<num1 && num2<num3 && num2<num4 && num2<num5) {
        	m2.setText(String.valueOf(num2));
    	}
    	else if(num3<num1 && num3<num2 && num3<num4 && num3<num5) {
        	m2.setText(String.valueOf(num3));
    	}
    	else if(num4<num1 && num4<num2 && num4<num3 && num4<num5) {
        	m2.setText(String.valueOf(num4));
    	}
    	else{
        	m2.setText(String.valueOf(num5));
    	}
    
      	switch((int)Percentage / 10) {
      	case 9:
        	g1.setText(String.valueOf("The Grade Is A1 !\n"));
        	Remarks.setText(String.valueOf("GOOD JOB KEEP IT UP and Try to hold your class.be positive and consistent too in your domain...."));
        	break;
      	case 8:
      	case 7:
        	g1.setText(String.valueOf("The Grade Is A !"));
        	Remarks.setText(String.valueOf("Maintaining such a name in good books isnt so easy yup hardwork pays off try to buckle up to the top as so far stats proven you can be the bestest"));
        	break;
      	case 6:
        	g1.setText(String.valueOf("The Grade Is B !"));
        	Remarks.setText(String.valueOf("Seems to be gutsy but yet not so far as to be highlighted among toppers no worries the flame is still burining need to be focused and things workout "));
        	break;
    	case 5:
        	g1.setText(String.valueOf("The Grade Is C !"));
        	Remarks.setText(String.valueOf("Everyone have hard times you just got a bit of balanced before got out of race and finish last but thats not important the past always forgotten but present work counts in future and found to be appreciated be positive and punctual set day to day goals this all one day make you what you deserve to be..."));
        	break;
      		default : 
            	g1.setText(String.valueOf("Need Improvement !"));
            	
      	}
    	//double calculate_gpa=Integer.parseInt(perce1.getText());
        double checked_gpa=Percentage/100.0*4.0;
     gpa.setText(String.valueOf(checked_gpa));
    }
}
