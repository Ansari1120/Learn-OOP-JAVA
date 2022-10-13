import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	String Show2=JOptionPane.showInputDialog(null,
			"Enter first number",
			"",
			JOptionPane.QUESTION_MESSAGE);
	double num1=Integer.parseInt(Show2);
	String Show3=JOptionPane.showInputDialog(null,
			"Enter Second number",
			"",
			JOptionPane.QUESTION_MESSAGE);
	double num2=Integer.parseInt(Show3);
 JComboBox comboBox;
 
 MyFrame(){
  setLayout(new FlowLayout());
  setSize(400,300);
  setTitle("Select your choice");
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setLayout(new FlowLayout()); 
  
  String[] Choice = {"Addition","Substaction","Divison","Multiplication"}; 
  comboBox = new JComboBox(Choice);

  comboBox.setSelectedIndex(1);
  comboBox.addActionListener(this);
  this.pack();
  this.setVisible(true);
  this.add(comboBox);

 }
 @Override
 public void actionPerformed(ActionEvent e) {
	  
	  JLabel lblText=new JLabel();
	  this.add(lblText);
  if(e.getSource()==comboBox) {
		JComboBox cb=(JComboBox)e.getSource();
		String showanother=(String)cb.getSelectedItem();
		switch(showanother) {
		case "Addition" :lblText.setText("the addition of your entered numbers are : "+(num1+num2));
		break;
		case "Substraction":lblText.setText("the Substraction of your entered numbers are : "+(num1-num2));
		break;
		case "Divsion":lblText.setText("the Division of your entered numbers are : "+(num1/num2));
		break;
		case "Multiplication":lblText.setText("the Multiplication of your entered numbers are : "+(num1*num2));
		break;
		default :lblText.setText("Error");
		}
 }
 }


public static void main(String[] args) {

	MyFrame obj=new MyFrame();

}
}
