// Maximum and minimum of an array using minimum number of comparisons
import java.util.*;
public class MaximumMinimum {
	
	public static void main(String[] args){
		int[] a = {125,7,30,34,23,0};
		boolean flag = (a.length%2 == 0) ? true : false;
		System.out.println(minMax(a));
		System.out.println(minMax(a,flag));
		
	}
	//1. Brute Force Approach - Iterate over all Elements and update min and max
	public static String minMax (int[] a){
		int [] res = {Integer.MIN_VALUE,Integer.MAX_VALUE};
		for(int i = 0;i<a.length;i++){
			if(res[0] < a[i]){
				res[0] = a[i];
			}
			if(res[1] > a[i]){
				res[1] = a[i];
			}
		}
		return Arrays.toString(res);
		
	}
	
	//2. Comparing in Pairs - Time Complexity O(N) but more efficient as we are comparing in pairs
	public static String minMax (int[] a,boolean oddEven){
		int [] res = {Integer.MIN_VALUE,Integer.MAX_VALUE};
		int i;
		if(oddEven){
			res[0] = a[0];
			res[1] = a[1];
			i = 2;
		}
		else{
			res[0] = a[0];
			res[1] = a[0];
			i = 1;
		}
		
		while(i < a.length-1){
			if(a[i]>a[i+1]){
				if(a[i] > res[0]){
					res[0] = a[i];
				}
				if(a[i+1] < res[1]){
					res[1] = a[i+1];
				}
			}
			else{
				if(a[i+1] > res[0]){
					res[0] = a[i+1];
				}
				if(a[i] < res[1]){
					res[1] = a[i];
				}
			}
			i+=2;
			}
		
		return Arrays.toString(res);
		
	}
}