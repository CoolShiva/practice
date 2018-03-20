package com.examples.sorting.basic;

public class SelectionSort extends BaseSort {

	@Override
	void sort(int[] arr) {
		int min =0;
		for(int i=0;i<arr.length;i++) {
			min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(min!=i) {
				swap(i,min,arr);
			}
		}
	
	}
	
	public static void main(String []args) {
		int []input = {-5,5,1,0,2,8,4,2,7};
		BaseSort sorter = new SelectionSort();
		sorter.sort(input);
		print(input);
	}
}
