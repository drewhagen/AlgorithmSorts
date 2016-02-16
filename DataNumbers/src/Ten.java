import java.util.*;


public class Ten {

	public static int[] t() {
		int[] t = new int[10];
		for (int i=0;i<t.length;i++) {
			Random randomGenerator = new Random();
			t[i] = randomGenerator.nextInt(1000);
		}
		//Collections.shuffle(Arrays.asList(t));
		return t;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Trial 1
		int bubarray[] = t();
		System.out.println("Starting Bubble Sort...");
		double startTime = System.nanoTime();
		BubbleSort.bubble(bubarray);
		double endTime = System.nanoTime();
		double bubbleTime = endTime - startTime;
		System.out.println("Finished Bubble Sort. " + bubbleTime);
		
		int selarray[] = t();
		System.out.println("Starting Selection Sort...");
		startTime = System.nanoTime();
		SelectionSort.selection(selarray);
		endTime = System.nanoTime();
		double selectionTime = endTime - startTime;
		System.out.println("Finished Selection Sort. " + selectionTime);
		
		int insarray[] = t();
		System.out.println("Starting Insertion Sort...");
		startTime = System.nanoTime();
		InsertionSort.insertion(insarray);
		endTime = System.nanoTime();
		double insertionTime = endTime - startTime;
		System.out.println("Finished Insertion Sort. " + insertionTime);
		
		int mergarray[] = t();
		System.out.println("Finished Merge Sort...");
		startTime = System.nanoTime();
		MergeSort.merge(mergarray);
		endTime = System.nanoTime();
		double mergeTime = endTime - startTime;
		System.out.println("Finished Merge Sort. " + mergeTime);
		
		int heaparray[] = t();
		System.out.println("Starting Heap Sort...");
		startTime = System.nanoTime();
		HeapSort.heap(heaparray);
		endTime = System.nanoTime();
		double heapTime = endTime - startTime;
		System.out.println("Finished Heap Sort. " + heapTime);

		//int quickarray[] = t();
		
		int[] quickbase = t();
		int[] quickarray = new int[10];
		for (int i=0; i<quickarray.length; i++) {
			quickarray[i] = quickbase[i]; }
		
		System.out.println(Arrays.toString(quickarray));
		System.out.println("Starting Quick Sort...");
		startTime = System.nanoTime();
		QuickSort.quickSort(quickarray, 0, quickarray.length-1);
		endTime = System.nanoTime();
		double quickTime = endTime - startTime;
		System.out.println("Finished Quick Sort. " + quickTime);
		
		
		
		//Results
		System.out.println("Bubble sort time for 10: " + bubbleTime);
		System.out.println("Selection sort time for 10: " + selectionTime);
		System.out.println("Insertion sort time for 10: " + insertionTime);
		System.out.println("Merge sort time for 10: " + mergeTime);
		System.out.println("Heap sort time for 10: " + heapTime);
		System.out.println("Quick sort time for 10: " + quickTime);
		
	}
	
/*Trial 2
		
		bubarray = t();
		System.out.println("Starting Second Bubble Sort...");
		startTime = System.nanoTime();
		BubbleSort.bubble(bubarray);
		endTime = System.nanoTime();
		double bubbleTime2 = endTime - startTime;
		System.out.println("Finished Second Bubble Sort. " + bubbleTime2);
		
		selarray = t();
		System.out.println("Starting Second Selection Sort...");
		startTime = System.nanoTime();
		SelectionSort.selection(selarray);
		endTime = System.nanoTime();
		double selectionTime2 = endTime - startTime;
		System.out.println("Finished Second Selection Sort. " + selectionTime2);
		
		insarray = t();
		System.out.println("Starting Second Insertion Sort...");
		startTime = System.nanoTime();
		InsertionSort.insertion(insarray);
		endTime = System.nanoTime();
		double insertionTime2 = endTime - startTime;
		System.out.println("Finished Second Insertion Sort. " + insertionTime2);
		
		mergarray = t();
		System.out.println("Starting Second Merge Sort...");
		startTime = System.nanoTime();
		MergeSort.merge(mergarray);
		endTime = System.nanoTime();
		double mergeTime2 = endTime - startTime;
		System.out.println("Finished Second Merge Sort. " + mergeTime2);
		
		heaparray = t();
		System.out.println("Starting Second Heap Sort...");
		startTime = System.nanoTime();
		HeapSort.heap(heaparray);
		endTime = System.nanoTime();
		double heapTime2 = endTime - startTime;
		System.out.println("Finished Second Heap Sort. " + heapTime2);
		
		quickarray = t();
		System.out.println("Starting Second Quick Sort...");
		startTime = System.nanoTime();
		QuickSort.quickSort(quickarray, 0, 9);
		endTime = System.nanoTime();
		double quickTime2 = endTime - startTime;
		System.out.println("Finished Second Quick Sort. " + quickTime2);
		
		//Trial 3

		bubarray = t();
		System.out.println("Starting Third Bubble Sort...");
		startTime = System.nanoTime();
		BubbleSort.bubble(bubarray);
		endTime = System.nanoTime();
		double bubbleTime3 = endTime - startTime;
		System.out.println("Finished Third Bubble Sort. " + bubbleTime3);
		
		selarray = t();
		System.out.println("Starting Third Selection Sort...");
		startTime = System.nanoTime();
		SelectionSort.selection(selarray);
		endTime = System.nanoTime();
		double selectionTime3 = endTime - startTime;
		System.out.println("Finished Third Selection Sort. " + selectionTime3);
		
		insarray = t();
		System.out.println("Starting Third Insertion Sort...");
		startTime = System.nanoTime();
		InsertionSort.insertion(insarray);
		endTime = System.nanoTime();
		double insertionTime3 = endTime - startTime;
		System.out.println("Finished Third Insertion Sort. " + insertionTime3);
		
		mergarray = t();
		System.out.println("Starting Third Merge Sort...");
		startTime = System.nanoTime();
		MergeSort.merge(mergarray);
		endTime = System.nanoTime();
		double mergeTime3 = endTime - startTime;
		System.out.println("Finished Third Merge Sort. " + mergeTime3);
		
		heaparray = t();
		System.out.println("Starting Third Heap Sort...");
		startTime = System.nanoTime();
		HeapSort.heap(heaparray);
		endTime = System.nanoTime();
		double heapTime3 = endTime - startTime;
		System.out.println("Finished Third Heap Sort. " + heapTime3);
		
		quickarray = t();
		System.out.println("Starting Third Quick Sort...");
		startTime = System.nanoTime();
		QuickSort.quick(quickarray, 0, 9);
		endTime = System.nanoTime();
		double quickTime3 = endTime - startTime;
		System.out.println("Finished Third Quick Sort. " + quickTime3);
		
		//Averages
		double bubbleTime = (bubbleTime1 + bubbleTime2 + bubbleTime3) /3;
		double selectionTime = (selectionTime1 + selectionTime2 + selectionTime3) /3;
		double insertionTime = (insertionTime1 + insertionTime2 + insertionTime3) /3;
		double mergeTime = (mergeTime1 + mergeTime2 + mergeTime3) /3;
		double heapTime = (heapTime1 + heapTime2 + heapTime3) /3;
		double quickTime = (quickTime1 + quickTime2 + quickTime3) /3;*/
}
