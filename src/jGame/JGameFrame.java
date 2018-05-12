package jGame;

import javax.swing.JFrame;

/**
 *  Frame with usability for a panel with interactions
 *  
 * @author pernyberg
 */
public class JGameFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private final int widthExtension = 20;
	private final int heightExtension = 50;

	public JGameFrame() {
		setSize(widthExtension, heightExtension);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void addPanel(JGamePanel panel) {
		add(panel);

		panel.requestFocus();

		setFrameSize(panel.getPanelWidth(), panel.getPanelHeight());
	}
	
	public void setFrameSize(int width, int height) {
		setSize(width + widthExtension, height + heightExtension);
	}
}
