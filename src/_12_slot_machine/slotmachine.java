package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotmachine implements ActionListener {

	Random r = new Random();
	JButton spin = new JButton();
	JPanel p = new JPanel();
	JFrame f = new JFrame();
	JLabel one = new JLabel();
	JLabel two = new JLabel();
	JLabel three = new JLabel();
	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	void makeUI() {
		spin.addActionListener(this);
		f.setPreferredSize(new Dimension(1000, 1000));
		f.add(p);
		f.setVisible(true);
		p.add(spin);
		p.add(one);
		p.add(two);
		p.add(three);
		spin.setText("spin");
		f.pack();

	}

	public static void main(String[] args) {
		slotmachine slot = new slotmachine();
		slot.makeUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == spin) {
			System.out.println("spin");

			for (int i = 0; i < 3; i++) {
				int rand = r.nextInt(3);
				
				if (rand == 1) {
					System.out.println("one");
						try {
							one = createLabelImage("cherry.jpeg");
						} catch (MalformedURLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
				}else if (rand == 2) {
					System.out.println("two");
					try {
						two = createLabelImage("lime.jpeg");
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					System.out.println("three");
					try {
						three = createLabelImage("orange.jpeg");
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				}
			}
		
		}
	}
}
