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
import javax.swing.JOptionPane;
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
		p.removeAll();
		JLabel a = new JLabel();
		JLabel b = new JLabel();
		JLabel c = new JLabel();
			System.out.println("spin");
			p.remove(one);
			p.remove(two);
			p.remove(three);
			int r1 = r.nextInt(3);
			int r2 = r.nextInt(3);
			int r3 = r.nextInt(3);
			System.out.println(r1);
			if (r1 == 0) {
				try {
					a = createLabelImage("cherry.jpeg");
					p.add(a);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			 if (r1 == 1) {
				System.out.println("two");
				try {
					
					a = createLabelImage("lime.jpeg");
					p.add(a);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}
			}  if(r1 == 2){
				System.out.println("three");
				try {
					a = createLabelImage("orange.jpeg");
					p.add(a);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
			
			if (r2== 0) {
				try {
					
					b = createLabelImage("cherry.jpeg");
					p.add(b);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			 if (r2 == 1) {
				System.out.println("two");
				try {
					
					b = createLabelImage("lime.jpeg");
					p.add(b);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}
			}  if(r2 == 2){
				System.out.println("three");
				try {
					
					b = createLabelImage("orange.jpeg");
					p.add(b);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
			if (r3 == 0) {
				try {
					 
					c = createLabelImage("cherry.jpeg");
					p.add(c);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			 if (r3 == 1) {
				System.out.println("two");
				try {
					 c = new JLabel();
					c = createLabelImage("lime.jpeg");
					p.add(c);
					f.pack();
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}
			}  if(r3 == 2){
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
			p.add(a);
			p.add(b);
			p.add(c);
			p.add(spin);
			f.pack();
			if (r1==r2&&r2 == r3) {
				JOptionPane.showMessageDialog(null, "you win!");
			}

		}
	}

