
public class BinarySearch {

	public static void binarySearch(int[] arr,int low,int high){
		if(low>high){
			return;
		}
		if(low==high){
			System.out.println(arr[low]);
			return;
		}
		
		int mid = (low+high)/2;
		
		if(mid%2==0){
			if(arr[mid]==arr[mid+1]){
				binarySearch(arr, mid+2, high);
			}else{
				binarySearch(arr, low, mid);
			}
		}
		
		if(mid%2==1){
			if(arr[mid]==arr[mid-1]){
				binarySearch(arr, mid-2, high);
			}else{
				binarySearch(arr, low, mid-1);
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,3,4,4,6,6,8,8};
		binarySearch(arr,0,arr.length);
	}
	
}
