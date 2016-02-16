import java.util.Random;


public class Hundred {

	public static int[] hun() {
		int[] hun = new int[100];
		for (int i=0;i<hun.length;i++) {
			Random randomGenerator = new Random();
			hun[i] = randomGenerator.nextInt(10000);
		}
		//Collections.shuffle(Arrays.asList(hun));
		return hun;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Trial 1
		int[] bubarray = hun();
		System.out.println("Starting Bubble Sort...");
		double startTime = System.nanoTime();
		BubbleSort.bubble(bubarray);
		double endTime = System.nanoTime();
		double bubbleTime = endTime - startTime;
		System.out.println("Finished Bubble Sort. " + bubbleTime);
		
		int[] selarray = hun();
		System.out.println("Starting Selection Sort...");
		startTime = System.nanoTime();
		SelectionSort.selection(selarray);
		endTime = System.nanoTime();
		double selectionTime = endTime - startTime;
		System.out.println("Finished Selection Sort. " + selectionTime);
		
		int[] insarray = hun();
		System.out.println("Starting Insertion Sort...");
		startTime = System.nanoTime();
		InsertionSort.insertion(insarray);
		endTime = System.nanoTime();
		double insertionTime = endTime - startTime;
		System.out.println("Finished Insertion Sort. " + insertionTime);
		
		int[] mergarray = hun();
		System.out.println("Finished Merge Sort...");
		startTime = System.nanoTime();
		MergeSort.merge(mergarray);
		endTime = System.nanoTime();
		double mergeTime = endTime - startTime;
		System.out.println("Finished Merge Sort. " + mergeTime);
		
		int[] heaparray = hun();
		System.out.println("Starting Heap Sort...");
		startTime = System.nanoTime();
		HeapSort.heap(heaparray);
		endTime = System.nanoTime();
		double heapTime = endTime - startTime;
		System.out.println("Finished Heap Sort. " + heapTime);

		int[] quickbase = hun();
		int[] quickarray = new int[100];
		for (int i=0; i<quickarray.length; i++) {
			quickarray[i] = quickbase[i]; }
		
		System.out.println("Starting Quick Sort...");
		startTime = System.nanoTime();
		QuickSort.quickSort(quickarray, 0, quickarray.length-1);
		endTime = System.nanoTime();
		double quickTime = endTime - startTime;
		System.out.println("Finished Quick Sort. " + quickTime);
		
		
		
		//Results
		System.out.println("Bubble sort time for 100: " + bubbleTime);
		System.out.println("Selection sort time for 100: " + selectionTime);
		System.out.println("Insertion sort time for 100: " + insertionTime);
		System.out.println("Merge sort time for 100: " + mergeTime);
		System.out.println("Heap sort time for 100: " + heapTime);
		System.out.println("Quick sort time for 100: " + quickTime);
		
		}
	
}
