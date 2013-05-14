package gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button1 = new JButton("Procurar Processo");
	JButton button2 = new JButton("Cadastrar Processo");
/*	JLabel labelArquivosAchados = new JLabel("Arquivos Achados: " + 0);
	JLabel labelArquivosProcessados = new JLabel("Arquivos Processados: " + 0);
	JLabel tempoGasto = new JLabel("Tempo Gasto: " + 0);*/

	Container panel = this.getContentPane();

	public View() {
		super("Arquivo PROCON");
		//MigLayout layout = new MigLayout();
		button1.setSize(200, 50);
		button2.setSize(200, 50);
		panel.setLayout(new MigLayout("CENTER"));
		panel.add(button1);
		panel.add(button2, "wrap");
/*		panel.add(labelArquivosAchados, "wrap");
		panel.add(labelArquivosProcessados, "wrap");
		panel.add(tempoGasto, "wrap");*/
		this.setSize(640, 420);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		center();


		button1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button1ActionPerformed(evt);
			}
		});
		button2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				button2ActionPerformed(evt);
			}
		});	
	}
	
	private void center() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		int screenWidth = screenSize.width - this.getWidth();
		int screenHeight = screenSize.height - this.getHeight();
		setLocation(screenWidth/2, screenHeight/2);
	}
	
	private void button1ActionPerformed(java.awt.event.ActionEvent evt) {
		new View2().setVisible(true);
	}

	private void button2ActionPerformed(java.awt.event.ActionEvent evt) {
	
	}
	
	public static void main(String[] args) {
		new View();
	}
}
