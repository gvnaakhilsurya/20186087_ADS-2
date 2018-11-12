
import java.awt.Color;
public class SeamCarver {
	private Picture picture;
	private double [][] energies;

	// create a seam carver object based on the given picture
	public SeamCarver(Picture picture) {
		if (picture == null) {
			throw new IllegalArgumentException("picture is null");
		}
		initSeamCarver(picture);
	}

	private void initSeamCarver(Picture picture) {
		this.picture = new Picture(picture);
		energies = new double[picture.width()][picture.height()];

	}
	private void CalculateEnergies() {
		for (int i= 0;i < picture.height();i++) {
			for (int j = 0;j < picture.width();j++) {
				energies[i][j]=energy(j, i);
			}	
		}
	}
	// current picture
	public Picture picture() {
		return picture;
	}
	// width of current picture
	public int width() {
		return this.picture.width();
	}

	// height of current picture
	public int height() {
		return this.picture.height();
	}
	private double CaluculateDelta(Color c1,Color c2) {
		int r = c1.getRed() - c2.getRed();
		int g = c1.getGreen()-c2.getGreen();
		int b = c1.getBlue()-c2.getBlue();
		return(r * r + g * g + b * b);
	}
	private double CaluculateDeltaX(int x,int y) {
		Color c1 = getPixelColor(x, y - 1);
		Color c2 = getPixelColor(x, y + 1);
		return CaluculateDelta(c1,c2);
	}
	private double CaluculateDeltaY(int x,int y) {
		Color c1 = getPixelColor(x - 1, y);
		Color c2 = getPixelColor(x + 1, y);
		return CaluculateDelta(c1,c2);
	}
	private void valid(int x,int length){
		if (x < 0 || x > length) {
			throw new IllegalArgumentException("IllegalArgumentException");
			}
	}
	private Color getPixelColor(int x,int y){
		valid(x,picture.width()-1);
		valid(y,picture.height()-1);
		return picture.get(x,y);
	}
	// energy of pixel at column x and row y
	public double energy(int x, int y) {
		if (x == 0||y==0|| y == picture.height()-1||
			x == picture.width()-1) {
			return 1000;
		} else {
			System.out.println();
			double deltaX = CaluculateDeltaX(x,y);
			double deltaY = CaluculateDeltaY(x,y);
			return Math.sqrt(deltaX+deltaY);
		}
	}
	// sequence of indices for horizontal seam
	public int[] findHorizontalSeam() {
		return new int[0];
	}

	// sequence of indices for vertical seam
	public int[] findVerticalSeam() {
		return new int[0];
	}

	// remove horizontal seam from current picture
	public void removeHorizontalSeam(int[] seam) {

	}

	// remove vertical seam from current picture
	public void removeVerticalSeam(int[] seam) {

	}
}