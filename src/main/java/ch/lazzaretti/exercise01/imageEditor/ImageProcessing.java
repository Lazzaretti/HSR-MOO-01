package ch.lazzaretti.exercise01.imageEditor;

public class ImageProcessing {
	static int[][] invert(int[][] pixels) {
		for(int y=0;y<pixels.length;y++){
			for(int x=0;x<pixels[y].length;x++){
				pixels[y][x] *= -1;
			}
		}
		return pixels;
	}
	
	static int[][] rotate(int[][] pixels) {
		int[][] rot = new int[pixels[0].length][pixels.length];
		for(int y=0;y<pixels.length;y++){
			for(int x=0;x<pixels[0].length;x++){
				rot[pixels[0].length-1-x][y] = pixels[y][x];
			}
		}
		return rot;
	}
	
	static int[][] mirror(int[][] pixels) {
		int[][] mir = new int[pixels.length][pixels[0].length];
		for(int y=0;y<pixels.length;y++){
			for(int x=0;x<pixels[0].length;x++){
				mir[y][pixels[0].length-1-x] = pixels[y][x];
			}
		}
		return mir;
	}
	
	static int[][] gray(int[][] pixels) {
		//@TODO
		return pixels;
	}
}
