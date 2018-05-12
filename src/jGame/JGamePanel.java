package jGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public abstract class JGamePanel extends JPanel implements KeyListener {
	private static final long serialVersionUID = 1L;

	int width, height;
	
	public JGamePanel(int width, int height) {
		this.width = width;
		this.height = height;
		
		addKeyListener(this);
	}
	
	public int getPanelWidth() {
		return width;
	}
	
	public int getPanelHeight() {
		return height;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.white);
		g.fillRect(0, 0, width, height);
	}
}
