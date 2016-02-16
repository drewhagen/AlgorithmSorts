//import java.util.Arrays;

/* Bubble Sort 
 * Drew Hagen
 */
public class BubbleSort {

	/* type extra star here if enabled.
	 * @param args
	 *//*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TEST SAMPLE ARRAYS.		
		int[] a = {3, 9, 2, 0, 6}; //simple unsorted array
		trialPrint(a);
		int[] b = {3, 6, 3}; //duplicate element array
		trialPrint(b);
		int[] c = {0, 1, 2, 3}; //presorted array
		trialPrint(c);
		int[] d = {4, 3, 2, 1}; //unsorted array
		trialPrint(d);
		}
	*/
	
/*Method for printing different sample cases, uses bubble()	
	public static void trialPrint(int a[]) {
		System.out.println("- Before Sort -");
		System.out.println(Arrays.toString(a));
		System.out.println("-- During Sort --");
		bubble(a);
		System.out.println();
		System.out.println("--- AFTER Sort ---");
		System.out.println(Arrays.toString(a));
		System.out.println();
	}*/
	
	public static void bubble(int a[]) {
		int temp;
		
		for(int i=a.length; i>1; i--) {
		/*System.out.println();
		System.out.println("~~Iteration " + (a.length+1-i) + "~~ "
				+ Arrays.toString(a));*/
			for(int j=1; j<i; j++) {
				if(a[j] < a[j-1]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
				/*System.out.println("| Post-Swapped " + j + " | "
						+ Arrays.toString(a));*/
			}
		}
	}
}
/*
Test Results
- Before Sort -
[3, 9, 2, 0, 6]
-- During Sort --

~~Iteration 1~~ [3, 9, 2, 0, 6]
| Post-Swapped 1 | [3, 9, 2, 0, 6]
| Post-Swapped 2 | [3, 2, 9, 0, 6]
| Post-Swapped 3 | [3, 2, 0, 9, 6]
| Post-Swapped 4 | [3, 2, 0, 6, 9]

~~Iteration 2~~ [3, 2, 0, 6, 9]
| Post-Swapped 1 | [2, 3, 0, 6, 9]
| Post-Swapped 2 | [2, 0, 3, 6, 9]
| Post-Swapped 3 | [2, 0, 3, 6, 9]

~~Iteration 3~~ [2, 0, 3, 6, 9]
| Post-Swapped 1 | [0, 2, 3, 6, 9]
| Post-Swapped 2 | [0, 2, 3, 6, 9]

~~Iteration 4~~ [0, 2, 3, 6, 9]
| Post-Swapped 1 | [0, 2, 3, 6, 9]

--- AFTER Sort ---
[0, 2, 3, 6, 9]

- Before Sort -
[3, 6, 3]
-- During Sort --

~~Iteration 1~~ [3, 6, 3]
| Post-Swapped 1 | [3, 6, 3]
| Post-Swapped 2 | [3, 3, 6]

~~Iteration 2~~ [3, 3, 6]
| Post-Swapped 1 | [3, 3, 6]

--- AFTER Sort ---
[3, 3, 6]

- Before Sort -
[0, 1, 2, 3]
-- During Sort --

~~Iteration 1~~ [0, 1, 2, 3]
| Post-Swapped 1 | [0, 1, 2, 3]
| Post-Swapped 2 | [0, 1, 2, 3]
| Post-Swapped 3 | [0, 1, 2, 3]

~~Iteration 2~~ [0, 1, 2, 3]
| Post-Swapped 1 | [0, 1, 2, 3]
| Post-Swapped 2 | [0, 1, 2, 3]

~~Iteration 3~~ [0, 1, 2, 3]
| Post-Swapped 1 | [0, 1, 2, 3]

--- AFTER Sort ---
[0, 1, 2, 3]

- Before Sort -
[4, 3, 2, 1]
-- During Sort --

~~Iteration 1~~ [4, 3, 2, 1]
| Post-Swapped 1 | [3, 4, 2, 1]
| Post-Swapped 2 | [3, 2, 4, 1]
| Post-Swapped 3 | [3, 2, 1, 4]

~~Iteration 2~~ [3, 2, 1, 4]
| Post-Swapped 1 | [2, 3, 1, 4]
| Post-Swapped 2 | [2, 1, 3, 4]

~~Iteration 3~~ [2, 1, 3, 4]
| Post-Swapped 1 | [1, 2, 3, 4]

--- AFTER Sort ---
[1, 2, 3, 4]
*/
