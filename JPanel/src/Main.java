import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		ImageIcon image=new ImageIcon("logo.jpg");
		JLabel label=new JLabel();
		label.setText("hey there.....");
		label.setIcon(image);
JPanel blackpanel=new JPanel();
blackpanel.setBackground(Color.black);
blackpanel.setBounds(0, 0, 300, 300);

JPanel bluepanel=new JPanel();
bluepanel.setBackground(Color.blue);
bluepanel.setBounds(350, 0, 300, 300);

JPanel greenpanel=new JPanel();
greenpanel.setBackground(Color.green);
greenpanel.setBounds(0, 350, 400, 700);


JFrame frame=new JFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);
frame.setSize(700,700);
frame.setVisible(true);
bluepanel.add(label);
frame.add(blackpanel);
frame.add(bluepanel);
frame.add(greenpanel);

	}

}
