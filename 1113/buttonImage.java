package q;

import javax.swing.*;
import java.awt.*;

public class buttonImage extends JFrame {
	public buttonImage() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("images/icon.pig");
		ImageIcon rolloverIcon = new ImageIcon("images/icon.pig");
		ImageIcon pressedIcon = new ImageIcon("images/icon.png");
		
		JButton btn = new JButton("who", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		
		c.add(btn);
		setSize(300, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new buttonImage();
	}
}
