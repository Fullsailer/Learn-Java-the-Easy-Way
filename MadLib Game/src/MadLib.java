import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;

public class MadLib extends JFrame {
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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
