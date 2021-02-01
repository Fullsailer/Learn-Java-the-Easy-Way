import java.util.Scanner;

public class SecretMessages {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a message to encode or decode:");
		String message = scan.nextLine();
		String output = "";
		for ( int x = message.length()-1; x >= 0; x--) {
			output += message.charAt(x);
		}
		System.out.println(output);

	}

}
