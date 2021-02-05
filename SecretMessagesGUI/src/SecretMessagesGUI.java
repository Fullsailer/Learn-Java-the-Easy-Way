import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SecretMessagesGUI extends JFrame implements SwingConstants {
	private JTextArea txtIn;
	private JTextField txtKey;
	private JTextArea txtOut;
	private JSlider slider;
	private JButton btnMoveUp;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	public String encode( String message, int keyVal ) {
		String output = "";
		char key = (char) keyVal;
		for (int x = 0; x < message.length(); x++ ) {
			char input = message.charAt(x);
			if (input >= 'a' && input <= 'z')
			{
				input += key;
				if (input > 'z')
					input -=26;
				if (input < 'a')
					input += 26;
			}
			else if (input >= 'a' && input <= 'z')
            { 
                input += key;
                if (input > 'z')
                    input -= 26;
                if (input < 'a')
                    input += 26;
            }
			else if (input >= '0' && input <= '9')
			{
			
				input += (keyVal % 10);
				if (input > '9')
					input -= 10;
				if (input < '0')
					input += 10;
			}
		
			output += input;
		}
		return output;
	}
	public SecretMessagesGUI() {
		setTitle("John's Secret Message App");
		getContentPane().setBackground(new Color(0, 0, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 543, 182);
		getContentPane().add(scrollPane);
		
		txtIn = new JTextArea();
		scrollPane.setViewportView(txtIn);
		txtIn.setWrapStyleWord(true);
		txtIn.setLineWrap(true);
		txtIn.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 232, 543, 135);
		getContentPane().add(scrollPane_1);
		
		txtOut = new JTextArea();
		scrollPane_1.setViewportView(txtOut);
		txtOut.setWrapStyleWord(true);
		txtOut.setLineWrap(true);
		txtOut.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		
		txtKey = new JTextField();
		txtKey.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int key = Integer.parseInt( txtKey.getText() );
                slider.setValue(key);
			}
		});
		txtKey.setBounds(259, 194, 66, 26);
		getContentPane().add(txtKey);
		txtKey.setColumns(10);
		
		JLabel lblKey = new JLabel("Key:");
		lblKey.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKey.setBounds(227, 200, 32, 16);
		getContentPane().add(lblKey);
		
		JButton btnNewButton = new JButton("Encode/Decode");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String message = txtIn.getText();
				int key = Integer.parseInt( txtKey.getText() );
				String output = encode( message, key );
				txtOut.setText( output );
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null,
							"Please enter a whole number value for the encryption key.");
					txtKey.requestFocus();
					txtKey.selectAll();
				}
			}
		});
		btnNewButton.setBounds(327, 189, 125, 38);
		getContentPane().add(btnNewButton);
		
		slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				txtKey.setText("" + slider.getValue() );
				String message = txtIn.getText();
				int key = slider.getValue();
				String output = encode( message, key );
				txtOut.setText( output );
			}
		});
		slider.setValue(3);
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(13);
		slider.setMinimum(-26);
		slider.setMaximum(26);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setBackground(new Color(0, 0, 255));
		slider.setBounds(25, 194, 190, 29);
		getContentPane().add(slider);
		
		
		btnMoveUp = new JButton("Move Up ^");
        btnMoveUp.setBackground(new Color(135, 206, 235));
        btnMoveUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String temp = txtIn.getText();
                txtIn.setText(txtOut.getText());
                slider.setValue(-slider.getValue());
            }
        });
		btnMoveUp.setBounds(453, 191, 85, 35);
		getContentPane().add(btnMoveUp);
    }
	
	public static void main(String[] args) {
		SecretMessagesGUI theApp = new SecretMessagesGUI();
		theApp.setSize(new java.awt.Dimension(600,400));
		theApp.setVisible(true);
		// TODO Auto-generated method stub

	}
}
