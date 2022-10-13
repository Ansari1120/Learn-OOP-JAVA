import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	public static void main(String[]args) {
		Border border = BorderFactory.createLineBorder(Color.green,3);
		JFrame frame=new JFrame();
		JLabel label=new JLabel();
		
		label.setText("My Label is here ");
		frame.add(label);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of imageicon
		label.setForeground(new Color(0x91c9a0));
		label.setFont(new Font("Helvetica",Font.ITALIC,41));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.TOP);
		label.setOpaque(true);
		label.setBorder(border);
		label.setBounds(40, 40, 100, 100);
		
		ImageIcon image = new ImageIcon("night_fire.png");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setBackground(new Color(0x5f688a));
		frame.add(label);
		label.setIcon(image);

		
	}

}
