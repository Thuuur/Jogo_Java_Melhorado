package jogoMago;

import java.awt.Dimension;

import javax.swing.*;
//import javax.swing.JFrame;

public class Janela extends JFrame{
	//private static final long serialVersionUID = 1L;
	
	Desenho des = new Desenho();
	
	public Janela(int LARGURA, int ALTURA){
		super("A Grande Batalha");
		this.setPreferredSize(new Dimension(LARGURA,ALTURA));
		this.setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(des);                           
		pack();				       	    
		setVisible(true);                
	}
	
}
