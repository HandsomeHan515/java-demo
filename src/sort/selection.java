package sort;

public class selection {
	public static void main(String[] args) {
		int arr[] = {2, 3, 1, 4, 3, 6, 5};
		int temp;
		
		for (int i = 0; i < arr.length; i ++) {
			for (int j = i; j < arr.length; j ++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i ++) {
			System.out.println(arr[i]);
		}
	}
	
	public void sort(int arr[]) {
		int temp;
		
		for(int i = 0; i < arr.length; i ++) {
			
		}
	}
}
