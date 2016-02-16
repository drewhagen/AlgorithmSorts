
public class QuickSort
{
   public static void swap (int A[], int x, int y)
   {
      int temp = A[x];
      A[x] = A[y];
      A[y] = temp;
   }

   // Reorganizes the given list so all elements less than the first are 
   // before it and all greater elements are after it.                   
   public static int partition(int A[], int f, int l)
   {
      int pivot = A[f];
      while (f < l)
      {
         while (A[f] < pivot) f++;
         while (A[l] > pivot) l--;
         swap (A, f, l);
      }
      return f;
   }

   public static void quickSort(int A[], int f, int l)
   {
      if (f >= l) return;
      int pivot_index = partition(A, f, l);
      quickSort(A, f, pivot_index);
      quickSort(A, pivot_index+1, l);
   }
}