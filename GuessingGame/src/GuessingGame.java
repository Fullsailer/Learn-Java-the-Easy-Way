import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	private int numberOfTries;
	public void checkGuess() { 
		String guessText = txtGuess.getText();
		String message = "";
		try {
			int guess = Integer.parseInt(guessText);
			numberOfTries++;
			if (guess < theNumber)
				message = guess + " is too low. Try again.";
			else if (guess > theNumber)
				message = guess + " is too high. Try again.";
			else {
				message = guess + 
						" is correct. You win! " + numberOfTries 
						+ " tries! ";
				newGame();
			}
		} catch (Exception e) {
			message = "Enter a whole number between 1 and 100.";
		} finally {
			lblOutput.setText(message);
			txtGuess.requestFocus();
			txtGuess.selectAll();
			}
	}
	public void newGame() {
		theNumber = (int) (Math.random() * 100 + 1);
		numberOfTries = 0;
	}
	public GuessingGame() {
		getContentPane().setBackground(Color.BLUE);
		setFont(new Font("Copperplate", Font.BOLD, 16));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("John's Hi-Lo Guessing Game");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("John's Hi-Lo Guessing Game");
		lblNewLabel.setFont(new Font("Copperplate", Font.PLAIN, 16));
		lblNewLabel.setBounds(0, 0, 450, 29);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Guess a number between 1 and 100:");
		lblNewLabel_1.setFont(new Font("Copperplate", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(6, 65, 339, 76);
		getContentPane().add(lblNewLabel_1);
		
		txtGuess = new JTextField();
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		txtGuess.setHorizontalAlignment(SwingConstants.RIGHT);
		txtGuess.setBounds(342, 82, 85, 40);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(5);
		
		JButton btnGuess = new JButton("Guess!");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnGuess.setFont(new Font("Copperplate", Font.PLAIN, 13));
		btnGuess.setBounds(145, 153, 117, 29);
		getContentPane().add(btnGuess);
		
		lblOutput = new JLabel("Enter a number above and click Guess!");
		lblOutput.setFont(new Font("Copperplate", Font.PLAIN, 16));
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(6, 194, 421, 40);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(450,300));
		theGame.setVisible(true);
		// TODO Auto-generated method stub

	}
}
