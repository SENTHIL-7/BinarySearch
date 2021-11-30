import java.util.Arrays;
public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {4,5,1,8,66,44,15,75,2,9,56};
		int key=76;
		int last =arr.length-1;
		Binary_Search(arr,0,last,key);
        
		
	}
	public static void Binary_Search(int arr[],int first,int last,int key) {
		Arrays.sort(arr);
		int mid =(first+last)/2;
		
		while(first<=last) {
			if(arr[mid]==key) {
				System.out.println("Element is found at index " + mid);
				break;
			}
			else if (arr[mid]<key){
				first=mid+1;
			}
			else {
				last =mid-1;
			}
			mid =(first+last)/2;
		
		}
		if(first>last) {
			System.out.println("Element is not found  ");
		}
		
	}

}
