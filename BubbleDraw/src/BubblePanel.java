import java.util.Random;
import java.awt.Color;
import javax.swing.JPanel;

public class BubblePanel extends JPanel {
	Random rand = new Random();
	private class Bubble {
		private int x;
		private int y;
		private int size;
		private Color color;
		public Bubble(int newX, int newY, int newSize) {
			x = newX;
			y = newY;
			size = newSize;
			color = new Color( rand.nextInt(256)),
					rand.nextInt(256),
					rand.nextInt(256));
		}
	}
}
