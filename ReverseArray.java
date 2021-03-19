// Write a Program to reverse an array
import java.util.Arrays;
public class ReverseArray{
	
	public static void main(String[] args){
		
		int[] a = {4,5,1,2,6,9};
		System.out.print("Before Reverse ");
		System.out.println(Arrays.toString(a));
		// Method OverLoading Concept: Same Method with different Parameters
		// Methods declared as Static so don't need to create object to call mmethods
		reverseArray(a);
		reverseArray(a,0,a.length-1);
	}
	
	public static void reverseArray(int[] a){
		// 1. Brute Force Approach -- Time Complexity O(N) Space Complexity O(N)
		int [] res = new int[a.length];
		int j = 0;
		for(int i=a.length-1;i>=0;i--){
			res[j] = a[i];
			j++;
		}
		System.out.print("After Brute Force Reverse ");
		System.out.println(Arrays.toString(res));
		
	}
	
	public static void reverseArray(int[] a, int start, int end){
		int temp;
	// 2. In Place Swaping -- Time Complexity O(N) Space Complexity O(1)
		while(start<end){
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		System.out.print("After In Place Reverse ");
		System.out.println(Arrays.toString(a));
	}
}