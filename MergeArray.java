import java.util.ArrayList;

public class MergeArray {
	public ArrayList<Integer> merge(int arr1[],int arr2[]){
		int i=0,j=0,k=0;
		ArrayList<Integer> al=new ArrayList();
		
		
		 while (i < arr1.length && j < arr2.length) {
	         if (arr1[i] < arr2[j]) {
	             al.add(arr1[i]);
	             i++;
	         } else {
	             al.add(arr2[j]);
	             j++;
	         }
	         k++;
	    }
		 while (i < arr1.length) {  
	         al.add( arr1[i]);  
	         i++;  
	         k++;
		 }
		 while (j < arr2.length) {  
	         al.add(arr2[j]);  
	         j++;  
	         k++;  
		 }
		return al;
		
	}
}
