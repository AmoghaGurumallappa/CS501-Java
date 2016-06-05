import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayouts extends JFrame {
	public void FLayout() {
		JFrame frame = new JFrame("FlowLayout demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.add(new Button("Button1"));
		frame.add(new Button("Button2"));
		frame.add(new Button("Button3"));
		frame.add(new Button("Button4"));
		frame.add(new Button("Button5"));
		frame.add(new Button("Button6"));
		frame.pack();
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		FlowLayouts flowLayout = new FlowLayouts();
		flowLayout.FLayout();
	}
}
