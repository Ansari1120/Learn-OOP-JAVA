import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.color.*;
public class Myframe extends JFrame {
Myframe(){
	this.setTitle("this is GUI");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setSize(500,500);
	this.setVisible(true);
	ImageIcon image=new ImageIcon("iu logo2.jpg");
	this.setIconImage(image.getImage());
	this.getContentPane().setBackground(new Color(194,158,255));
}
}
