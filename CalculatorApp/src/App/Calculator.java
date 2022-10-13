package App;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculator {

	private JFrame frame;
	private JTextField val1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBackground(new Color(0x85c0c9));
		frame.setForeground(new Color(0x85c0c9));
		frame.getContentPane().setForeground(new Color(0x85c0c9));
		frame.setBounds(100, 100, 361, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setTitle("CALCULATOR");
		JEditorPane editorPane = new JEditorPane();
		editorPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))) {
			    //getToolKit().beep();
			    e.consume();
				}
			}
		});
		editorPane.setBounds(0, 22, 357, 73);
		//val2.setBounds(0, 48, 683, 47);
		//val1.setBounds(0, 22, 683, 26);

		frame.getContentPane().add(editorPane);
		JTextField val2 = new JTextField();
		val2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))) {
			    //getToolKit().beep();
			    e.consume();
				}
			}
		});
		val2.setFont(new Font("Tahoma", Font.BOLD, 13));
		val2.setHorizontalAlignment(SwingConstants.RIGHT);
		val2.setBorder(null);
		val2.setBounds(0, 48, 336, 47);
		frame.getContentPane().add(val2);
		val2.setColumns(10);
		
		val1 = new JTextField();
		val1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))) {
			    //getToolKit().beep();
			    e.consume();
				}
			}
		});
		val1.setFont(new Font("Tahoma", Font.BOLD, 15));
		val1.setHorizontalAlignment(SwingConstants.RIGHT);
		val1.setBorder(null);
		val1.setBounds(0, 22, 336, 26);
		frame.getContentPane().add(val1);
		val1.setColumns(10);
		
		
		JButton btnNewButton_10 = new JButton("+");
		btnNewButton_10.setForeground(SystemColor.windowText);
		btnNewButton_10.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnNewButton_10.setBackground(new Color(153, 180, 209));
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val1.setText(val2.getText()+"+");
			 actionRecieved.setText("add");
			 val2.setText(null);
			// val1.setText(val2.getText());
			}
		});
		btnNewButton_10.setBounds(268, 169, 68, 30);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.setForeground(SystemColor.windowText);
		btnNewButton_11.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnNewButton_11.setBackground(new Color(153, 180, 209));
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val1.setText(val2.getText());
				 actionRecieved.setText("sub");
				 val2.setText(null);
			}
		});
		btnNewButton_11.setBounds(268, 210, 68, 30);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("\u00F7");
		btnNewButton_12.setForeground(SystemColor.windowText);
		btnNewButton_12.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnNewButton_12.setBackground(new Color(153, 180, 209));
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val1.setText(val2.getText());
				 actionRecieved.setText("div");
				 val2.setText(null);
			}
		});
		btnNewButton_12.setBounds(268, 251, 68, 30);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("*");
		btnNewButton_13.setForeground(SystemColor.windowText);
		btnNewButton_13.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnNewButton_13.setBackground(new Color(153, 180, 209));
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val1.setText(val2.getText());
				 actionRecieved.setText("mul");
				 val2.setText(null);
			}
		});
		btnNewButton_13.setBounds(268, 292, 68, 30);
		frame.getContentPane().add(btnNewButton_13);
		

		
		JButton btnC = new JButton(" CLR");
		btnC.setForeground(SystemColor.windowText);
		btnC.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnC.setBackground(new Color(153, 180, 209));
		btnC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val1.setText(null);
				val2.setText(null);
			}
		});
		btnC.setBounds(268, 333, 68, 30);
		frame.getContentPane().add(btnC);
		
		
		
		
		JLabel lblNewLabel = new JLabel("ADVANCED CALCULATOR");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(57, 0, 245, 25);
		frame.getContentPane().add(lblNewLabel);
	
		JButton btnNewButton = new JButton("9");
		btnNewButton.setForeground(SystemColor.windowText);
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnNewButton.setBackground(new Color(153, 180, 209));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val2.setText(val2.getText()+9);
				
			}
		});
		btnNewButton.setBounds(10, 169, 68, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setForeground(SystemColor.windowText);
		btnNewButton_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnNewButton_1.setBackground(new Color(153, 180, 209));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val2.setText(val2.getText()+8);
			}
		});
		btnNewButton_1.setBounds(86, 169, 68, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.setForeground(SystemColor.windowText);
		btnNewButton_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnNewButton_2.setBackground(new Color(153, 180, 209));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val2.setText(val2.getText()+7);
			}
		});
		btnNewButton_2.setBounds(164, 169, 68, 30);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setForeground(SystemColor.windowText);
		btnNewButton_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnNewButton_3.setBackground(new Color(153, 180, 209));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val2.setText(val2.getText()+4);
			}
		});
		btnNewButton_3.setBounds(164, 217, 68, 30);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setForeground(SystemColor.windowText);
		btnNewButton_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnNewButton_4.setBackground(new Color(153, 180, 209));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val2.setText(val2.getText()+5);
			}
		});
		btnNewButton_4.setBounds(86, 217, 68, 30);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setForeground(SystemColor.windowText);
		btnNewButton_5.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnNewButton_5.setBackground(new Color(153, 180, 209));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val2.setText(val2.getText()+6);
			}
		});
		btnNewButton_5.setBounds(10, 217, 68, 30);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("3");
		btnNewButton_6.setForeground(SystemColor.windowText);
		btnNewButton_6.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnNewButton_6.setBackground(new Color(153, 180, 209));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val2.setText(val2.getText()+3);
			}
		});
		btnNewButton_6.setBounds(10, 268, 68, 30);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.setForeground(SystemColor.windowText);
		btnNewButton_7.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnNewButton_7.setBackground(new Color(153, 180, 209));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val2.setText(val2.getText()+2);
			}
		});
		btnNewButton_7.setBounds(86, 268, 68, 30);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.setForeground(SystemColor.windowText);
		btnNewButton_8.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnNewButton_8.setBackground(new Color(153, 180, 209));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val2.setText(val2.getText()+1);
			}
		});
		btnNewButton_8.setBounds(164, 268, 68, 30);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setForeground(SystemColor.windowText);
		btnNewButton_9.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnNewButton_9.setBackground(new Color(153, 180, 209));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val2.setText(val2.getText()+0);
			}
		});
		 
			JComboBox comboBox = new JComboBox();
			 comboBox_1 = new JComboBox();
			 comboBox_1.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		comboBox.getSelectedItem().equals(comboBox_1);
						val1.setText(val2.getText());
			 		
			 	}
			 });
			 JButton btnC_1 = new JButton("Ln");
			 btnC_1.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		double ops14=Double.parseDouble(String.valueOf(val2.getText()));
					ops14=Math.log10(ops14);
					val2.setText(String.valueOf("Ln = "+ops14));
			 	}
			 });
				btnC_1.setForeground(Color.BLACK);
				btnC_1.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnC_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnC_1.setBackground(SystemColor.activeCaption);
				btnC_1.setBounds(457, 301, 68, 30);
				frame.getContentPane().add(btnC_1);
				
				JButton btnNewButton_13_1 = new JButton("\u221A");
				btnNewButton_13_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//val1.setText(val2.getText());
						//actionRecieved.setText("btnNewButton_13_1");
						// val2.setText(null);
							double ops=Double.parseDouble(String.valueOf(val2.getText()));
							ops=Math.sqrt(ops);
							val2.setText(String.valueOf("SQUARE ROOT = "+ops));
					}
				});
				btnNewButton_13_1.setForeground(Color.BLACK);
				btnNewButton_13_1.setFont(new Font("Tahoma", Font.BOLD, 15));
				btnNewButton_13_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnNewButton_13_1.setBackground(SystemColor.activeCaption);
				btnNewButton_13_1.setBounds(379, 299, 68, 30);
				frame.getContentPane().add(btnNewButton_13_1);
				
				JButton btnNewButton_12_1 = new JButton("Cot");
				btnNewButton_12_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double ops8=Double.parseDouble(String.valueOf(val2.getText()));
						ops8=Math.tanh(ops8);
						val2.setText(String.valueOf("Cot = "+ops8));
					}
				});
				btnNewButton_12_1.setForeground(Color.BLACK);
				btnNewButton_12_1.setFont(new Font("Dialog", Font.BOLD, 12));
				btnNewButton_12_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnNewButton_12_1.setBackground(SystemColor.activeCaption);
				btnNewButton_12_1.setBounds(379, 258, 68, 30);
				frame.getContentPane().add(btnNewButton_12_1);
				
				JButton btnNewButton_11_1 = new JButton("Tan");
				btnNewButton_11_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double ops5=Double.parseDouble(String.valueOf(val2.getText()));
						ops5=Math.tan(ops5);
						val2.setText(String.valueOf("Tangent = "+ops5));
					}
				});
				btnNewButton_11_1.setForeground(Color.BLACK);
				btnNewButton_11_1.setFont(new Font("Dialog", Font.BOLD, 12));
				btnNewButton_11_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnNewButton_11_1.setBackground(SystemColor.activeCaption);
				btnNewButton_11_1.setBounds(379, 217, 68, 30);
				frame.getContentPane().add(btnNewButton_11_1);
				
				JButton btnNewButton_10_1 = new JButton("Log");
				btnNewButton_10_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double ops1=Double.parseDouble(String.valueOf(val2.getText()));
						ops1=Math.log(ops1);
						val2.setText(String.valueOf("LOG = "+ops1));
					}
				});
				btnNewButton_10_1.setForeground(Color.BLACK);
				btnNewButton_10_1.setFont(new Font("Dialog", Font.BOLD, 12));
				btnNewButton_10_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnNewButton_10_1.setBackground(SystemColor.activeCaption);
				btnNewButton_10_1.setBounds(379, 169, 68, 30);
				frame.getContentPane().add(btnNewButton_10_1);
				 
				JButton btnNewButton_12_2 = new JButton("X^2");
				btnNewButton_12_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double ops12=Double.parseDouble(String.valueOf(val2.getText()));
						ops12=(ops12*ops12);
						val2.setText(String.valueOf("Square = "+ops12));
					}
				});
				btnNewButton_12_2.setForeground(Color.BLACK);
				btnNewButton_12_2.setFont(new Font("Dialog", Font.BOLD, 12));
				btnNewButton_12_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnNewButton_12_2.setBackground(SystemColor.activeCaption);
				btnNewButton_12_2.setBounds(457, 258, 68, 30);
				frame.getContentPane().add(btnNewButton_12_2);
				
				JButton btnNewButton_11_2 = new JButton("Cosec");
				btnNewButton_11_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double ops6=Double.parseDouble(String.valueOf(val2.getText()));
						ops6=Math.sinh(ops6);
						val2.setText(String.valueOf("Cosec= "+ops6));
					}
				});
				btnNewButton_11_2.setForeground(Color.BLACK);
				btnNewButton_11_2.setFont(new Font("Dialog", Font.BOLD, 12));
				btnNewButton_11_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnNewButton_11_2.setBackground(SystemColor.activeCaption);
				btnNewButton_11_2.setBounds(457, 217, 68, 30);
				frame.getContentPane().add(btnNewButton_11_2);
				
				JButton btnNewButton_10_2 = new JButton("Sin");
				btnNewButton_10_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double ops2=Double.parseDouble(String.valueOf(val2.getText()));
						ops2=Math.sin(ops2);
						val2.setText(String.valueOf("Sin = "+ops2));
					}
				});
				btnNewButton_10_2.setForeground(Color.BLACK);
				btnNewButton_10_2.setFont(new Font("Dialog", Font.BOLD, 12));
				btnNewButton_10_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnNewButton_10_2.setBackground(SystemColor.activeCaption);
				btnNewButton_10_2.setBounds(457, 169, 68, 30);
				frame.getContentPane().add(btnNewButton_10_2);
				
				JButton btnNewButton_13_3 = new JButton("X^y");
				btnNewButton_13_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double ops11=Double.parseDouble(String.valueOf(val2.getText()));
						ops11=Math.pow(ops11,ops11);
						val2.setText(String.valueOf("Pow = "+ops11));
					}
				});
				btnNewButton_13_3.setForeground(Color.BLACK);
				btnNewButton_13_3.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnNewButton_13_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnNewButton_13_3.setBackground(SystemColor.activeCaption);
				btnNewButton_13_3.setBounds(535, 299, 68, 30);
				frame.getContentPane().add(btnNewButton_13_3);
				
				JButton btnNewButton_12_3 = new JButton("X^3");
				btnNewButton_12_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double ops13=Double.parseDouble(String.valueOf(val2.getText()));
						ops13=(ops13*ops13*ops13);
						val2.setText(String.valueOf("Cube = "+ops13));
					}
				});
				btnNewButton_12_3.setForeground(Color.BLACK);
				btnNewButton_12_3.setFont(new Font("Dialog", Font.BOLD, 12));
				btnNewButton_12_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnNewButton_12_3.setBackground(SystemColor.activeCaption);
				btnNewButton_12_3.setBounds(535, 258, 68, 30);
				frame.getContentPane().add(btnNewButton_12_3);
				
				JButton btnNewButton_11_3 = new JButton("Sec");
				btnNewButton_11_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double ops7=Double.parseDouble(String.valueOf(val2.getText()));
						ops7=Math.cosh(ops7);
						val2.setText(String.valueOf("Sec = "+ops7));
					}
				});
				btnNewButton_11_3.setForeground(Color.BLACK);
				btnNewButton_11_3.setFont(new Font("Dialog", Font.BOLD, 12));
				btnNewButton_11_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnNewButton_11_3.setBackground(SystemColor.activeCaption);
				btnNewButton_11_3.setBounds(535, 217, 68, 30);
				frame.getContentPane().add(btnNewButton_11_3);
				
				JButton btnNewButton_10_3 = new JButton("Cos");
				btnNewButton_10_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double ops4=Double.parseDouble(String.valueOf(val2.getText()));
						ops4=Math.cos(ops4);
						val2.setText(String.valueOf("Cos = "+ops4));
					}
				});
				btnNewButton_10_3.setForeground(Color.BLACK);
				btnNewButton_10_3.setFont(new Font("Dialog", Font.BOLD, 12));
				btnNewButton_10_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnNewButton_10_3.setBackground(SystemColor.activeCaption);
				btnNewButton_10_3.setBounds(535, 169, 68, 30);
				frame.getContentPane().add(btnNewButton_10_3);
				
				JButton btnC_3 = new JButton("\u2190");
				btnC_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String bsp=null;
						if(val2.getText().length() > 0) {
							StringBuilder strb=new StringBuilder(val2.getText());
							strb.deleteCharAt(val2.getText().length() - 1);
							bsp=strb.toString();
							val2.setText(bsp);
						}
					}
				});
				btnC_3.setForeground(Color.BLACK);
				btnC_3.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnC_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnC_3.setBackground(SystemColor.activeCaption);
				btnC_3.setBounds(268, 136, 68, 30);
				frame.getContentPane().add(btnC_3);
				
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"No_Option_Selected","Time", "Length", "Volume", "Weight & mass", "Temprature ", "Area", "Speed", "Power & Enery", "Pressure"}));
			comboBox.setBounds(10, 136, 124, 22);
			frame.getContentPane().add(comboBox);
		
			comboBox.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					if(comboBox.getSelectedItem().equals("No_Option_Selected")) {
						comboBox_1.setVisible(false);
					}
					else if(comboBox.getSelectedItem().equals("Time")) {
						comboBox_1.setSelectedItem(null);
						comboBox_1.addItem("Second_Into_Minute");
						comboBox_1.addItem("Minute_Into_Second");
						comboBox_1.addItem("Minute_Into_MiliSecond");
						comboBox_1.addItem("MiliSecond_Into_Minute");
						comboBox_1.addItem("Second_Into_MiliSecond");
						comboBox_1.addItem("MiliSecond_Into_Second");
						comboBox_1.addItem("Hours_Into_Second");
						comboBox_1.addItem("Second_Into_Hours");
						comboBox_1.addItem("Hours_Into_Minute");
						comboBox_1.addItem("Day_Into_Minute");
						comboBox_1.addItem("Minute_Into_Day");
						comboBox_1.addItem("Day_Into_Hours");
						comboBox_1.addItem("Hours_Into_Day");
						comboBox_1.addItem("Day_Into_Second");
						comboBox_1.addItem("Week_Into_Second");
						comboBox_1.addItem("Week_Into_Minute");
						comboBox_1.addItem("Week_Into_Hours");
						comboBox_1.addItem("Month_Into_Second");
						comboBox_1.addItem("Month_Into_Minute");
						comboBox_1.addItem("Month_Into_Hours");
						comboBox_1.addItem("Month_Into_Week");
						comboBox_1.addItem("years_Into_Month");
						comboBox_1.addItem("years_Into_Weeks");
						comboBox_1.addItem("years_Into_Days");
						comboBox_1.addItem("years_Into_Minutes");
						comboBox_1.addItem("years_Into_Seconds");

					}
					else if(comboBox.getSelectedItem().equals("Length")) {
						comboBox_1.setSelectedItem(null);
						comboBox_1.removeItem("Second_Into_Minute");
						comboBox_1.removeItem("Minute_Into_Second");
						comboBox_1.removeItem("Minute_Into_MiliSecond");
						comboBox_1.removeItem("MiliSecond_Into_Minute");
						comboBox_1.removeItem("Second_Into_MiliSecond");
						comboBox_1.removeItem("MiliSecond_Into_Second");
						comboBox_1.removeItem("Hours_Into_Second");
						comboBox_1.removeItem("Second_Into_Hours");
						comboBox_1.removeItem("Hours_Into_Minute");
						comboBox_1.removeItem("Day_Into_Minute");
						comboBox_1.removeItem("Minute_Into_Day");
						comboBox_1.removeItem("Day_Into_Hours");
						comboBox_1.removeItem("Hours_Into_Day");
						comboBox_1.removeItem("Day_Into_Second");
						comboBox_1.removeItem("Week_Into_Second");
						comboBox_1.removeItem("Week_Into_Minute");
						comboBox_1.removeItem("Week_Into_Hours");
						comboBox_1.removeItem("Month_Into_Second");
						comboBox_1.removeItem("Month_Into_Minute");
						comboBox_1.removeItem("Month_Into_Hours");
						comboBox_1.removeItem("Month_Into_Week");
						comboBox_1.removeItem("years_Into_Month");
						comboBox_1.removeItem("years_Into_Weeks");
						comboBox_1.removeItem("years_Into_Days");
						comboBox_1.removeItem("years_Into_Minutes");
						comboBox_1.removeItem("years_Into_Seconds");
						
						comboBox_1.addItem("Meter_Into_Centimeter");
						comboBox_1.addItem("Centimeter_Into_Meter");
						comboBox_1.addItem("Inches_Into_Feet");
						comboBox_1.addItem("Feet_Into_Inches");
						comboBox_1.addItem("Inches_Into_Feet");
						comboBox_1.addItem("Kilometers_Into_Meters");
						comboBox_1.addItem("Meters_Into_Kilometers");
						comboBox_1.addItem("Yards_Into_Miles");
						comboBox_1.addItem("Miles_Into_Yards");
						//comboBox_1.removeAllItems();
						comboBox_1.setBounds(122, 106, 173, 22);
					}
					else if(comboBox.getSelectedItem().equals("Volume")) {
						comboBox_1.setSelectedItem(null);
						comboBox_1.removeItem("Meter_Into_Centimeter");
						comboBox_1.removeItem("Centimeter_Into_Meter");
						comboBox_1.removeItem("Inches_Into_Feet");
						comboBox_1.removeItem("Feet_Into_Inches");
						comboBox_1.removeItem("Inches_Into_Feet");
						comboBox_1.removeItem("Kilometers_Into_Meters");
						comboBox_1.removeItem("Meters_Into_Kilometers");
						comboBox_1.removeItem("Yards_Into_Miles");
						comboBox_1.removeItem("Miles_Into_Yards");
						
						comboBox_1.addItem("Liters_Into_MiliLiters");
						comboBox_1.addItem("MiliLiters_Into_Liters");
						comboBox_1.addItem("Gallon_Into_Liters");
						comboBox_1.addItem("Liters_Into_Gallon");
						comboBox_1.addItem("Gallon_Into_MiliLiters");
						comboBox_1.addItem("MiliLiters_Into_Gallon");
						comboBox_1.setBounds(122, 106, 173, 22);
					}	else if(comboBox.getSelectedItem().equals("Weight & mass")) {
						comboBox_1.setSelectedItem(null);
						comboBox_1.removeItem("Meter_Into_Centimeter");
						comboBox_1.removeItem("Centimeter_Into_Meter");
						comboBox_1.removeItem("Inches_Into_Feet");
						comboBox_1.removeItem("Feet_Into_Inches");
						comboBox_1.removeItem("Inches_Into_Feet");
						comboBox_1.removeItem("Kilometers_Into_Meters");
						comboBox_1.removeItem("Meters_Into_Kilometers");
						comboBox_1.removeItem("Yards_Into_Miles");
						comboBox_1.removeItem("Miles_Into_Yards");
						comboBox_1.removeItem("Liters_Into_MiliLiters");
						comboBox_1.removeItem("MiliLiters_Into_Liters");
						comboBox_1.removeItem("Gallon_Into_Liters");
						comboBox_1.removeItem("Liters_Into_Gallon");
						comboBox_1.removeItem("Gallon_Into_MiliLiters");
						comboBox_1.removeItem("MiliLiters_Into_Gallon");

						comboBox_1.addItem("KiloGrams_Into_Grams");
						comboBox_1.addItem("Grams_Into_KiloGrams");
						comboBox_1.addItem("Pounds_Into_Grams");
						comboBox_1.addItem("Grams_Into_Pounds");
						comboBox_1.addItem("Pounds_Into_KiloGrams");
						comboBox_1.addItem("KiloGrams_Into_Pounds");
						comboBox_1.addItem("Tones_Into_KiloGrams");
						comboBox_1.addItem("KiloGrams_Into_Tones");
						comboBox_1.addItem("Tones_Into_Grams");
						comboBox_1.addItem("Grams_Into_Tones");
						comboBox_1.addItem("Tones_Into_Pounds");
						comboBox_1.addItem("Pounds_Into_Tones");
						comboBox_1.setBounds(122, 106, 173, 22);
					}
					else if(comboBox.getSelectedItem().equals("Temprature")) {
						comboBox_1.setSelectedItem(null);
						comboBox_1.removeItem("Meter_Into_Centimeter");
						comboBox_1.removeItem("Centimeter_Into_Meter");
						comboBox_1.removeItem("Inches_Into_Feet");
						comboBox_1.removeItem("Feet_Into_Inches");
						comboBox_1.removeItem("Inches_Into_Feet");
						comboBox_1.removeItem("Kilometers_Into_Meters");
						comboBox_1.removeItem("Meters_Into_Kilometers");
						comboBox_1.removeItem("Yards_Into_Miles");
						comboBox_1.removeItem("Miles_Into_Yards");
						comboBox_1.removeItem("Liters_Into_MiliLiters");
						comboBox_1.removeItem("MiliLiters_Into_Liters");
						comboBox_1.removeItem("Gallon_Into_Liters");
						comboBox_1.removeItem("Liters_Into_Gallon");
						comboBox_1.removeItem("Gallon_Into_MiliLiters");
						comboBox_1.removeItem("MiliLiters_Into_Gallon");
						comboBox_1.removeItem("KiloGrams_Into_Grams");
						comboBox_1.removeItem("Grams_Into_KiloGrams");
						comboBox_1.removeItem("Pounds_Into_Grams");
						comboBox_1.removeItem("Grams_Into_Pounds");
						comboBox_1.removeItem("Pounds_Into_KiloGrams");
						comboBox_1.removeItem("KiloGrams_Into_Pounds");
						comboBox_1.removeItem("Tones_Into_KiloGrams");
						comboBox_1.removeItem("KiloGrams_Into_Tones");
						comboBox_1.removeItem("Tones_Into_Grams");
						comboBox_1.removeItem("Grams_Into_Tones");
						comboBox_1.removeItem("Tones_Into_Pounds");
						comboBox_1.removeItem("Pounds_Into_Tones");
						
						comboBox_1.addItem("Celsius_Into_Fahrenheit");
						comboBox_1.addItem("Fahrenheit_Into_Celsius");
						comboBox_1.addItem("Kelvin_Into_Fahrenheit");
						comboBox_1.addItem("Fahrenheit_Into_Kelvin");
						comboBox_1.addItem("Kelvin_Into_Celsius");
						comboBox_1.addItem("Celsius_Into_Kelvin");
						comboBox_1.setBounds(122, 106, 173, 22);
					}
					else if(comboBox.getSelectedItem().equals("Area")) {
						comboBox_1.setSelectedItem(null);
						comboBox_1.removeItem("Meter_Into_Centimeter");
						comboBox_1.removeItem("Centimeter_Into_Meter");
						comboBox_1.removeItem("Inches_Into_Feet");
						comboBox_1.removeItem("Feet_Into_Inches");
						comboBox_1.removeItem("Inches_Into_Feet");
						comboBox_1.removeItem("Kilometers_Into_Meters");
						comboBox_1.removeItem("Meters_Into_Kilometers");
						comboBox_1.removeItem("Yards_Into_Miles");
						comboBox_1.removeItem("Miles_Into_Yards");
						comboBox_1.removeItem("Liters_Into_MiliLiters");
						comboBox_1.removeItem("MiliLiters_Into_Liters");
						comboBox_1.removeItem("Gallon_Into_Liters");
						comboBox_1.removeItem("Liters_Into_Gallon");
						comboBox_1.removeItem("Gallon_Into_MiliLiters");
						comboBox_1.removeItem("MiliLiters_Into_Gallon");
						comboBox_1.removeItem("KiloGrams_Into_Grams");
						comboBox_1.removeItem("Grams_Into_KiloGrams");
						comboBox_1.removeItem("Pounds_Into_Grams");
						comboBox_1.removeItem("Grams_Into_Pounds");
						comboBox_1.removeItem("Pounds_Into_KiloGrams");
						comboBox_1.removeItem("KiloGrams_Into_Pounds");
						comboBox_1.removeItem("Tones_Into_KiloGrams");
						comboBox_1.removeItem("KiloGrams_Into_Tones");
						comboBox_1.removeItem("Tones_Into_Grams");
						comboBox_1.removeItem("Grams_Into_Tones");
						comboBox_1.removeItem("Tones_Into_Pounds");
						comboBox_1.removeItem("Pounds_Into_Tones");
						comboBox_1.removeItem("Celsius_Into_Fahrenheit");
						comboBox_1.removeItem("Fahrenheit_Into_Celsius");
						comboBox_1.removeItem("Kelvin_Into_Fahrenheit");
						comboBox_1.removeItem("Kelvin_Into_Celsius");

						comboBox_1.addItem("Meter_Into_Feet");
						comboBox_1.addItem("Foot_Into_Meter");
						comboBox_1.addItem("Acres_Into_Meter");
						comboBox_1.addItem("Acres_Into_Foot");
						comboBox_1.addItem("Foot_Into_Acres");
						comboBox_1.addItem("Meter_Into_Acres");
						comboBox_1.addItem("KiloMeter_Into_Acres");
						comboBox_1.addItem("Acres_Into_KiloMeter");
						comboBox_1.addItem("Acres_Into_Square mile");
						comboBox_1.addItem("Square mile_Into_Acres");
						comboBox_1.addItem("Acres_Into_Square mile");
						comboBox_1.addItem("Square mile_Into_Yards");
						comboBox_1.addItem("Yards_Into_Square mile");
						comboBox_1.addItem("Yards_Into_Meter");
						comboBox_1.addItem("Meter_Into_Yards");
						comboBox_1.setBounds(122, 106, 173, 22);
					}
					else if(comboBox.getSelectedItem().equals("Speed")) {
						comboBox_1.setSelectedItem(null);
						comboBox_1.removeItem("Meter_Into_Centimeter");
						comboBox_1.removeItem("Centimeter_Into_Meter");
						comboBox_1.removeItem("Inches_Into_Feet");
						comboBox_1.removeItem("Feet_Into_Inches");
						comboBox_1.removeItem("Inches_Into_Feet");
						comboBox_1.removeItem("Kilometers_Into_Meters");
						comboBox_1.removeItem("Meters_Into_Kilometers");
						comboBox_1.removeItem("Yards_Into_Miles");
						comboBox_1.removeItem("Miles_Into_Yards");
						comboBox_1.removeItem("Liters_Into_MiliLiters");
						comboBox_1.removeItem("MiliLiters_Into_Liters");
						comboBox_1.removeItem("Gallon_Into_Liters");
						comboBox_1.removeItem("Liters_Into_Gallon");
						comboBox_1.removeItem("Gallon_Into_MiliLiters");
						comboBox_1.removeItem("MiliLiters_Into_Gallon");
						comboBox_1.removeItem("KiloGrams_Into_Grams");
						comboBox_1.removeItem("Grams_Into_KiloGrams");
						comboBox_1.removeItem("Pounds_Into_Grams");
						comboBox_1.removeItem("Grams_Into_Pounds");
						comboBox_1.removeItem("Pounds_Into_KiloGrams");
						comboBox_1.removeItem("KiloGrams_Into_Pounds");
						comboBox_1.removeItem("Tones_Into_KiloGrams");
						comboBox_1.removeItem("KiloGrams_Into_Tones");
						comboBox_1.removeItem("Tones_Into_Grams");
						comboBox_1.removeItem("Grams_Into_Tones");
						comboBox_1.removeItem("Tones_Into_Pounds");
						comboBox_1.removeItem("Pounds_Into_Tones");
						comboBox_1.removeItem("Celsius_Into_Fahrenheit");
						comboBox_1.removeItem("Fahrenheit_Into_Celsius");
						comboBox_1.removeItem("Kelvin_Into_Fahrenheit");
						comboBox_1.removeItem("Kelvin_Into_Celsius");
						comboBox_1.removeItem("Meter_Into_Feet");
						comboBox_1.removeItem("Feet_Into_Meter");
						comboBox_1.removeItem("Acres_Into_Meter");
						comboBox_1.removeItem("Acres_Into_Feet");
						comboBox_1.removeItem("Feet_Into_Acres");
						comboBox_1.removeItem("Meter_Into_Acres");
						
						comboBox_1.addItem("Kmph_Into_mph");
						comboBox_1.addItem("mph_Into_kmph");
						comboBox_1.addItem("mps_Into_kmph");
						comboBox_1.addItem("kmph_Into_mps");
						comboBox_1.addItem("mps_Into_mph");
						comboBox_1.addItem("mph_Into_mps");

						comboBox_1.setBounds(122, 106, 173, 22);
					}
					else if(comboBox.getSelectedItem().equals("Power & Enery")) {
						comboBox_1.setSelectedItem(null);
						comboBox_1.removeItem("Meter_Into_Centimeter");
						comboBox_1.removeItem("Centimeter_Into_Meter");
						comboBox_1.removeItem("Inches_Into_Feet");
						comboBox_1.removeItem("Feet_Into_Inches");
						comboBox_1.removeItem("Inches_Into_Feet");
						comboBox_1.removeItem("Kilometers_Into_Meters");
						comboBox_1.removeItem("Meters_Into_Kilometers");
						comboBox_1.removeItem("Yards_Into_Miles");
						comboBox_1.removeItem("Miles_Into_Yards");
						comboBox_1.removeItem("Liters_Into_MiliLiters");
						comboBox_1.removeItem("MiliLiters_Into_Liters");
						comboBox_1.removeItem("Gallon_Into_Liters");
						comboBox_1.removeItem("Liters_Into_Gallon");
						comboBox_1.removeItem("Gallon_Into_MiliLiters");
						comboBox_1.removeItem("MiliLiters_Into_Gallon");
						comboBox_1.removeItem("KiloGrams_Into_Grams");
						comboBox_1.removeItem("Grams_Into_KiloGrams");
						comboBox_1.removeItem("Pounds_Into_Grams");
						comboBox_1.removeItem("Grams_Into_Pounds");
						comboBox_1.removeItem("Pounds_Into_KiloGrams");
						comboBox_1.removeItem("KiloGrams_Into_Pounds");
						comboBox_1.removeItem("Tones_Into_KiloGrams");
						comboBox_1.removeItem("KiloGrams_Into_Tones");
						comboBox_1.removeItem("Tones_Into_Grams");
						comboBox_1.removeItem("Grams_Into_Tones");
						comboBox_1.removeItem("Tones_Into_Pounds");
						comboBox_1.removeItem("Pounds_Into_Tones");
						comboBox_1.removeItem("Celsius_Into_Fahrenheit");
						comboBox_1.removeItem("Fahrenheit_Into_Celsius");
						comboBox_1.removeItem("Kelvin_Into_Fahrenheit");
						comboBox_1.removeItem("Kelvin_Into_Celsius");
						comboBox_1.removeItem("Meter_Into_Feet");
						comboBox_1.removeItem("Feet_Into_Meter");
						comboBox_1.removeItem("Acres_Into_Meter");
						comboBox_1.removeItem("Acres_Into_Feet");
						comboBox_1.removeItem("Feet_Into_Acres");
						comboBox_1.removeItem("Meter_Into_Acres");
						comboBox_1.removeItem("Kmph_Into_mph");
						comboBox_1.removeItem("mph_Into_kmph");
						comboBox_1.removeItem("mps_Into_kmph");
						comboBox_1.removeItem("kmph_Into_mps");
						
						comboBox_1.addItem("Watts_Into_KiloWatts");
						comboBox_1.addItem("KiloWatts_Into_Watts");
						comboBox_1.addItem("Horsepower_Into_Watts");
						comboBox_1.addItem("Watts_Into_Horsepower");
						comboBox_1.addItem("KiloWatts_Into_Joule");
						comboBox_1.addItem("Joule_Into_KiloWatts");
						comboBox_1.addItem("Joule_Into_Watts");
						comboBox_1.addItem("Watts_Into_Joule");
						comboBox_1.addItem("Electron volt_Into_Joule");
						comboBox_1.addItem("Joule_Into_Electron volt");
						comboBox_1.addItem("Electron volt_Into_Watts");
						comboBox_1.addItem("Watts_Into_Electron volt");
						comboBox_1.addItem("Electron volt_Into_KiloWatts");
						comboBox_1.addItem("KiloWatts_Into_Electron volt");

						comboBox_1.setBounds(122, 106, 173, 22);
					}
					else if(comboBox.getSelectedItem().equals("Pressure")) {
						comboBox_1.setSelectedItem(null);
						comboBox_1.removeItem("Meter_Into_Centimeter");
						comboBox_1.removeItem("Centimeter_Into_Meter");
						comboBox_1.removeItem("Inches_Into_Feet");
						comboBox_1.removeItem("Feet_Into_Inches");
						comboBox_1.removeItem("Inches_Into_Feet");
						comboBox_1.removeItem("Kilometers_Into_Meters");
						comboBox_1.removeItem("Meters_Into_Kilometers");
						comboBox_1.removeItem("Yards_Into_Miles");
						comboBox_1.removeItem("Miles_Into_Yards");
						comboBox_1.removeItem("Liters_Into_MiliLiters");
						comboBox_1.removeItem("MiliLiters_Into_Liters");
						comboBox_1.removeItem("Gallon_Into_Liters");
						comboBox_1.removeItem("Liters_Into_Gallon");
						comboBox_1.removeItem("Gallon_Into_MiliLiters");
						comboBox_1.removeItem("MiliLiters_Into_Gallon");
						comboBox_1.removeItem("KiloGrams_Into_Grams");
						comboBox_1.removeItem("Grams_Into_KiloGrams");
						comboBox_1.removeItem("Pounds_Into_Grams");
						comboBox_1.removeItem("Grams_Into_Pounds");
						comboBox_1.removeItem("Pounds_Into_KiloGrams");
						comboBox_1.removeItem("KiloGrams_Into_Pounds");
						comboBox_1.removeItem("Tones_Into_KiloGrams");
						comboBox_1.removeItem("KiloGrams_Into_Tones");
						comboBox_1.removeItem("Tones_Into_Grams");
						comboBox_1.removeItem("Grams_Into_Tones");
						comboBox_1.removeItem("Tones_Into_Pounds");
						comboBox_1.removeItem("Pounds_Into_Tones");
						comboBox_1.removeItem("Celsius_Into_Fahrenheit");
						comboBox_1.removeItem("Fahrenheit_Into_Celsius");
						comboBox_1.removeItem("Kelvin_Into_Fahrenheit");
						comboBox_1.removeItem("Kelvin_Into_Celsius");
						comboBox_1.removeItem("Meter_Into_Feet");
						comboBox_1.removeItem("Feet_Into_Meter");
						comboBox_1.removeItem("Acres_Into_Meter");
						comboBox_1.removeItem("Acres_Into_Feet");
						comboBox_1.removeItem("Feet_Into_Acres");
						comboBox_1.removeItem("Meter_Into_Acres");
						comboBox_1.removeItem("Kmph_Into_mph");
						comboBox_1.removeItem("mph_Into_kmph");
						comboBox_1.removeItem("mps_Into_kmph");
						comboBox_1.removeItem("kmph_Into_mps");
						comboBox_1.removeItem("Watts_Into_KiloWatts");
						comboBox_1.removeItem("KiloWatts_Into_Watts");
						comboBox_1.removeItem("Horsepower_Into_Watts");
						comboBox_1.removeItem("Horsepower_Into_KiloWatts");
						comboBox_1.removeItem("Watts_Into_Horsepower");
						comboBox_1.removeItem("KiloWatts_Into_Horsepower");
						
						comboBox_1.addItem("Atmosphere_Into_Psi");
						comboBox_1.addItem("Psi_Into_Atmosphere");
						comboBox_1.addItem("Atmosphere_Into_Kpa");
						comboBox_1.addItem("torr_Into_Atmosphere");
						comboBox_1.addItem("Atmosphere_Into_torr");
						comboBox_1.addItem("Pascals_Into_Atmosphere");
						comboBox_1.addItem("Atmosphere_Into_Pascal");
						comboBox_1.addItem("torr_Into_Pascal");
						comboBox_1.addItem("Pascal_Into_torr");
						comboBox_1.addItem("Pascal_Into_Psi");
						comboBox_1.addItem("Psi_Into_Pascal");
						comboBox_1.setBounds(122, 106, 173, 22);
					}
					 
					comboBox.addActionListener(new ActionListener() {
					    @Override
					    public void actionPerformed(ActionEvent e) {
					        JComboBox dropdown = (JComboBox)e.getSource();
					        DefaultComboBoxModel model = (DefaultComboBoxModel)dropdown.getModel();
					        model.equals(dropdown.getSelectedItem());

					    }
					});
				
					if(e.getSource()==comboBox) {
						JComboBox cb=(JComboBox)e.getSource();
						String showOptions=(String)cb.getSelectedItem();
						switch(showOptions) {
						case "Length" :
								val1.setText(val2.getText());
								 actionRecieved.setText("Length");
						 break;
						case "Volume" : val1.setText(val2.getText());
						 actionRecieved.setText("Volume");
						 //val2.setText(null);
						 break;
						case "Weigth & mass" : val1.setText(val2.getText());
						 actionRecieved.setText("Weigth & mass");
						 //val2.setText(null);
						 break;
						//case "Energy" : val1.setText(val2.getText());
						// actionRecieved.setText("Energy");
						// val2.setText(null);
						// break;
						case "Temprature" : val1.setText(val2.getText());
						 actionRecieved.setText("Temprature");
						 //val2.setText(null);
						 break;
						case "Area" : val1.setText(val2.getText());
						 actionRecieved.setText("Area");
						 //val2.setText(null);
						 break;
						case "Speed" : val1.setText(val2.getText());
						 actionRecieved.setText("Speed");
						 //val2.setText(null);
						 break;
						case "Power" : val1.setText(val2.getText());
						 actionRecieved.setText("Power & Enery");
						 //val2.setText(null);
						 break;
						case "Pressure" : val1.setText(val2.getText());
						 actionRecieved.setText("Pressure");
						 //val2.setText(null);
						 break;
						}
					}
				}
			});

		btnNewButton_9.setBounds(10, 309, 144, 30);
		frame.getContentPane().add(btnNewButton_9);
		
		comboBox.setVisible(false);
		comboBox_1.setVisible(false);

		
		JLabel lblNewLabel_1 = new JLabel("Conversions :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(10, 106, 75, 19);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);
		
		frame.getContentPane().add(comboBox_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(135, 206, 235));
		menuBar.setBounds(0, 0, 47, 22);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("file");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Standard ");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setVisible(false);
				comboBox_1.setVisible(false);
				lblNewLabel_1.setVisible(false);
				frame.setBounds(100, 100, 363, 420);

			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Scientific");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setVisible(false);
				comboBox_1.setVisible(false);
				lblNewLabel_1.setVisible(false);
				frame.setBounds(100, 100, 698, 420);
				editorPane.setBounds(0, 22, 695, 73);
				val2.setBounds(0, 48, 683, 47);
				val1.setBounds(0, 22, 683, 26);

			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Unit Conversion");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setVisible(true);
				comboBox_1.setVisible(true);
				lblNewLabel_1.setVisible(true);

			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		 //comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Meter_Into_Centimeter", "Centimeter_Into_Meter", "Inches_Into_Feet", "Feet_Into_Inches", "Kilometers_Into_Meters", "Meters_into_Kilometers", "Yards_Into_Miles", "Miles_Into_Yards"}));
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.setForeground(SystemColor.windowText);
		btnNewButton_14.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnNewButton_14.setBackground(new Color(153, 180, 209));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int one=Integer.parseInt(val1.getText());
				int two=Integer.parseInt(val2.getText());
				double three=Double.parseDouble(val2.getText());
				int four=Integer.parseInt(val2.getText());
				long five=Long.parseLong(val2.getText());
				//double six=Double.parseDouble(val1.getText());

				if(actionRecieved.getText().equals("add")) {
					int add=one+two;
						val2.setText(String.valueOf("= "+add));		
				}
				if(actionRecieved.getText().equals("sub")) {
					int sub=one-two;
					val2.setText(String.valueOf(sub));
				}
				if(actionRecieved.getText().equals("div")) {
					double div=one/two;
					val2.setText(String.valueOf("= "+div));
				}
				if(actionRecieved.getText().equals("mul")) {
					int mul=one*two;
					val2.setText(String.valueOf("= "+mul));
				}
				//if(actionRecieved.getText().equals("\u03C0")) {
				//	double pi=3.14159265359*three;
				///	val2.setText(String.valueOf("= ")+String.valueOf(pi));
					
				//}
				if(actionRecieved.getText().equals("Time")) {
					if(comboBox_1.getSelectedItem().equals("Second_Into_Minute")) {
						double stom=three/60;
						val2.setText(String.valueOf("Second_Into_Minute = ")+Double.toString(stom)+"m");
					}else if(comboBox_1.getSelectedItem().equals("Minute_Into_Second")) {
							int stom=four*60;
							val2.setText(String.valueOf("Minute_Into_Second = ")+Integer.toString(stom)+"m");
						}
					else if(comboBox_1.getSelectedItem().equals("Minute_Into_MiliSecond")) {
						int stoml=four*60000;
						val2.setText(String.valueOf("Minute_Into_MiliSecond = ")+Integer.toString(stoml)+"ml");
					}
					else if(comboBox_1.getSelectedItem().equals("MiliSecond_Into_Minute")) {
						double mltom=three/60000;
						val2.setText(String.valueOf("MiliSecond_Into_Minute = ")+Double.toString(mltom)+"m");
					}
					else if(comboBox_1.getSelectedItem().equals("Second_Into_MiliSecond")) {
						double stoml=three*1000;
						val2.setText(String.valueOf("Second_Into_MiliSecond = ")+Double.toString(stoml)+"ml");
					}
					else if(comboBox_1.getSelectedItem().equals("MiliSecond_Into_Second")) {
						double stom=three/1000;
						val2.setText(String.valueOf("MiliSecond_Into_Second = ")+Double.toString(stom)+"ml");
					}
					else if(comboBox_1.getSelectedItem().equals("Hours_Into_Second")) {
						double htos=three*3600;
						val2.setText(String.valueOf("Hours_Into_Second = ")+Double.toString(htos)+"s");
					}
					else if(comboBox_1.getSelectedItem().equals("Second_Into_Hours")) {
						double stoh=three/3600;
						val2.setText(String.valueOf("Second_Into_Hours = ")+Double.toString(stoh)+"h");
					}
					else if(comboBox_1.getSelectedItem().equals("Hours_Into_Minute")) {
						double htom=three*60;
						val2.setText(String.valueOf("Hours_Into_Minute = ")+Double.toString(htom)+"m");
					}
					else if(comboBox_1.getSelectedItem().equals("Minute_Into_Hours")) {
						double mtoh=three/60;
						val2.setText(String.valueOf("Minute_Into_Hours = ")+Double.toString(mtoh)+"h");
					}
					else if(comboBox_1.getSelectedItem().equals("Day_Into_Minute")) {
						double dtom=three*1440;
						val2.setText(String.valueOf("Day_Into_Minute = ")+Double.toString(dtom)+"m");
					}
					else if(comboBox_1.getSelectedItem().equals("Minute_Into_Day")) {
						double dtom=three/1440;
						val2.setText(String.valueOf("Minute_Into_Day = ")+Double.toString(dtom)+"d");
					}
					else if(comboBox_1.getSelectedItem().equals("Day_Into_Hours")) {
						double dtoh=three*24;
						val2.setText(String.valueOf("Day_Into_Hours = ")+Double.toString(dtoh)+"hrs");
					}
					else if(comboBox_1.getSelectedItem().equals("Hours_Into_Day")) {
						double htod=three/24;
						val2.setText(String.valueOf("Hours_Into_Day = ")+Double.toString(htod)+"hrs");
					}
					else if(comboBox_1.getSelectedItem().equals("Day_Into_Second")) {
						double dtos=three*86400;
						val2.setText(String.valueOf("Day_Into_Second = ")+Double.toString(dtos)+"s");
					}
					else if(comboBox_1.getSelectedItem().equals("Week_Into_Second")) {
						double wtos=three*604800;
						val2.setText(String.valueOf("Week_Into_Second = ")+Double.toString(wtos)+"s");
					}
					else if(comboBox_1.getSelectedItem().equals("Week_Into_Minute")) {
						double wtom=three*10080;
						val2.setText(String.valueOf("Week_Into_Second = ")+Double.toString(wtom)+"m");
					}
					else if(comboBox_1.getSelectedItem().equals("Week_Into_Hours")) {
						double wtoh=three*168;
						val2.setText(String.valueOf("Week_Into_Second = ")+Double.toString(wtoh)+"m");
					}
					else if(comboBox_1.getSelectedItem().equals("Month_Into_Second")) {
						double mtos=three*2.2628000000;
						val2.setText(String.valueOf("Month_Into_Second = ")+Double.toString(mtos)+"s");
					}
					else if(comboBox_1.getSelectedItem().equals("Month_Into_Minute")) {
						double mtom=three*43800;
						val2.setText(String.valueOf("Month_Into_Minute = ")+Double.toString(mtom)+"m");
					}
					else if(comboBox_1.getSelectedItem().equals("Month_Into_Hours")) {
						double mtom=three*730;
						val2.setText(String.valueOf("Month_Into_Hours = ")+Double.toString(mtom)+"hrs");
					}
					else if(comboBox_1.getSelectedItem().equals("Month_Into_Week")) {
						double mtow=three*4.345;
						val2.setText(String.valueOf("Month_Into_Week = ")+Double.toString(mtow)+"hrs");
					}
					else if(comboBox_1.getSelectedItem().equals("years_Into_Month")) {
						double ytom=three*12;
						val2.setText(String.valueOf("years_Into_Month = ")+Double.toString(ytom)+"m");
					}
					else if(comboBox_1.getSelectedItem().equals("years_Into_Week")) {
						double ytom=three*52.143;
						val2.setText(String.valueOf("years_Into_Week")+Double.toString(ytom)+"w");
					}
					else if(comboBox_1.getSelectedItem().equals("years_Into_Hours")) {
						double ytoh=three*8760;
						val2.setText(String.valueOf("years_Into_Hours")+Double.toString(ytoh)+"w");
					}
					else if(comboBox_1.getSelectedItem().equals("years_Into_Minute")) {
						double ytom=three*525600;
						val2.setText(String.valueOf("years_Into_Minute")+Double.toString(ytom)+"m");
					}
					else if(comboBox_1.getSelectedItem().equals("years_Into_Second")) {
						double ytos=three*3.1540000000;
						val2.setText(String.valueOf("years_Into_Second")+Double.toString(ytos)+"s");
					}
				}
				if(actionRecieved.getText().equals("Length")) {
					
					if(comboBox_1.getSelectedItem().equals("Meter_Into_Centimeter")) {
							int mtocm=four*100;
							val2.setText(String.valueOf("Meter_Into_Centimeter = ")+Integer.toString(mtocm)+"cm");
				}
					else if(comboBox_1.getSelectedItem().equals("Centimeter_Into_Meter")) {
						double cmtom=three/100;
						val2.setText(String.valueOf("Centimeter_Into_Meter = ")+Double.toString(cmtom)+"m");
				}
					else if(comboBox_1.getSelectedItem().equals("Inches_Into_Feet")) {
						double itof=three/12;
						val2.setText(String.valueOf("Inches_Into_Feet = ")+Double.toString(itof)+"ft");
				}
					else if(comboBox_1.getSelectedItem().equals("Feet_Into_Inches")) {
						int ftoi=four*12;
						val2.setText(String.valueOf("Feet_Into_Inches = ")+Integer.toString(ftoi)+"inches");
				}
					else if(comboBox_1.getSelectedItem().equals("Kilometers_Into_Meters")) {
						double kmtom=three*12;
						val2.setText(String.valueOf("Kilometers_Into_Meters = ")+Double.toString(kmtom)+"meters");
				}
					else if(comboBox_1.getSelectedItem().equals("Meters_Into_Kilometers")) {
						double mtokm=three/12;
						val2.setText(String.valueOf("Meters_Into_Kilometers = ")+Double.toString(mtokm)+"kms");
				}
					else if(comboBox_1.getSelectedItem().equals("Yards_Into_Miles")) {
						double ytom=three/1760;
						val2.setText(String.valueOf("Yards_Into_Miles = ")+Double.toString(ytom)+"miles");
				}
					else if(comboBox_1.getSelectedItem().equals("Miles_Into_Yards")) {
						int mtoy=four*1760;
						val2.setText(String.valueOf("Miles_Into_Yards = ")+Integer.toString(mtoy)+"yards");
				}
				}
				
				if(actionRecieved.getText().equals("Volume")) {
					/*
					comboBox_1.removeItem("Meter_Into_Centimeter");
					comboBox_1.removeItem("Centimeter_Into_Meter");
					comboBox_1.removeItem("Inches_Into_Feet");
					comboBox_1.removeItem("Feet_Into_Inches");
					comboBox_1.removeItem("Kilometers_Into_Meters");
					comboBox_1.removeItem("Meters_Into_Kilometers");
					comboBox_1.removeItem("Yards_Into_Miles");
					comboBox_1.removeItem("Miles_Into_Yards");
					comboBox_1.removeAllItems();*/
					if(comboBox_1.getSelectedItem().equals("Liters_Into_MiliLiters")) {
						int ltoml=four*1000;
						val2.setText(String.valueOf("Liters into Militers = ")+Integer.toString(ltoml)+"ml");
			}else if(comboBox_1.getSelectedItem().equals("MiliLiters_Into_Liters")) {
					double mltol=three/1000;
					val2.setText(String.valueOf("MiliLiters_Into_Liters = ")+Double.toString(mltol)+"liters");
		}
			else if(comboBox_1.getSelectedItem().equals("Gallon_Into_Liters")) {
				double gltol=three*3.785;
				val2.setText(String.valueOf("Gallon_Into_Liters = ")+Double.toString(gltol)+"liters");
	}
			else if(comboBox_1.getSelectedItem().equals("Liters_Into_Gallon")) {
				double gltol=three/3.785;
				val2.setText(String.valueOf("Liters_Into_Gallon = ")+Double.toString(gltol)+"gl");
	}
			else if(comboBox_1.getSelectedItem().equals("Gallon_Into_MiliLiters")) {
				double gltoml=three/3785;
				val2.setText(String.valueOf("Gallon_Into_MiliLiters = ")+Double.toString(gltoml)+"ml");
	}
			else if(comboBox_1.getSelectedItem().equals("MiliLiters_Into_Gallon")) {
				double mltogl=three*3785;
				val2.setText(String.valueOf("MiliLiters_Into_Gallon = ")+Double.toString(mltogl)+"gl");
	}
					
				}
				if(actionRecieved.getText().equals("Weight & mass")) {

                  
					 if(comboBox_1.getSelectedItem().equals("KiloGrams_Into_Grams")) {
							int kltog=four*1000;
							val2.setText(String.valueOf("KiloGrams_Into_Grams = ")+Integer.toString(kltog)+"grams");
					}
					 else if(comboBox_1.getSelectedItem().equals("Grams_Into_KiloGrams")) {
							double gtokl=three/1000;
							val2.setText(String.valueOf("Grams_Into_KiloGrams = ")+Double.toString(gtokl)+"kl");
					}
					 else if(comboBox_1.getSelectedItem().equals("Pounds_Into_Grams")) {
							int ptog=four*454;
							val2.setText(String.valueOf("Pounds_Into_Grams = ")+Integer.toString(ptog)+"grams");
					}
					 else if(comboBox_1.getSelectedItem().equals("Grams_Into_Pounds")) {
							double gtop=three/454;
							val2.setText(String.valueOf("Grams_Into_Pounds = ")+Double.toString(gtop)+"Pounds");
					}
					 else if(comboBox_1.getSelectedItem().equals("Pounds_Into_KiloGrams")) {
							double ptokg=three/2.205;
							val2.setText(String.valueOf("Pounds_Into_KiloGrams = ")+Double.toString(ptokg)+"Kg");
					}
					 else if(comboBox_1.getSelectedItem().equals("KiloGram_Into_Pounds")) {
							double kgtop=two*2.205;
							val2.setText(String.valueOf("KiloGram_Into_Pounds = ")+Double.toString(kgtop)+"Pounds");
					}
					 else if(comboBox_1.getSelectedItem().equals("Tones_Into_KiloGrams")) {
							int ttokg=two*1000;
							val2.setText(String.valueOf("Tones_Into_KiloGrams = ")+Integer.toString(ttokg)+"kg");
					}
					 else if(comboBox_1.getSelectedItem().equals("Tones_Into_KiloGrams")) {
							double ttokg=three/1000;
							val2.setText(String.valueOf("Tones_Into_KiloGrams = ")+Double.toString(ttokg)+"kg");
					}
					 else if(comboBox_1.getSelectedItem().equals("Tones_Into_Grams")) {
							long ttogr=five*100000;
							val2.setText(String.valueOf("Tones_Into_Grams = ")+Long.toString(ttogr)+"grams");
					}
					 else if(comboBox_1.getSelectedItem().equals("Grams_Into_Tones")) {
							double grtot=three/100000;
							val2.setText(String.valueOf("Grams_Into_Tones = ")+Double.toString(grtot)+"Tones");
					}
					 else if(comboBox_1.getSelectedItem().equals("Tones_Into_Pounds")) {
							double ttop=three/2205;
							val2.setText(String.valueOf("Tones_Into_Pounds = ")+Double.toString(ttop)+"Pounds");
					}
					 else if(comboBox_1.getSelectedItem().equals("Pounds_Into_Tones")) {
							int ptot=two*2205;
							val2.setText(String.valueOf("Pounds_Into_Tones = ")+Integer.toString(ptot)+"Tones");
					}
				}
				if(actionRecieved.getText().equals("Temprature")) {
					if(comboBox_1.getSelectedItem().equals("Celsius_Into_Fahrenhiet")) {
						double ctof=(three*9/5)+32;
						val2.setText(String.valueOf("Celsius_Into_Fahrenhiet = ")+Double.toString(ctof)+"°F");
					}
					else if(comboBox_1.getSelectedItem().equals("Fahrenhiet_Into_Celsius")) {
						double ftoc=(three-32)*5/9;
						val2.setText(String.valueOf("Fahrenhiet_Into_Celsius = ")+Double.toString(ftoc)+"°C");
					}
					else if(comboBox_1.getSelectedItem().equals("Kelvin_Into_Fahrenhiet")) {
						double ktof=(three - 273.15) * 9/5 + 32;
						val2.setText(String.valueOf("Kelvin_Into_Fahrenhiet = ")+Double.toString(ktof)+"°F");
					}
					else if(comboBox_1.getSelectedItem().equals("Fahrenhiet_Into_Kelvin")) {
						double ftok=(three - 32) * 5/9 + 273.15;
						val2.setText(String.valueOf("Fahrenhiet_Into_Kelvin = ")+Double.toString(ftok)+"K");
					}
					else if(comboBox_1.getSelectedItem().equals("Celsius_Into_Kelvin")) {
						double ctok=three + 273.15;
						val2.setText(String.valueOf("Celsius_Into_Kelvin = ")+Double.toString(ctok)+"K");
					}
					else if(comboBox_1.getSelectedItem().equals("Kelvin_Into_Celsius")) {
						double ctok=three - 273.15;
						val2.setText(String.valueOf("Fahrenhiet_Into_Kelvin = ")+Double.toString(ctok)+"°C");
					}
				}
				if(actionRecieved.getText().equals("Area")) {
				 if(comboBox_1.getSelectedItem().equals("Meter_Into_Foot")) {
					 double mtof=three * 10.764;
						val2.setText(String.valueOf("Meter_Into_Foot = ")+Double.toString(mtof)+"foot");
					}
				 else if(comboBox_1.getSelectedItem().equals("Foot_Into_Meter")) {
					 double ftom=three / 10.764;
						val2.setText(String.valueOf("Foot_Into_Meter = ")+Double.toString(ftom)+"mt");
					}
				 else if(comboBox_1.getSelectedItem().equals("Acres_Into_Meter")) {
					 double atom=three * 4047;
						val2.setText(String.valueOf("Acres_Into_Meter = ")+Double.toString(atom)+"mt");
					}
				 else if(comboBox_1.getSelectedItem().equals("Meter_Into_Acres")) {
					 double mtoa=three / 4047;
						val2.setText(String.valueOf("Meter_Into_Acres = ")+Double.toString(mtoa)+"acres");
					}
				 else if(comboBox_1.getSelectedItem().equals("Acres_Into_Foot")) {
					 double atof=three * 43560;
						val2.setText(String.valueOf("Acres_Into_Foot = ")+Double.toString(atof)+"foot");
					}
				 else if(comboBox_1.getSelectedItem().equals("Feet_Into_Acres")) {
					 double atof=three / 43560;
						val2.setText(String.valueOf("Foot_Into_Acres = ")+Double.toString(atof)+"acres");
					}
				 else if(comboBox_1.getSelectedItem().equals("KiloMeter_Into_Acres")) {
					 double ktoa=three * 247;
						val2.setText(String.valueOf("sq KiloMeter_Into_Acres = ")+Double.toString(ktoa)+"acres");
					}
				 else if(comboBox_1.getSelectedItem().equals("Acres_Into_KiloMeter")) {
					 double atok=three / 247;
						val2.setText(String.valueOf("Acres_Into_Sq KiloMeter = ")+Double.toString(atok)+"sqkm");
					}
				 else if(comboBox_1.getSelectedItem().equals("Square mile_Into_Acres")) {
					 double smtoa=three * 247;
						val2.setText(String.valueOf("Square mile_Into_Acres = ")+Double.toString(smtoa)+"acres");
					}
				 else if(comboBox_1.getSelectedItem().equals("Acres_Into_Square mile")) {
					 double smtoa=three / 247;
						val2.setText(String.valueOf("Acres_Into_Square mile = ")+Double.toString(smtoa)+"sq mile");
					}
				 else if(comboBox_1.getSelectedItem().equals("Square mile_Into_Yards")) {
					 double smtoy=three * 3.098000000;
						val2.setText(String.valueOf("Square mile_Into_Yards = ")+Double.toString(smtoy)+"yds");
					}
				 else if(comboBox_1.getSelectedItem().equals("Yards_Into_Square mile")) {
					 double smtoy=three / 3.098000000;
						val2.setText(String.valueOf("Yards_Into_Square mile = ")+Double.toString(smtoy)+"sq mile");
					}
				 else if(comboBox_1.getSelectedItem().equals("Yards_Into_Meter")) {
					 double ytom=three / 1.196;
						val2.setText(String.valueOf("Yards_Into_Meter = ")+Double.toString(ytom)+"mt");
					}
				 else if(comboBox_1.getSelectedItem().equals("Meter_Into_Yards")) {
					 double ytom=three * 1.196;
						val2.setText(String.valueOf("Meter_Into_Yards = ")+Double.toString(ytom)+"yds");
					}
					
				}
				if(actionRecieved.getText().equals("Speed")) {
					  if(comboBox_1.getSelectedItem().equals("kmph_Into_mph")) {
						  double kmphtomph=three / 1.609;
							val2.setText(String.valueOf("kmph_Into_mph = ")+Double.toString(kmphtomph)+"mph");
					  }
					  else if(comboBox_1.getSelectedItem().equals("mph_Into_kmph")) {
						  double mphtokmph=three * 1.609;
							val2.setText(String.valueOf("mph_Into_kmph = ")+Double.toString(mphtokmph)+"kmph");
					  }
					  else if(comboBox_1.getSelectedItem().equals("mps_Into_kmph")) {
						  double mpstokmph=three * 3.6;
							val2.setText(String.valueOf("mph_Into_kmph = ")+Double.toString(mpstokmph)+"kmph");
					  }
					  else if(comboBox_1.getSelectedItem().equals("kmph_Into_mps")) {
						  double kmphtomps=three / 3.6;
							val2.setText(String.valueOf("kmph_Into_mps = ")+Double.toString(kmphtomps)+"kmph");
					  }
					  else if(comboBox_1.getSelectedItem().equals("mps_Into_mph")) {
						  double mpstomph=three / 2.237;
							val2.setText(String.valueOf("mps_Into_mph = ")+Double.toString(mpstomph)+"mph");
					  }
					  else if(comboBox_1.getSelectedItem().equals("mps_Into_mph")) {
						  double mphtomps=three * 2.237;
							val2.setText(String.valueOf("mph_Into_mps = ")+Double.toString(mphtomps)+"mps");
					  }
					  }

				if(actionRecieved.getText().equals("Power")) {
					 if(comboBox_1.getSelectedItem().equals("Watts_Into_KiloWatts")) {
						  double wtokv=three / 1000;
							val2.setText(String.valueOf("Watts_Into_KiloWatts = ")+Double.toString(wtokv)+"kv");
					  }
					 else if(comboBox_1.getSelectedItem().equals("KiloWatts_Into_Watts")) {
						  double kvtow=three * 1000;
							val2.setText(String.valueOf("KiloWatts_Into_Watts = ")+Double.toString(kvtow)+"w");
					  }
					 else if(comboBox_1.getSelectedItem().equals("Horsepower_Into_Watts")) {
						  double hptow=three * 746;
							val2.setText(String.valueOf("Horsepower_Into_Watts = ")+Double.toString(hptow)+"Watt");
					  }
					 else if(comboBox_1.getSelectedItem().equals("Watts_Into_Horsepower")) {
						  double wtohp=three / 746;
							val2.setText(String.valueOf("Watts_Into_Horsepower = ")+Double.toString(wtohp)+"hp");
					  }
					 else if(comboBox_1.getSelectedItem().equals("KiloWatts_Into_Joule")) {
						  double kwtoj=three / 3.6000000;
							val2.setText(String.valueOf("KiloWatts_Into_Joule = ")+Double.toString(kwtoj)+"joules");
					  }
					 else if(comboBox_1.getSelectedItem().equals("Joule_Into_KiloWatts")) {
						  double jtokw=three * 3.6000000;
							val2.setText(String.valueOf("Joule_Into_KiloWatts = ")+Double.toString(jtokw)+"kw");
					  }
					 else if(comboBox_1.getSelectedItem().equals("Watts_Into_Joule")) {
						  double wtoj=three * 3600;
							val2.setText(String.valueOf("Watts_Into_Joule = ")+Double.toString(wtoj)+"joule");
					  }
					 else if(comboBox_1.getSelectedItem().equals("Joule_Into_Watts")) {
						  double jtow=three * 3600;
							val2.setText(String.valueOf("Joule_Into_Watts = ")+Double.toString(jtow)+"Watt");
					  }
					 else if(comboBox_1.getSelectedItem().equals("Electron volt_Into_Joule")) {
						  double evtoj=three * 6.242000000000000000000;
							val2.setText(String.valueOf("Electron volt_Into_Joule = ")+Double.toString(evtoj)+"Joule");
					  }
					 else if(comboBox_1.getSelectedItem().equals("Joule_Into_Electron volt")) {
						  double jtoev=three / 6.242000000000000000000;
							val2.setText(String.valueOf("Joule_Into_Electron volt = ")+Double.toString(jtoev)+"ev");
					  }
					 else if(comboBox_1.getSelectedItem().equals("Electron volt_Into_Watts")) {
						  double evtow=three / 9.223000000000000000000;
							val2.setText(String.valueOf("Electron volt_Into_Watts = ")+Double.toString(evtow)+"Watt");
					  }
					 else if(comboBox_1.getSelectedItem().equals("Watts_Into_Electron volt")) {
						  double evtow=three * 9.223000000000000000000;
							val2.setText(String.valueOf("Watts_Into_Electron volt = ")+Double.toString(evtow)+"ev");
					  }
					 else if(comboBox_1.getSelectedItem().equals("Electron volt_Into_KiloWatts")) {
						  double evtokw=three / 9.223000000000000000000;
							val2.setText(String.valueOf("Electron volt_Into_KiloWatts = ")+Double.toString(evtokw)+"kv");
					  }
					 else if(comboBox_1.getSelectedItem().equals("KiloWatts_Into_Electron volt")) {
						  double kvtoev=three * 9.223000000000000000000;
							val2.setText(String.valueOf("Watts_Into_Electron volt = ")+Double.toString(kvtoev)+"ev");
					  }
					 else if(comboBox_1.getSelectedItem().equals("KiloWatts_Into_Electron volt")) {
						  double kvtoev=three * 9.223000000000000000000;
							val2.setText(String.valueOf("Watts_Into_Electron volt = ")+Double.toString(kvtoev)+"ev");
					  }
				}
				if(actionRecieved.getText().equals("Pressure")) {
					  if(comboBox_1.getSelectedItem().equals("Atmosphere_Into_Psi")) {
						  double atopsi=three * 14.696;
							val2.setText(String.valueOf("Atmosphere_Into_Psi = ")+Double.toString(atopsi)+"psi");
					  }
					  else if(comboBox_1.getSelectedItem().equals("Psi_Into_Atmosphere")) {
						  double atopsi=three / 14.696;
							val2.setText(String.valueOf("Psi_Into_Atmosphere = ")+Double.toString(atopsi)+"atmp");
					  }
					  else if(comboBox_1.getSelectedItem().equals("Atmosphere_Into_torr")) {
						  double atot=three * 760;
							val2.setText(String.valueOf("Atmosphere_Into_torr = ")+Double.toString(atot)+"torr");
					  }
					  else if(comboBox_1.getSelectedItem().equals("torr_Into_Atmosphere")) {
						  double atot=three / 760;
							val2.setText(String.valueOf("torr_Into_Atmosphere = ")+Double.toString(atot)+"atm");
					  }
					  else if(comboBox_1.getSelectedItem().equals("Pascals_Into_Atmosphere")) {
						  double ptoa=three / 101325;
							val2.setText(String.valueOf("Pascals_Into_Atmosphere = ")+Double.toString(ptoa)+"atm");
					  }
					  else if(comboBox_1.getSelectedItem().equals("Atmosphere_Into_Pascals")) {
						  double ptoa=three * 101325;
							val2.setText(String.valueOf("Atmosphere_Into_Pascals = ")+Double.toString(ptoa)+"pcls");
					  }
					  else if(comboBox_1.getSelectedItem().equals("torr_Into_Pascal")) {
						  double ttop=three * 133;
							val2.setText(String.valueOf("torr_Into_Pascal = ")+Double.toString(ttop)+"pcls");
					  }
					  else if(comboBox_1.getSelectedItem().equals("Pascal_Into_torr")) {
						  double ttop=three / 133;
							val2.setText(String.valueOf("Pascal_Into_torr = ")+Double.toString(ttop)+"torr");
					  }
					  else if(comboBox_1.getSelectedItem().equals("Pascal_Into_Psi")) {
						  double ttop=three / 6895;
							val2.setText(String.valueOf("Pascal_Into_Psi = ")+Double.toString(ttop)+"psi");
					  }
					  else if(comboBox_1.getSelectedItem().equals("Psi_Into_Pascal")) {
						  double ttop=three * 6895;
							val2.setText(String.valueOf("Psi_Into_Pascal = ")+Double.toString(ttop)+"pscls");
					  }
				}
				  //continue from here
				
			}
		});
		btnNewButton_14.setBounds(164, 309, 68, 30);
		frame.getContentPane().add(btnNewButton_14);
		
		
		actionRecieved = new JLabel("");
		actionRecieved.setForeground(SystemColor.control);
		actionRecieved.setBounds(10, 360, 37, 20);
		actionRecieved.setVisible(false);
		frame.getContentPane().add(actionRecieved);
		
	}
	private JComboBox comboBox_1;
	private 	JLabel actionRecieved;
}
