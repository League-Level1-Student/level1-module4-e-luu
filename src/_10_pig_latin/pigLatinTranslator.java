package _10_pig_latin;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pigLatinTranslator implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	static JTextField t = new JTextField();
	JTextField tf = new JTextField();
	

	void maketranslator() {
f.add(p);
p.add(b);
p.add(t);
p.add(tf);
f.setVisible(true);
f.setTitle("Pig Latin Translator");
t.setPreferredSize(new Dimension(150,30));
tf.setPreferredSize(new Dimension(150,30));
b.setText("translate");
f.setPreferredSize(new Dimension(400,200));
b.addActionListener(this);
f.pack();
	}
	public static void main(String[] args) {
		pigLatinTranslator pig = new pigLatinTranslator();
		pig.maketranslator();
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		PigLatin p = new PigLatin();
		String words = t.getText();
		p.translate(words);
	}
	
}
