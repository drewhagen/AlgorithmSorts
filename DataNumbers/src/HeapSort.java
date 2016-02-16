//import java.util.Arrays;


public class HeapSort {

	/* type extra star here if enabled
	 * @param args
	 *//*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TEST SAMPLE ARRAYS.
		int[] a = {7, 2, 9, 4, 6}; //simple unsorted array
		trialPrint(a);
		int[] b = {3, 4, 5, 6}; //sorted array
		trialPrint(b);
		int[] c = {9, 0, 9, 0}; // arrays with duplicate elements
		trialPrint(c);
		int[] d = {3, 2, 1, 0}; //reserve sorted array
		trialPrint(d);
	}


	
	//Method for printing different sample cases, uses heap()
		public static void trialPrint(int a[]) {
			System.out.println("- Before Sort -");
			System.out.println(Arrays.toString(a));
			System.out.println("-- During Sort --");
			a=heap(a);
			System.out.println();
			System.out.println("--- AFTER Sort ---");
			System.out.println(Arrays.toString(a));
			System.out.println();
	}*/
		
		static int heapsize;
		
		public static int[] heap(int a[]) {
			buildMaxHeap(a);
			for(int i=(a.length-1); i>0; i--)
			{
				int temp = a[i];
				a[i] = a[0];
				a[0] = temp;
				heapsize = heapsize-1;
				maxHeapify(a, 0);
			}
			return a;
		}
		
		public static void buildMaxHeap(int a[]) {
			heapsize = (a.length-1);
			for(int i=(a.length/2);i>=0;i--) {
				maxHeapify(a,i);
			}
		}
		
		public static void maxHeapify(int a[], int i) {
			int largest;
			int temp;
			if(((i*2)+2) > (a.length-1))
			{
				int l = (2*i)+1;
				if((l<=heapsize) && (a[l] > a[i])) largest = l;
				else largest = i;
			}
			else
			{
				int l = (2*i)+1;
				int r = (2*i)+2;
				if (l <= heapsize && a[l] > a[i]) largest = l;
				else largest = i;
				if (r <= heapsize && a[r] > a[largest]) largest = r;
			}
			
			if (largest!=i) {
				temp = a[i];
				a[i] = a[largest];
				a[largest] = temp;
				maxHeapify(a, largest);
			}
		}
		
}
/*
 * TESTING
 * 
 * 
- Before Sort -
[7, 2, 9, 4, 6]
-- During Sort --

--- AFTER Sort ---
[2, 4, 6, 7, 9]

- Before Sort -
[3, 4, 5, 6]
-- During Sort --

--- AFTER Sort ---
[3, 4, 5, 6]

- Before Sort -
[9, 0, 9, 0]
-- During Sort --

--- AFTER Sort ---
[0, 0, 9, 9]

- Before Sort -
[3, 2, 1, 0]
-- During Sort --

--- AFTER Sort ---
[0, 1, 2, 3]
*/
