//import java.util.*;

/* Selection Sort
 * Drew Hagen
 */
public class SelectionSort {

	/* type extra star here if enabled
	 * @param args
	 *//*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TEST SAMPLE ARRAYS.
		int[] a = {3, 9, 4, 0, 5}; //simple unsorted array
		trialPrint(a);
		int[] b = {6, 7, 8, 9}; //sorted array
		trialPrint(b);
		int[] c = {1, 2, 1, 2}; // arrays with duplicate elements
		trialPrint(c);
		int[] d = {4, 3, 2, 0}; //reserve sorted array
		trialPrint(d);
	}
	
//Method for printing different sample cases, uses selection()
	public static void trialPrint(int a[]) {
		System.out.println("- Before Sort -");
		System.out.println(Arrays.toString(a));
		System.out.println("-- During Sort --");
		selection(a);
		System.out.println();
		System.out.println("--- AFTER Sort ---");
		System.out.println(Arrays.toString(a));
		System.out.println();
	}
	*/
	
//the selection sort!	
	public static void selection(int a[]) {
		int mindex;
		for(int j=0; j<(a.length-1); j++) {
			mindex = j;
			/*System.out.println();
			System.out.println("~~Iteration " + (j+1) + "~~ "
					+ Arrays.toString(a));*/
			for(int i=j; i<a.length; i++){
				if (a[i] < a[mindex])
					mindex = i;
			}
			if(j!= mindex) {
				int temp = a[j];
				a[j] = a[mindex];
				a[mindex] = temp;
				/*System.out.println("| Output " + " | "
						+ Arrays.toString(a));*/
			}
		}
	}

}
/*
Test Results
- Before Sort -
[3, 9, 4, 0, 5]
-- During Sort --

~~Iteration 1~~ [3, 9, 4, 0, 5]
| Output  | [0, 9, 4, 3, 5]

~~Iteration 2~~ [0, 9, 4, 3, 5]
| Output  | [0, 3, 4, 9, 5]

~~Iteration 3~~ [0, 3, 4, 9, 5]

~~Iteration 4~~ [0, 3, 4, 9, 5]
| Output  | [0, 3, 4, 5, 9]

--- AFTER Sort ---
[0, 3, 4, 5, 9]

- Before Sort -
[6, 7, 8, 9]
-- During Sort --

~~Iteration 1~~ [6, 7, 8, 9]

~~Iteration 2~~ [6, 7, 8, 9]

~~Iteration 3~~ [6, 7, 8, 9]

--- AFTER Sort ---
[6, 7, 8, 9]

- Before Sort -
[1, 2, 1, 2]
-- During Sort --

~~Iteration 1~~ [1, 2, 1, 2]

~~Iteration 2~~ [1, 2, 1, 2]
| Output  | [1, 1, 2, 2]

~~Iteration 3~~ [1, 1, 2, 2]

--- AFTER Sort ---
[1, 1, 2, 2]

- Before Sort -
[4, 3, 2, 0]
-- During Sort --

~~Iteration 1~~ [4, 3, 2, 0]
| Output  | [0, 3, 2, 4]

~~Iteration 2~~ [0, 3, 2, 4]
| Output  | [0, 2, 3, 4]

~~Iteration 3~~ [0, 2, 3, 4]

--- AFTER Sort ---
[0, 2, 3, 4]
*/