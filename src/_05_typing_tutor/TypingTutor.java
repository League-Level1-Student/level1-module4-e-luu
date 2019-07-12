package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	JFrame f = new JFrame();
	JLabel l = new JLabel();
	char currentLetter;
	static TypingTutor t = new TypingTutor();

	public void current() {
		currentLetter = generateRandomLetter();

		f.setVisible(true);
		f.add(l);
		l.setText(currentLetter + "");
		l.setFont(l.getFont().deriveFont(28.0f));
		l.setHorizontalAlignment(JLabel.CENTER);
		f.addKeyListener(this);
		f.pack();
	}

	static char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	public static void main(String[] args) {

		t.current();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you typed: " + e.getKeyChar());
		if (e.getKeyChar() == currentLetter) {
			System.out.println("correct");
			f.setBackground(Color.GREEN);
			f.pack();
		} else {
			f.setBackground(Color.RED);
			f.pack();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = t.generateRandomLetter();
		l.setText(currentLetter + "");
	}
}
