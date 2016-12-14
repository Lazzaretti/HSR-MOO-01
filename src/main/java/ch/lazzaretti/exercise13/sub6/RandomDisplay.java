package ch.lazzaretti.exercise13.sub6;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class RandomDisplay {
	private final int WIDTH = 1200;
	private final int HEIGHT = 1000;
	private final int FREQUENCY = 50;
	private final JLabel imageLabel;
	private final Random random = new Random();
	private BufferedImage image;
	
	private RandomDisplay() {
		createRandomImage();
		JFrame frame = new JFrame("Viewer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imageLabel = new JLabel(new ImageIcon(image));
		frame.getContentPane().add(imageLabel, BorderLayout.CENTER);
		SwingUtilities.invokeLater(() -> {
			frame.pack();
			frame.setVisible(true);
			new Timer(FREQUENCY, event -> {
				createRandomImage();
				updateImage();
			}).start();
		});
	}
	
	private void updateImage() {
		imageLabel.setIcon(new ImageIcon(image));
	}
	
	private void createRandomImage() {
		BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		int pattern = random.nextInt(3); 
		for (int x = 0; x < WIDTH; x++) {
			for (int y = 0; y < HEIGHT; y++) {
				image.setRGB(x, y, getRandomPixel(pattern));
			}
		}
		this.image = image;
	}
	
	private int getRandomPixel(int pattern) {
		int red = pattern == 0 ? random.nextInt(255) : 0;
		int green = pattern == 1 ? random.nextInt(255) : 0;
		int blue = pattern == 2 ? random.nextInt(255) : 0;
		return blue << 16 | green << 8 | red;
	}
	
	public static void main(String[] args) {
		new RandomDisplay();
	}
}
