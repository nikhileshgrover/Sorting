public class BubbleSort {
	public static void main(String args[]) {
		int[] intArr = new int[4];
		BubbleSort bs = new BubbleSort();
		
		//intArr = bs.getInitializedArray(intArr.length);
		
		RandomNumberArray rna = new RandomNumberArray(intArr.length);
		intArr = rna.getInitializedArray();
				
		bs.printArray(intArr);
		
		intArr = bs.doBubbleSort(intArr);

		System.out.println("---------");
		bs.printArray(intArr);
	}
	
	private void printArray(int intArr[]) {
		for (int i=0; i < intArr.length;i++) {
			System.out.println(intArr[i]);
		}
	}
	
	private int[] doBubbleSort(int intArr[]) {
		/*
		 * 8,2,1,6
		 * 2,8,1,6
		 * 2,1,8,6
		 * 1,2,8,6
		 * 1,2,6,8
		 */
		
		for(int i=0; i < intArr.length; i++) {
			for(int j=1; j < (intArr.length-i); j++) {
				//System.out.println(i + " - " + j);
				if(intArr[j-1] > intArr[j]) {
					/*
					 * i 20
					 * j 10
					 */
					
					intArr[j-1] = intArr[j-1] + intArr[j];//i 30, j 10
					intArr[j] = intArr[j-1] - intArr[j];  //i 30  j 20
					intArr[j-1] = intArr[j-1] - intArr[j];	//i	10	j 20
					//System.out.println(intArr[i] + " : " + intArr[i + 1]);
				}
			}
		}
		return intArr;
	}
	/*
	private int[] getInitializedArray(int n) {
		Random rand = new Random();
		int intArr[] = new int[n];
		//Initialize array
		for (int i=0; i < n;i++) {
			intArr[i]  = rand.nextInt((100 - 0) + 0) + 1;
		}
		return intArr;
	}
	*/
}