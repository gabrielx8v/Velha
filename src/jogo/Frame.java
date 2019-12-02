package jogo;

import javax.swing.JFrame;

public class Frame {

	public static void main(String[] args) {
		
		Panel p = new Panel();
		
		p.setFocusable(true);
		p.requestFocus();
		
		
		JFrame f = new JFrame();
		f.add(p);
		f.setSize(615,640);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}