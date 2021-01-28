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

public class MadLib extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
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
		
		textField = new JTextField();
		textField.setBounds(163, 57, 100, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 105, 100, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(380, 105, 130, 26);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(380, 57, 130, 26);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnViewMadLib = new JButton("Press Here to View MadLib");
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
		
		
		// TODO Auto-generated method stub

	}
}
