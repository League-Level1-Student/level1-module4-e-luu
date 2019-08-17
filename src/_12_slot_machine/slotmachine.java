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
		f.setPreferredSize(new Dimension(1000, 1000));
		f.setVisible(true);
		p.add(spin);
		spin.addActionListener(this);
		one.setPreferredSize(new Dimension(250, 250));
		two.setPreferredSize(new Dimension(250, 250));
		three.setPreferredSize(new Dimension(250, 250));
		try {
			one = createLabelImage("cherry.jpeg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			two = createLabelImage("lime.jpeg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			three = createLabelImage("orange.jpeg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.add(one);
		p.add(two);
		p.add(three);
		spin.setText("spin");
		f.add(p);
		f.pack();

	}

	public static void main(String[] args) {
		slotmachine slot = new slotmachine();
		slot.makeUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JLabel a = new JLabel();
		JLabel b = new JLabel();
		JLabel c = new JLabel();
			System.out.println("spin");
			p.remove(one);
			p.remove(two);
			p.remove(three);
			int rand = r.nextInt(3);
			System.out.println(rand);
			if (rand == 0) {
				try {
					 a = new JLabel();
					a = createLabelImage("cherry.jpeg");
					p.add(a);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			 if (rand == 1) {
				System.out.println("two");
				try {
					 b = new JLabel();
					b = createLabelImage("lime.jpeg");
					p.add(b);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}
			}  if(rand == 2){
				System.out.println("three");
				try {
					 c = new JLabel();
					c = createLabelImage("orange.jpeg");
					p.add(c);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
			
			if (rand == 0) {
				try {
					 a = new JLabel();
					a = createLabelImage("lime.jpeg");
					p.add(a);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			 if (rand == 1) {
				System.out.println("two");
				try {
					 b = new JLabel();
					b = createLabelImage("orange.jpeg");
					p.add(b);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}
			}  if(rand == 2){
				System.out.println("three");
				try {
					 c = new JLabel();
					c = createLabelImage("cherry.jpeg");
					p.add(c);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
			if (rand == 0) {
				try {
					 a = new JLabel();
					a = createLabelImage("orange.jpeg");
					p.add(a);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			 if (rand == 1) {
				System.out.println("two");
				try {
					 b = new JLabel();
					b = createLabelImage("cherry.jpeg");
					p.add(b);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}
			}  if(rand == 2){
				System.out.println("three");
				try {
					 c = new JLabel();
					c = createLabelImage("lime.jpeg");
					p.add(c);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
			p.add(a);
			p.add(b);
			p.add(c);

		}
	}

