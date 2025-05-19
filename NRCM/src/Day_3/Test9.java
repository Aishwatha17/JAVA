package Day_3;

public class Test9 {
	public static void main(String[] args) {
		int[] arr= {4,7,1,9,2};
		int arr1[]=new int[arr.length];
		
		int max =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max=arr[i];
			}
		}
		System.out.println("Max:"+max);
	}

}


