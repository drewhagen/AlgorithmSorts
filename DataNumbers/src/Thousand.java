import java.util.*;


public class Thousand {

	public static int[] tho() {
		int[] tho = new int[1000];
		for (int i=0;i<tho.length;i++) {
			Random randomGenerator = new Random();
			tho[i] = randomGenerator.nextInt(100000);
		}
		//Collections.shuffle(Arrays.asList(tho));
		return tho;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Trial 1
		int[] bubarray = tho();
		System.out.println("Starting Bubble Sort...");
		double startTime = System.nanoTime();
		BubbleSort.bubble(bubarray);
		double endTime = System.nanoTime();
		double bubbleTime = endTime - startTime;
		System.out.println("Finished Bubble Sort. " + bubbleTime);
		
		int[] selarray = tho();
		System.out.println("Starting Selection Sort...");
		startTime = System.nanoTime();
		SelectionSort.selection(selarray);
		endTime = System.nanoTime();
		double selectionTime = endTime - startTime;
		System.out.println("Finished Selection Sort. " + selectionTime);
		
		int[] insarray = tho();
		System.out.println("Starting Insertion Sort...");
		startTime = System.nanoTime();
		InsertionSort.insertion(insarray);
		endTime = System.nanoTime();
		double insertionTime = endTime - startTime;
		System.out.println("Finished Insertion Sort. " + insertionTime);
		
		int[] mergarray = tho();
		System.out.println("Finished Merge Sort...");
		startTime = System.nanoTime();
		MergeSort.merge(mergarray);
		endTime = System.nanoTime();
		double mergeTime = endTime - startTime;
		System.out.println("Finished Merge Sort. " + mergeTime);
		
		int[] heaparray = tho();
		System.out.println("Starting Heap Sort...");
		startTime = System.nanoTime();
		HeapSort.heap(heaparray);
		endTime = System.nanoTime();
		double heapTime = endTime - startTime;
		System.out.println("Finished Heap Sort. " + heapTime);

		Integer[] quickbase = new Integer[1000];
		for (int i=0;i<quickbase.length;i++) {
			quickbase[i] = i+1;
		}
		Collections.shuffle(Arrays.asList(quickbase));
		Collections.shuffle(Arrays.asList(quickbase));
		Collections.shuffle(Arrays.asList(quickbase));
		int[] quickarray = new int[1000];
		for (int i=0; i<quickarray.length; i++) {
			quickarray[i] = quickbase[i]; }
		
		System.out.println("Starting Quick Sort...");
		startTime = System.nanoTime();
		QuickSort.quickSort(quickarray, 0, quickarray.length-1);
		endTime = System.nanoTime();
		double quickTime = endTime - startTime;
		System.out.println("Finished Quick Sort. " + quickTime);
		
		
		
		//Results
		System.out.println("Bubble sort time for 1,000: " + bubbleTime);
		System.out.println("Selection sort time for 1,000: " + selectionTime);
		System.out.println("Insertion sort time for 1,000: " + insertionTime);
		System.out.println("Merge sort time for 1,000: " + mergeTime);
		System.out.println("Heap sort time for 1,000: " + heapTime);
		System.out.println("Quick sort time for 1,000: " + quickTime);
		
		}
		
	
}
