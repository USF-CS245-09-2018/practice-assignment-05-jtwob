public class InsertionSort implements SortingAlgorithm{
	public void sort(int [] arr){
		for(int i = 1; i < arr.length; i++){
            int pivot = arr[i];
            int j = i-1;
 
            while(j >= 0 && arr[j] > pivot){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = pivot;
        }
	}
}