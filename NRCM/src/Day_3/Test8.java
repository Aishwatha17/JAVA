package Day_3;

public class Test8 {
	public static void main(String[] args) {
		int[] arr= {4,7,1,9,2};
		int min =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min=arr[i];
			}
		}
		System.out.println("Min:"+min);
	}

}
