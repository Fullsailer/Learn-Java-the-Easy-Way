import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class SecretMessagesGUI extends JFrame implements SwingConstants {
	private JTextArea txtIn;
	private JTextField txtKey;
	public SecretMessagesGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		txtIn = new JTextArea();
		txtIn.setBounds(6, 6, 543, 182);
		getContentPane().add(txtIn);
		
		JTextArea txtOut = new JTextArea();
		txtOut.setBounds(6, 232, 543, 135);
		getContentPane().add(txtOut);
		
		txtKey = new JTextField();
		txtKey.setBounds(259, 194, 66, 26);
		getContentPane().add(txtKey);
		txtKey.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Key:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(227, 200, 32, 16);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Encode/Decode");
		btnNewButton.setBounds(339, 191, 156, 29);
		getContentPane().add(btnNewButton);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
