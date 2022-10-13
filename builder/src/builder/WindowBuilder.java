package builder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowBuilder {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilder window = new WindowBuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JLabel lblNewLabel =new JLabel();

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 791, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	
		Panel panel = new Panel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		Button button = new Button("click here");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			lblNewLabel.setText(String.valueOf("this is button action performed by clicking it"));
			}
		});
		panel.add(button);
		panel.add(lblNewLabel);
	
	}

}
