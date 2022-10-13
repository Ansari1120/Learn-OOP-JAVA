

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame {
	private JTextField value_1;
	private JTextField value_2;
	protected JLabel show_answer;

	 public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApp frame = new CalculatorApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
		
		);
	
	}

		/**
		 * Create the frame.
		 */
		public CalculatorApp() {
			setTitle("Simple Calculator");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			JLabel lblNewLabel = new JLabel("Input two number for Operations");
			getContentPane().add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Enter First Number:");
			getContentPane().add(lblNewLabel_1);
			
			value_1 = new JTextField();
			getContentPane().add(value_1);
			value_1.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("Enter Second Number:");
			getContentPane().add(lblNewLabel_2);
			
			value_2 = new JTextField();
			getContentPane().add(value_2);
			value_2.setColumns(10);
			
			JLabel lblNewLabel_3 = new JLabel("Select Operation");
			getContentPane().add(lblNewLabel_3);
			
			JComboBox sum_selection = new JComboBox();
			getContentPane().add(sum_selection);
			sum_selection.addItem("Addition");
			sum_selection.addItem("Subtraction");
			sum_selection.addItem("Multiplication");
			sum_selection.addItem("Division");
			sum_selection.getSelectedItem();
			
		   JButton btnSum = new JButton("Submit");
		   getContentPane().add(btnSum);
			btnSum.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					double one=Integer.parseInt(value_1.getText());
					double two=Integer.parseInt(value_2.getText());
					String addition = String.valueOf(one+two);
					String substraction = String.valueOf(one-two);
					String multiplication = String.valueOf(one*two);
					String division = String.valueOf(one/two);
					
					if(sum_selection.getSelectedItem().equals("Addition")) {
					 	show_answer.setText(addition);
					}
					if(sum_selection.getSelectedItem().equals("Subtraction")) {
					 	show_answer.setText(substraction);
					}
					if(sum_selection.getSelectedItem().equals("Multiplication")) {
					 	show_answer.setText(multiplication);
					}
					if(sum_selection.getSelectedItem().equals("Division")) {
					 	show_answer.setText(division);
					}
				
				}
			});
			
			JLabel lblAnswer = new JLabel("Result:");
			getContentPane().add(lblAnswer);
			
			JLabel show_answer = new JLabel("");
			getContentPane().add(show_answer);	
		}

}