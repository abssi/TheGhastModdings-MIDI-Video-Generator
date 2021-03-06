package theGhastModding.converter.main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class PreviewWindow extends JFrame {
	
	public PreviewWindow(){
		super("Preview");
		this.getContentPane().setPreferredSize(new Dimension(720, 480));
		this.getContentPane().setLayout(null);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setLocationRelativeTo(TGMMIDIConverter.frame);
		this.setResizable(true);
		this.getContentPane().setMinimumSize(new Dimension(720, 480));
		this.getContentPane().setMaximumSize(new Dimension(1920, 1080));
		pack();
		setVisible(true);
	}
	
	public void updatePreview(BufferedImage image){
		Graphics g = this.getContentPane().getGraphics();
		g.drawImage(image, 0, 0, this.getContentPane().getWidth(), this.getContentPane().getHeight(), this);
		g.dispose();
	}
	
}