package sort;

import sort.selection;

public class sort {
	public static void main(String[] args) {
		int[] arr =  {2, 3, 1, 4, 3, 6, 5};
		int[] array  = selection.select(arr);
		
		for (int i = 0; i < array.length; i ++) {
			System.out.println(array[i]);
		}
	}
}
