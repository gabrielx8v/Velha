package jogo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Panel extends JPanel implements MouseListener{
	private int[][] controle = {{-1,-1,-1},
								{-1,-1,-1},
								{-1,-1,-1}};
	
	private float pessoa = 0;
	
	public Panel() {
		super();
		addMouseListener(this);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.WHITE);
		g.drawLine(0, 200, 600, 200);
		g.drawLine(0, 400, 600, 400);
		g.drawLine(200, 0, 200, 600);
		g.drawLine(400, 0, 400, 600);
	}
	
		
	@Override
	public void mouseClicked(MouseEvent e) {
		Graphics g = getGraphics();
		int x = 0;
		int y = 0;
		
		boolean venceu = false;
		
		
		if(this.pessoa < 2) {
			int ym = 0;
			int xm = 0;
			
			if(e.getY()<200) {
				y = 0;
			}else if(e.getY()<400) {
				ym = 1;
				y = 200;
			} else if(e.getY()<600) {
				ym = 2;
				y = 400;
			}
			
			if(e.getX()<200) {
				x = 0;
			}else if(e.getX()<400) {
				x = 200;
				xm = 1;
			} else if(e.getX()<600) {
				x = 400;
				xm = 2;
			}
			
			if (controle[xm][ym] == -1) {
				int[] pontosx = {x+0,x+40,x+ 200,x+ 160};
				int[] pontosy = {y+0,y+ 0,y+ 200,y+ 200};
				int[] pontosx1 = {x+0,x+40,x+ 200,x+ 160};
				int[] pontosy1 = {y+200, y+200, y+0,y+0};
				g.fillPolygon(pontosx, pontosy, 4);
				g.fillPolygon(pontosx1, pontosy1, 4);
				controle[xm][ym] = 1;
				this.pessoa += 4;
			}
			
			
		}
		
		if(this.pessoa > 2 ) {
			
			int ym = 0;
			int xm = 0;
			
			if(e.getY()<200) {
				y = 0;
			}else if(e.getY()<400) {
				y = 200;
				ym = 1;
			} else if(e.getY()<600) {
				y = 400;
				ym = 2;
			}
			
			if(e.getX()<200) {
				x = 0;
			}else if(e.getX()<400) {
				x = 200;
				xm = 1;
			} else if(e.getX()<600) {
				x = 400;
				xm = 2;
			}
			
			
			if(controle[xm][ym] == -1) {
				g.fillOval(x, y, 200, 200);
				g.setColor(Color.WHITE);
				g.fillOval(x+50, y+50, 100, 100);
				
				this.pessoa -= 4;
				controle[xm][ym] = 0;
			}
			
		}
		
		
		if (controle[0][0] == 1 && controle[0][1] == 1 && controle[0][2] == 1) {
			JOptionPane.showMessageDialog(null, "jogador X venceu!");
			venceu = true;
		}else if (controle[1][0] == 1 && controle[1][1] == 1 && controle[1][2] == 1) {
			venceu = true;
			JOptionPane.showMessageDialog(null, "jogador X venceu!");
		}else if (controle[2][0] == 1 && controle[2][1] == 1 && controle[2][2] == 1) {
			JOptionPane.showMessageDialog(null, "jogador X venceu!");
			venceu = true;
		}else if (controle[0][0] == 1 && controle[1][0] == 1 && controle[2][0] == 1) {
			JOptionPane.showMessageDialog(null, "jogador X venceu!");
			venceu = true;
		}else if (controle[0][1] == 1 && controle[1][1] == 1 && controle[2][1] == 1) {
			JOptionPane.showMessageDialog(null, "jogador X venceu!");
			venceu = true;
		}else if (controle[0][2] == 1 && controle[1][2] == 1 && controle[2][2] == 1) {
			JOptionPane.showMessageDialog(null, "jogador X venceu!");
			venceu = true;
		}else if (controle[0][0] == 1 && controle[1][1] == 1 && controle[2][2] == 1) {
			JOptionPane.showMessageDialog(null, "jogador X venceu!");
			venceu = true;
		}else if (controle[0][2] == 1 && controle[1][1] == 1 && controle[2][0] == 1) {
			JOptionPane.showMessageDialog(null, "jogador X venceu!");
			venceu = true;
		}else if (controle[0][0] == 0 && controle[0][1] == 0 && controle[0][2] == 0) {
			JOptionPane.showMessageDialog(null, "jogador Bolinha venceu!");
			venceu = true;
		}else if (controle[1][0] == 0 && controle[1][1] == 0 && controle[1][2] == 0) {
			JOptionPane.showMessageDialog(null, "jogador Bolinha venceu!");
			venceu = true;
		}else if (controle[2][0] == 0 && controle[2][1] == 0 && controle[2][2] == 0) {
			JOptionPane.showMessageDialog(null, "jogador Bolinha venceu!");
			venceu = true;
		}else if (controle[0][0] == 0 && controle[1][0] == 0 && controle[2][0] == 0) {
			JOptionPane.showMessageDialog(null, "jogador Bolinha venceu!");
			venceu = true;
		}else if (controle[0][1] == 0 && controle[1][1] == 0 && controle[2][1] == 0) {
			JOptionPane.showMessageDialog(null, "jogador Bolinha venceu!");
			venceu = true;
		}else if (controle[0][2] == 0 && controle[1][2] == 0 && controle[2][2] == 0) {
			JOptionPane.showMessageDialog(null, "jogador Bolinha venceu!");
			venceu = true;
		}else if (controle[0][0] == 0 && controle[1][1] == 0 && controle[2][2] == 0) {
			JOptionPane.showMessageDialog(null, "jogador Bolinha venceu!");
			venceu = true;
		}else if (controle[0][2] == 0 && controle[1][1] == 0 && controle[2][0] == 0) {
			JOptionPane.showMessageDialog(null, "jogador Bolinha venceu!");
			venceu = true;
		}
		boolean terminou = true;
		for (int i = 0; i < controle.length; i++) {
			for (int j = 0; j < controle.length; j++) {
				int c = controle[i][j];
				if(c == -1) {
					terminou = false;
				}
			}
		}
		if(venceu == false && terminou) {
			JOptionPane.showMessageDialog(null, "Deu velha!");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
	public void verfiicarVitoria() {
		
		
	}
}
