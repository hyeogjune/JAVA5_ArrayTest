package reference;

public class Select_Sort {
	public static void main(String[] args) {
		//��������  6 7 8 2 4 -> 8 7 6 4 2 
		
		int[] arr = {6, 7, 8, 2, 4};
		int temp = 0;
		
	
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i]; // temp�� 7�� ����
					arr[i] = arr[j]; // arr[1]�� arr[0]�� ���� , 66824
					arr[j] = temp; // arr[0]�� 7�� ����, 76824	
				}				
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
		

	
		
	}	
}

