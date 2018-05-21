
public class Image {
	public int[][] array = new int[10][10];
	private int classification;

	public Image(int[][] array, int classification) {
		this.classification = classification;
		this.array = array;
	}

	public int getClassification() {
		return classification;
	}

	public int[][] getImageArray() {
		return array;
	}
}