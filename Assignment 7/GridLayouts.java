
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayouts extends JFrame {
	public void GLayout() {
		JFrame frame = new JFrame("Grid Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2, 3));
		frame.add(new JButton("Button 1"));
		frame.add(new JButton("Button 2"));
		frame.add(new JButton("Button 3"));
		frame.add(new JButton("Button 4"));
		frame.add(new JButton("Button 5"));
		frame.add(new JButton("Button 6"));
		frame.pack();
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		GridLayouts gridLayout = new GridLayouts();
		gridLayout.GLayout();
	}
}
