package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastySurprise implements ActionListener {
	JPanel p = new JPanel();
	JFrame f = new JFrame();
	JButton b = new JButton();
	JButton button = new JButton();
	
public static void main(String[] args) {
nastySurprise surprise = new nastySurprise();
surprise.makeframe();

}

void makeframe(){
	p.add(b);
	p.add(button);
	f.add(p);
	b.setText("trick");
	button.setText("treat");
	f.setVisible(true);
	f.pack();
	b.addActionListener(this);
	button.addActionListener(this);
	
}

private void showPicture(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if (e.getSource().equals(b)) {
	showPicture("https://i.ytimg.com/vi/VRiWE1l8KqI/maxresdefault.jpg");
}
if (e.getSource().equals(button)) {
	showPicture("https://data.whicdn.com/images/253011926/large.jpg");
}
}
}
