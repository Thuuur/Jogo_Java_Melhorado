package jogoMago;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Desenho extends JPanel{
	private static final long serialVersionUID = 1L;
	private Graphics graficos = null;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.graficos=g;
		g.setColor(new Color(110,110,110)); 
	    g.fillRect(10, 20, 400, 50);
	    Toolkit.getDefaultToolkit().sync();
	}
	
	public Graphics getGraficos(){
		return graficos;
	}

}
