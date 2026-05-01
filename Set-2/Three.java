public class Three{
	public static void main(String[] args){
		int n = 5;
		int[] arr = {5,7,5,2,6,8};
		int min = arr[0];

		for(int i=0; i < n; i++){
			System.out.print(arr[i] + " ");
		}

		for(int i=0; i < n; i++){
			if(arr[i] < min)
				min = arr[i];
		}
		
		System.out.println("\nsmallest number: " + min);
	}
}
