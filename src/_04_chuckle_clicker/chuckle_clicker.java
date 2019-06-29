package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckle_clicker implements ActionListener {
	JButton button = new JButton();
	JButton b = new JButton();
	
	public static void main(String[] args) {
		chuckle_clicker c = new chuckle_clicker();
c.makeButtons();
	}

	 void makeButtons() {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
frame.setVisible(true);
frame.add(panel);
panel.add(button);
panel.add(b);
b.setText("joke");
button.setText("punchline");
b.addActionListener(this);
button.addActionListener(this);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b) {
			JOptionPane.showMessageDialog(null, "Where do fresh water fish deposit money? The riverbank");
		}
		if(e.getSource() == button) {
			JOptionPane.showMessageDialog(null, "A man enters a pun contest in his local newspaper. He sends in ten puns, hoping at least one of them would win, but unfortunately, no pun in ten did.");
		}
			
		}
	}

