
public class QuickSort_20170115 implements Sort {

   public void Sort(int[] a){

   	   sort(a, 0, a.length - 1);

   }

   private void sort(int[] a, int lo, int hi){

   	   if(hi <= lo){
   	      return;
   	    }

   	    int j = partition(a, lo, hi);
   	    sort(a, lo, j-1);
   	    sort(a, j+1, hi);
   }

   private int partition(int[] a, int lo, int hi){

	   	int i = lo;
	   	int j = hi+1;

	   	while(true){

	    	// scan from left to right until I find an element greater than or equal to a[lo]
	   		while(a[lo] >= a[++i]){
	   			if(i >= hi){
	   				break;
	   			}
	   		}

	   		// scan from right to left until I find an element less than or equal to a[lo]
	   		while(a[lo] <= a[--j]){
	   			if(j <= lo){
	   				break;
	   			}
	   		}

	   		// pointers have crossed exit the while loop
	   		if(i>=j){
	   			break;
	   		}

	   		 exch(a, i, j);


	   	}

	   		exch(a, lo, j);

	   		return j;


   }

   private void exch(int[] a, int i, int j){
   		int save = a[i];
   		a[i] = a[j];
   		a[j] = save;
   }

   public static void main(String[] args){
   	  SortTest sortTest = new SortTest(new QuickSort());
   	  sortTest.runTestSuite();
   }


}