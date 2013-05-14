package gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class View2 extends JFrame {

	JLabel label1 = new JLabel("Número do Processo G-Procon: ");
	JLabel label2 = new JLabel("Número do Processo Sindec: ");
	JTextField text11 = new JTextField(3);
	JTextField text12 = new JTextField(3);
	JTextField text13 = new JTextField(2);
	JTextField text21 = new JTextField(3);
	JTextField text22 = new JTextField(3);
	JTextField text23 = new JTextField(3);
	JTextField text24 = new JTextField(1);
	JLabel separator1 = new JLabel("\\");
	JLabel separator2 = new JLabel("\\");
	JLabel separator3 = new JLabel(".");
	JLabel separator4 = new JLabel(".");
	JLabel separator5 = new JLabel("-");
	JButton button1 = new JButton("Pesquisar");
	private static final long serialVersionUID = 1L;
	Container panel = this.getContentPane();
	public View2() {
		super("Procurar Processo");
		panel.setLayout(new MigLayout("CENTER"));
		panel.add(label1, "newline");
		panel.add(text11);
		panel.add(separator1);
		panel.add(text12);
		panel.add(separator2);
		panel.add(text13);
		panel.add(label2, "newline");
		panel.add(text21);
		panel.add(separator3);
		panel.add(text22);
		panel.add(separator4);
		panel.add(text23);
		panel.add(separator5);
		panel.add(text24, "wrap 20");
		panel.add(button1);
		button1.setMinimumSize(new Dimension(100, 50));


		this.setSize(400, 180);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		center();
		
		button1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button1ActionPerformed(evt);
			}
		});
		
		
	}
	
	private void button1ActionPerformed(java.awt.event.ActionEvent evt) {
		new View2().setVisible(true);
	}
	
	private void center() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		int screenWidth = screenSize.width - this.getWidth();
		int screenHeight = screenSize.height - this.getHeight();
		setLocation(screenWidth/2, screenHeight/2);
	}

}
