package sort;

public class bubble {
	public static void main(String[] args) {
		int str[] = {2, 3, 1, 4, 3, 6, 5};
		int temp;
		
		for(int i = 0; i < str.length - 1; i ++) {
			for (int j = 0; j < str.length - 1 - i; j ++) {
				if (str[j] > str[j + 1]) {
					temp = str[j];
					str[j] = str[j +1];
					str[j + 1] = temp;
				}
			}
		}
		
		
		for(int i = 0; i < str.length; i ++) {
			System.out.println(str[i]);
		}
	}
}
