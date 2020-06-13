package reference;

public class Select_Sort {
	public static void main(String[] args) {
		//선택정렬  6 7 8 2 4 -> 8 7 6 4 2 
		
		int[] arr = {6, 7, 8, 2, 4};
		int temp = 0;
		
	
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i]; // temp에 7값 저장
					arr[i] = arr[j]; // arr[1]에 arr[0]값 저장 , 66824
					arr[j] = temp; // arr[0]에 7값 저장, 76824	
				}				
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
		

	
		
	}	
}

