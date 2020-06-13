package reference;

public class Buble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6,7,8,2,4 버블솔트 
		int[] arr = new int[5];
		arr[0] = 6;
		arr[1] = 7;
		arr[2] = 8;
		arr[3] = 2;
		arr[4] = 4;
		int arrlength = arr.length;
		int index = 0;
		int temp = 0;
		
		for(int i = 0; i<arrlength-1; i++) {
			for(int j = 1; j<arrlength; j++) {
				if (arr[j-1] > arr[j]) {
					swap(arr, j); // swap 클래스의 매개변수는 arr,j로 설정 . 이 값을swap클래스에 복사
				}
			}
		}

		
		for(int i = 0; i<5; i++) {
		System.out.println(arr[i]);
		}
		
		
	}
	
	public static void swap(int[] arrarr, int jj) { // arr의 주소를 arrarr에 복사, j의 값을 jj에 복사
		int temp = 0;
		temp = arrarr[jj-1];
		arrarr[jj-1] = arrarr[jj];
		arrarr[jj] = temp;
	}

}
