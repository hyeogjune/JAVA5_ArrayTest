package reference;

public class Insert_Sort {

	public static void main(String[] args) {
		//��������  6 7 8 2 4 -> 2 4 6 7 8
		
		int[] arr = {6, 7, 8, 2, 4};
		int temp = 0;
		
		
		for(int i = 0; i<arr.length; i++) {
			
			for(int j = 1; j<arr.length; j++) {
				if(arr[i] > arr[j] && arr[i] > arr[j-1]) {
					temp = arr[i]; // temp�� arr[1]�� ����
					arr[j] = arr[i]; // arr[0]�� arr[1]�� ����
					arr[i] = temp; //�ΰ� �ٲ�, ū ������� 7 6 8 2 4
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

	}

}
