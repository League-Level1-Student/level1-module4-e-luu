package _09_latest_tweet;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class latestTweet implements ActionListener {
	static JFrame f = new JFrame();
	static JButton b = new JButton();
	static JPanel p = new JPanel();
	static JTextField t = new JTextField();
	String tweet = t.getText();

	public void makeUI() {
		f.add(p);
		p.add(b);
		p.add(t);
		f.setVisible(true);
		b.setText("Search");
		f.setPreferredSize(new Dimension(400,400));
		b.addActionListener(this);
		t.setPreferredSize(new Dimension(100,50));
		f.setTitle("Tweet Retriever");
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("tweet,tweet");
		getLatestTweet(tweet);
		
		}
	private String getLatestTweet(String searchingFor) {

	    Twitter twitter = new TwitterFactory().getInstance();

	    AccessToken accessToken = new AccessToken(
	        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
	    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
	    twitter.setOAuthAccessToken(accessToken);

	Query query = new Query(searchingFor);
	    try {
	        QueryResult result = twitter.search(query);
	        return result.getTweets().get(0).getText();
	    } catch (Exception e) {
	        System.err.print(e.getMessage());
	        return "What the heck is that?";
	    }
	}

	public static void main(String[] args) {
		latestTweet l = new latestTweet();
		l.makeUI();
		
	}
	}

