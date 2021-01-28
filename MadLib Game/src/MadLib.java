import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.util.Scanner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MadLib extends JFrame {
	private JTextField textAdjective;
	private JTextField textVerb;
	private JTextField textNoun;
	private JTextField textColor;
	public MadLib() {
		getContentPane().setBackground(Color.GREEN);
		setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("John's MadLib Game");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("John's MadLib Game");
		lblNewLabel.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 450, 45);
		getContentPane().add(lblNewLabel);
		
		JLabel lblAdjective = new JLabel("Enter an adjective:");
		lblAdjective.setBounds(10, 62, 128, 16);
		getContentPane().add(lblAdjective);
		
		JLabel lblColor = new JLabel("Enter a Color:");
		lblColor.setBounds(275, 60, 93, 21);
		getContentPane().add(lblColor);
		
		JLabel lblVerb = new JLabel("Enter a verb end in -ed:");
		lblVerb.setBounds(10, 110, 161, 16);
		getContentPane().add(lblVerb);
		
		JLabel lblNoun = new JLabel("Enter a Noun:");
		lblNoun.setBounds(275, 110, 93, 16);
		getContentPane().add(lblNoun);
		
		textAdjective = new JTextField();
		textAdjective.setBounds(163, 57, 100, 26);
		getContentPane().add(textAdjective);
		textAdjective.setColumns(10);
		
		textVerb = new JTextField();
		textVerb.setBounds(163, 105, 100, 26);
		getContentPane().add(textVerb);
		textVerb.setColumns(10);
		
		textNoun = new JTextField();
		textNoun.setBounds(380, 105, 130, 26);
		getContentPane().add(textNoun);
		textNoun.setColumns(10);
		
		textColor = new JTextField();
		textColor.setBounds(380, 57, 130, 26);
		getContentPane().add(textColor);
		textColor.setColumns(10);
		
		JButton btnViewMadLib = new JButton("Press Here to View MadLib");
		btnViewMadLib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String adjective = txtAdjective.getText();
				String color = txtColor.getText();
				String verb = txtVerb.getText();
				String noun = txt.Noun.getText();
				txtOutput.setText(" The " + color + " dragon " + verb + " at the " + adjective + " " + noun + ".\n" +
				"And everyone lived happily ever after. \n" + "The end.");
			}
		});
		btnViewMadLib.setBounds(163, 156, 223, 29);
		getContentPane().add(btnViewMadLib);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 192, 500, 138);
		getContentPane().add(textArea);
	}

public class MadLibs {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a color: ");
		String color = scan.nextLine();
		System.out.println("Enter a past tense verb: ");
		String pastTenseVerb = scan.nextLine();
		System.out.println("Enter and adjective: ");
		String adjective = scan.nextLine();
		System.out.println("Enter a noun: ");
		String noun = scan.nextLine();
		
		System.out.print ( "The " + color + " dragon " + pastTenseVerb + " at the " + adjective);
		System.out.println(" knight, who rode in on a sturdy, giant " + noun + ".");
		
	}	
	}

	public static void main(String[] args) {
		
		MadLibGUI theGame = new MadLibGUI();
		
		theGame.setSize(new Dimension(550,300));
		theGame.setVisible(true);
		
		// TODO Auto-generated method stub

	}
}
