
public class InsertionSort {
	public static void main(String args[]) {
		int intArr[] = new int[4];
		InsertionSort is = new InsertionSort();
		
		RandomNumberArray rna = new RandomNumberArray(intArr.length);
		intArr = rna.getInitializedArray();
		
		is.printArray(intArr);
		intArr = is.doInsertionSort(intArr);
		
		System.out.println("---------");
		is.printArray(intArr);
	}
	
	private int[] doInsertionSort(int intArr[]) {
		
		for(int i=0; i<intArr.length;i++) {
			for(int j=i+1;j < intArr.length;j++) {
				System.out.println("Checking " + intArr[j] + " and " + intArr[i]);
				if(intArr[j] < intArr[i]) {
					System.out.println("Swapping " + intArr[j] + " and " + intArr[i]);
					intArr[i] = intArr[i] + intArr[j];
					intArr[j] = intArr[i] - intArr[j];
					intArr[i] = intArr[i] - intArr[j];
				}
			}
		}

		return intArr;
	}
	
	private void printArray(int intArr[]) {
		for (int i=0; i < intArr.length;i++) {
			System.out.println(intArr[i]);
		}
	}

}
