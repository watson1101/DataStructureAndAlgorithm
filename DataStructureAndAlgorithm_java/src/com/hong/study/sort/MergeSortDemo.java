package com.hong.study.sort;

/**
 *
 * 
 * @author mc
 *
 */
public class MergeSortDemo {

	public static void main(String[] args) {
		int[] array = { 17, 5, 3,32, 7, 43, 8,  9, 4, 465, 67 };
		// int[] array = new int[]{1,9,5,3,7,5,32,7,43,8,3,9,4,465,67};
//		int[] array = { 5, 9, 5, 3, 7, 5};
		for (int c = 0; c < array.length; c++) {
			System.out.print("   " + array[c]);
		}
		System.out.println("----------------");
		//qst.quickSortMethod(array);
		MergeSort.mergeSort(array);
//		System.out.println(qst.getArray());
	}

}
