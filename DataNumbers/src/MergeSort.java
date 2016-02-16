//import java.util.*;

/* Merge Sort 
 * Drew Hagen
 */
public class MergeSort {

	/* type extra star here
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
	
//Method for printing different sample cases, uses selection()
	public static void trialPrint(int a[]) {
		System.out.println("- Before Sort -");
		System.out.println(Arrays.toString(a));
		System.out.println("-- During Sort --");
		a=merge(a);
		System.out.println();
		System.out.println("--- AFTER Sort ---");
		System.out.println(Arrays.toString(a));
		System.out.println();
	}*/
	
	public static int[] merge(int a[]) {
		/*System.out.println("|~ Subarray Length: " + a.length + " ~|");
		System.out.println(Arrays.toString(a));*/
		if(a.length <= 1) return a;
		
		//divide
		int middle = (a.length/2);
		int left[] = new int[middle];
		int right[] = new int[a.length-middle];
		
		for (int i = 0; i < middle; i++)
			left[i]=a[i];
		for (int i = middle; i < a.length; i++)
			right[i-middle]=a[i];
		//recursion
		left = merge(left);
		right = merge(right);
		a = conquer(left, right);
		return(a);
	}
	
	public static int[] conquer(int left[], int right[]) {
		int sum = (left.length + right.length);
		int result[] = new int[sum];
		
		int i=0;
		int j=0;
		for (int k=0; k<result.length;) {
			/*System.out.println(">Merged Array Iteration |"+k+"| "+
					Arrays.toString(left) + Arrays.toString(right) +
					Arrays.toString(result));*/
			while (i < left.length || j < right.length) {
				if(i < left.length && j < right.length) {
					if(left[i] <= right[j]) {
						result[k] = left[i];
						i++;
						k++;
						/*System.out.println("   >Left Array Iteration |"+i+"| "+
						Arrays.toString(left) + Arrays.toString(right) +
						Arrays.toString(result));*/
					}
					else {
						result[k] = right[j];
						j++;
						k++;
						/*System.out.println("   >Right Array Iteration |"+j+"| "+
								Arrays.toString(left) + Arrays.toString(right) +
								Arrays.toString(result));*/
					}
				}
				else if (i < left.length && j >= right.length) {
					result[k] = left[i];
					i++;
					k++;
					/*System.out.println("   >Right Array Finished.");
					System.out.println("   >Left Array Iteration |"+i+"| "+
							Arrays.toString(left) + Arrays.toString(right) +
							Arrays.toString(result));*/
				}
				else if (j < right.length && i >= left.length) {
					result[k] = right[j];
					j++;
					k++;
					/*System.out.println("   >Left Array Finished.");
					System.out.println("   >Right Array Iteration |"+j+"| "+
							Arrays.toString(left) + Arrays.toString(right) +
							Arrays.toString(result));*/
				}
			}
		}
		return result;
	}
		
}
/* TEST RESULTS
- Before Sort -
[7, 2, 9, 4, 6]
-- During Sort --
|~ Subarray Length: 5 ~|
[7, 2, 9, 4, 6]
|~ Subarray Length: 2 ~|
[7, 2]
|~ Subarray Length: 1 ~|
[7]
|~ Subarray Length: 1 ~|
[2]
>Merged Array Iteration |0| [7][2][0, 0]
   >Right Array Iteration |1| [7][2][2, 0]
   >Right Array Finished.
   >Left Array Iteration |1| [7][2][2, 7]
|~ Subarray Length: 3 ~|
[9, 4, 6]
|~ Subarray Length: 1 ~|
[9]
|~ Subarray Length: 2 ~|
[4, 6]
|~ Subarray Length: 1 ~|
[4]
|~ Subarray Length: 1 ~|
[6]
>Merged Array Iteration |0| [4][6][0, 0]
   >Left Array Iteration |1| [4][6][4, 0]
   >Left Array Finished.
   >Right Array Iteration |1| [4][6][4, 6]
>Merged Array Iteration |0| [9][4, 6][0, 0, 0]
   >Right Array Iteration |1| [9][4, 6][4, 0, 0]
   >Right Array Iteration |2| [9][4, 6][4, 6, 0]
   >Right Array Finished.
   >Left Array Iteration |1| [9][4, 6][4, 6, 9]
>Merged Array Iteration |0| [2, 7][4, 6, 9][0, 0, 0, 0, 0]
   >Left Array Iteration |1| [2, 7][4, 6, 9][2, 0, 0, 0, 0]
   >Right Array Iteration |1| [2, 7][4, 6, 9][2, 4, 0, 0, 0]
   >Right Array Iteration |2| [2, 7][4, 6, 9][2, 4, 6, 0, 0]
   >Left Array Iteration |2| [2, 7][4, 6, 9][2, 4, 6, 7, 0]
   >Left Array Finished.
   >Right Array Iteration |3| [2, 7][4, 6, 9][2, 4, 6, 7, 9]

--- AFTER Sort ---
[2, 4, 6, 7, 9]

- Before Sort -
[3, 4, 5, 6]
-- During Sort --
|~ Subarray Length: 4 ~|
[3, 4, 5, 6]
|~ Subarray Length: 2 ~|
[3, 4]
|~ Subarray Length: 1 ~|
[3]
|~ Subarray Length: 1 ~|
[4]
>Merged Array Iteration |0| [3][4][0, 0]
   >Left Array Iteration |1| [3][4][3, 0]
   >Left Array Finished.
   >Right Array Iteration |1| [3][4][3, 4]
|~ Subarray Length: 2 ~|
[5, 6]
|~ Subarray Length: 1 ~|
[5]
|~ Subarray Length: 1 ~|
[6]
>Merged Array Iteration |0| [5][6][0, 0]
   >Left Array Iteration |1| [5][6][5, 0]
   >Left Array Finished.
   >Right Array Iteration |1| [5][6][5, 6]
>Merged Array Iteration |0| [3, 4][5, 6][0, 0, 0, 0]
   >Left Array Iteration |1| [3, 4][5, 6][3, 0, 0, 0]
   >Left Array Iteration |2| [3, 4][5, 6][3, 4, 0, 0]
   >Left Array Finished.
   >Right Array Iteration |1| [3, 4][5, 6][3, 4, 5, 0]
   >Left Array Finished.
   >Right Array Iteration |2| [3, 4][5, 6][3, 4, 5, 6]

--- AFTER Sort ---
[3, 4, 5, 6]

- Before Sort -
[9, 0, 9, 0]
-- During Sort --
|~ Subarray Length: 4 ~|
[9, 0, 9, 0]
|~ Subarray Length: 2 ~|
[9, 0]
|~ Subarray Length: 1 ~|
[9]
|~ Subarray Length: 1 ~|
[0]
>Merged Array Iteration |0| [9][0][0, 0]
   >Right Array Iteration |1| [9][0][0, 0]
   >Right Array Finished.
   >Left Array Iteration |1| [9][0][0, 9]
|~ Subarray Length: 2 ~|
[9, 0]
|~ Subarray Length: 1 ~|
[9]
|~ Subarray Length: 1 ~|
[0]
>Merged Array Iteration |0| [9][0][0, 0]
   >Right Array Iteration |1| [9][0][0, 0]
   >Right Array Finished.
   >Left Array Iteration |1| [9][0][0, 9]
>Merged Array Iteration |0| [0, 9][0, 9][0, 0, 0, 0]
   >Left Array Iteration |1| [0, 9][0, 9][0, 0, 0, 0]
   >Right Array Iteration |1| [0, 9][0, 9][0, 0, 0, 0]
   >Left Array Iteration |2| [0, 9][0, 9][0, 0, 9, 0]
   >Left Array Finished.
   >Right Array Iteration |2| [0, 9][0, 9][0, 0, 9, 9]

--- AFTER Sort ---
[0, 0, 9, 9]

- Before Sort -
[3, 2, 1, 0]
-- During Sort --
|~ Subarray Length: 4 ~|
[3, 2, 1, 0]
|~ Subarray Length: 2 ~|
[3, 2]
|~ Subarray Length: 1 ~|
[3]
|~ Subarray Length: 1 ~|
[2]
>Merged Array Iteration |0| [3][2][0, 0]
   >Right Array Iteration |1| [3][2][2, 0]
   >Right Array Finished.
   >Left Array Iteration |1| [3][2][2, 3]
|~ Subarray Length: 2 ~|
[1, 0]
|~ Subarray Length: 1 ~|
[1]
|~ Subarray Length: 1 ~|
[0]
>Merged Array Iteration |0| [1][0][0, 0]
   >Right Array Iteration |1| [1][0][0, 0]
   >Right Array Finished.
   >Left Array Iteration |1| [1][0][0, 1]
>Merged Array Iteration |0| [2, 3][0, 1][0, 0, 0, 0]
   >Right Array Iteration |1| [2, 3][0, 1][0, 0, 0, 0]
   >Right Array Iteration |2| [2, 3][0, 1][0, 1, 0, 0]
   >Right Array Finished.
   >Left Array Iteration |1| [2, 3][0, 1][0, 1, 2, 0]
   >Right Array Finished.
   >Left Array Iteration |2| [2, 3][0, 1][0, 1, 2, 3]

--- AFTER Sort ---
[0, 1, 2, 3]
 */
