package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener {
	static calculator c = new calculator();
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JTextField t = new JTextField();
	JTextField tf = new JTextField();
	JLabel l = new JLabel();
	int one;
	int two;

	public int add(int one, int two) {
		return one + two;
	}

	public int sub(int one, int two) {
		return one - two;
	}

	public int mul(int one, int two) {
		return one * two;
	}

	public int div(int one, int two) {
		return one / two;
	}

	void makegui() {
		p.add(add);
		p.add(sub);
		p.add(mul);
		p.add(div);
		p.add(t);
		p.add(tf);
		p.add(l);
		f.add(p);
		add.setText("add");
		sub.setText("sub");
		mul.setText("mul");
		div.setText("div");
		t.setPreferredSize(new Dimension(100, 50));
		tf.setPreferredSize(new Dimension(100, 50));
		f.setTitle("simple calculator");
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		f.setPreferredSize(new Dimension(500,500));
		f.setVisible(true);
		f.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String num = t.getText();
		String n = tf.getText();
		one = Integer.parseInt(num);
		two = Integer.parseInt(n);
		if (e.getSource() == add) {
			int answer = c.add(one, two);
		l.setText(answer + "");
		}
		if (e.getSource() == sub) {
			int an = c.sub(one, two);
			l.setText(an + "");
		}
		if (e.getSource() == mul) {
			int ans = c.mul(one, two);
			l.setText(ans + "'");
		}
		if (e.getSource() == div) {
			int answ = c.div(one, two);
			l.setText(answ + "");
		
		}
	
	}

}
