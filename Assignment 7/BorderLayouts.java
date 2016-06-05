import java.awt.*;
import javax.swing.*;

public class BorderLayouts extends JFrame {
	public void BLayout() {
		JFrame frame = new JFrame("Border Layout");
		frame.setBounds(30, 30, 250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout border = new BorderLayout();
		Container ctr = frame.getContentPane();
		ctr.setLayout(border);
		JButton button;
		ctr.add(button = new JButton("Button1"), BorderLayout.EAST);
		ctr.add(button = new JButton("Button2"), BorderLayout.WEST);
		ctr.add(button = new JButton("Button3"), BorderLayout.NORTH);
		ctr.add(button = new JButton("Button4"), BorderLayout.SOUTH);
		ctr.add(button = new JButton("Button5"), BorderLayout.CENTER);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		BorderLayouts borderLayout = new BorderLayouts();
		borderLayout.BLayout();
	}
}