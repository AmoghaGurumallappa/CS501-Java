import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class TicTacTao extends JFrame {
	public TicTacTao() {
		int position = 0;
		setLayout(new GridLayout(3, 3));
		
		ImageIcon cross = new ImageIcon("x.gif");
		ImageIcon circle = new ImageIcon("o.gif");
		for (int i = 0; i < 9; i++) {
			position = (int) (Math.random() * 3.0);
			if (position == 0) {
				add(new JLabel(cross));
			} else if (position == 1) {
				add(new JLabel(circle));
			} else {
				i--;
			}
		}
	}

	public static void main(String[] args) {
		TicTacTao frame = new TicTacTao();
		frame.setTitle("Tic Tac Toe Board");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}