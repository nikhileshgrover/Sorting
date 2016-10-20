import java.util.Random;

public class RandomNumberArray {
	private int n;
	
	RandomNumberArray(int arrSize) {
		n = arrSize;
	}
	
	public int[] getInitializedArray() {
		int intArr[] = new int[n];
		Random rand = new Random();
		//Initialize array
		for (int i=0; i < n;i++) {
			intArr[i]  = rand.nextInt((100 - 0) + 0) + 1;
		}
		return intArr;
	}	
}
