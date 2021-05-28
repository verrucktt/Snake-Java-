import java.awt.*;
import javax.swing.*;
public class StartScreen {
	public StartScreen() {
		JFrame frame = new JFrame(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.getContentPane().setBackground(Color.BLACK);
		
		JPanel homePanel = new JPanel();
		homePanel.setLayout(new BoxLayout(homePanel, BoxLayout.PAGE_AXIS)); // changes layout to box layout
		homePanel.setBackground(Color.BLACK);
		
		// creates image
		ImageIcon image = new ImageIcon("SnakeImage.jpg");
		JLabel label = new JLabel(image);
		
		// text with instructions
		JLabel instructions = new JLabel();
		instructions.setText("Use arrow keys to maneuver the snake");
		instructions.setFont(new Font("MV Boli", Font.PLAIN, 60));
		
		// Creates start button
		JButton startButton = new JButton("Start");
		startButton.setBackground(new Color(64,158,0));	
		startButton.setFont(new Font("MV Boli", Font.PLAIN,50));
		startButton.setFocusable(false);		
		
		// adds startButton then centers it to x-axis
		homePanel.add(startButton);	// adds start button to panel
		startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		// adds instructions then centers it to x-axis
		homePanel.add(instructions);
		instructions.setAlignmentX(Component.CENTER_ALIGNMENT);

		frame.add(label, BorderLayout.NORTH); // adds image to top of frame
		frame.add(homePanel); // adds panel to frame
	
		frame.setVisible(true);
		
	}
}
