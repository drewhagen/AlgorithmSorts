//import java.util.*;

/* Insertion Sort 
 * Drew Hagen
 */
public class InsertionSort {

	/* type extra star here if enabled
	 * @param args
	 *//*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7, 0, 4, 9, 2};
		trialPrint(a);
		int[] b = {3, 4, 4, 2, 3};
		trialPrint(b);
		int[] c = {0, 4, 5, 9};
		trialPrint(c);
		int[] d = {9, 5, 4, 0};
		trialPrint(d);
	}
	
	//Method for printing different sample cases, uses insertion()
		public static void trialPrint(int a[]) {
			System.out.println("- Before Sort -");
			System.out.println(Arrays.toString(a));
			System.out.println("-- During Sort --");
			insertion(a);
			System.out.println();
			System.out.println("--- AFTER Sort ---");
			System.out.println(Arrays.toString(a));
			System.out.println();
		}
		*/
	
	public static void insertion(int a[]) {
		for (int i = 0; i < a.length; i++) {
			/*System.out.println();
			System.out.println("~~Iteration " + (i+1) + "~~ "
					+ Arrays.toString(a));*/
			int valueToInsert = a[i];
			//Insert c[i] into the sorted subarray c[1...i-1]
			int j = i-1;
			while (j >= 0 && a[j] > valueToInsert) {
				a[j+1] = a[j];
				j = j-1;
			}
			a[j+1] = valueToInsert;
			/*System.out.println("| Output " + " | "
					+ Arrays.toString(a));*/
		}
	}
}
/*
Test Results
- Before Sort -
[7, 0, 4, 9, 2]
-- During Sort --

~~Iteration 1~~ [7, 0, 4, 9, 2]
| Output  | [7, 0, 4, 9, 2]

~~Iteration 2~~ [7, 0, 4, 9, 2]
| Output  | [0, 7, 4, 9, 2]

~~Iteration 3~~ [0, 7, 4, 9, 2]
| Output  | [0, 4, 7, 9, 2]

~~Iteration 4~~ [0, 4, 7, 9, 2]
| Output  | [0, 4, 7, 9, 2]

~~Iteration 5~~ [0, 4, 7, 9, 2]
| Output  | [0, 2, 4, 7, 9]

--- AFTER Sort ---
[0, 2, 4, 7, 9]

- Before Sort -
[3, 4, 4, 2, 3]
-- During Sort --

~~Iteration 1~~ [3, 4, 4, 2, 3]
| Output  | [3, 4, 4, 2, 3]

~~Iteration 2~~ [3, 4, 4, 2, 3]
| Output  | [3, 4, 4, 2, 3]

~~Iteration 3~~ [3, 4, 4, 2, 3]
| Output  | [3, 4, 4, 2, 3]

~~Iteration 4~~ [3, 4, 4, 2, 3]
| Output  | [2, 3, 4, 4, 3]

~~Iteration 5~~ [2, 3, 4, 4, 3]
| Output  | [2, 3, 3, 4, 4]

--- AFTER Sort ---
[2, 3, 3, 4, 4]

- Before Sort -
[0, 4, 5, 9]
-- During Sort --

~~Iteration 1~~ [0, 4, 5, 9]
| Output  | [0, 4, 5, 9]

~~Iteration 2~~ [0, 4, 5, 9]
| Output  | [0, 4, 5, 9]

~~Iteration 3~~ [0, 4, 5, 9]
| Output  | [0, 4, 5, 9]

~~Iteration 4~~ [0, 4, 5, 9]
| Output  | [0, 4, 5, 9]

--- AFTER Sort ---
[0, 4, 5, 9]

- Before Sort -
[9, 5, 4, 0]
-- During Sort --

~~Iteration 1~~ [9, 5, 4, 0]
| Output  | [9, 5, 4, 0]

~~Iteration 2~~ [9, 5, 4, 0]
| Output  | [5, 9, 4, 0]

~~Iteration 3~~ [5, 9, 4, 0]
| Output  | [4, 5, 9, 0]

~~Iteration 4~~ [4, 5, 9, 0]
| Output  | [0, 4, 5, 9]

--- AFTER Sort ---
[0, 4, 5, 9]
*/