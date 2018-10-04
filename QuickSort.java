public class QuickSort implements SortingAlgorithm{
	public void sort(int[] arr){
		quickSort(arr, 0, arr.length-1);
	}
	public int split(int arr[], int s, int l){ 
        int pivot = arr[l];  
        int i = (s-1);
        for (int j=s; j<l; j++){ 
            if (arr[j] <= pivot){ 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        int temp = arr[i+1]; 
        arr[i+1] = arr[l]; 
        arr[l] = temp; 
  
        return i+1; 
    } 
   
    public void quickSort(int arr[], int s, int l){ 
        if (s < l){ 
            
            int split = split(arr, s, l); 
            
            quickSort(arr, s, split-1); 
            quickSort(arr, split+1, l); 
        } 
    } 
}