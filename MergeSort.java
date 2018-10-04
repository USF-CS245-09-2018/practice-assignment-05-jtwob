public class MergeSort implements SortingAlgorithm{
	public void sort(int[] arr){
		mergeSort(arr, 0, arr.length -1);
	}

	public void merge(int[] arr, int l, int m, int r){

		int i;
		int j;
		int k;

		int leftSize = m - l + 1;
		int rightSize = r - m;

		int leftTempArr[] = new int [leftSize];
		int rightTempArr[] = new int [rightSize];

		for (i = 0; i < leftSize; i++){
			leftTempArr[i] = arr[l + i];
		}
		for (j = 0; j < rightSize; j++){
			rightTempArr[j] = arr[m + 1 + j];
		}

		i = 0;
		j = 0;
		k = l;

		while (i < leftSize && j < rightSize){
			if(leftTempArr[i] <= rightTempArr[j]){
				arr[k] = leftTempArr[i];
				i++;
			}
			else{
				arr[k] = rightTempArr[j];
				j++;
			}
			k++;
		}

		while (i < leftSize){
			arr[k] = leftTempArr[i];
			i++;
			k++;
		}

		while(j < rightSize){
			arr[k] = rightTempArr[j];
			j++;
			k++;
		}

	}

	public void mergeSort(int[] arr, int l, int r){
		if(l < r){
			int m = l + (r - l)/2;

			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);

			merge(arr, l, m, r);
		}
	}
}