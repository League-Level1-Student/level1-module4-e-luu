package _11_whack_a_mole;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whackamole implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton mole = new JButton("mole");
	static Random r = new Random();
	int whacks;
	int whacksmole;
	int misses;
	static Date time;
	
	void drawButtons(int random) {
		
		f.add(p);
		f.setVisible(true);
		f.setTitle("Whack a button for fame and glory");
		f.setPreferredSize(new Dimension(300,300));
		mole.addActionListener(this);
		for (int i = 0; i < 24; i++) {
			if (i==random) {
				p.add(mole);
			}else {
				JButton button = new JButton();
				button.addActionListener(this);
				p.add(button);
			}
			
			
		}
		f.pack();		
	}
	
	public static void main(String[] args) {
		 time = new Date();
		new whackamole().drawButtons(r.nextInt(23));
		
	}
	
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if (e.getSource()==mole) {
		f.dispose();
		new whackamole().drawButtons(r.nextInt(23));
		whacks++;
		whacksmole++;
		if (whacks==10) {
			endGame(time,whacksmole);
		}
	}else {
	speak("you missed");
	f.dispose();
	new whackamole().drawButtons(r.nextInt(23));
	whacks++;
	System.out.println("you missed ");
	if (whacks==10) {
		endGame(time,whacksmole);
	}
	}
	}
}
