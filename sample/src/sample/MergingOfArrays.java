package sample;

public class MergingOfArrays {

	public static void main(String[] args) {
		int arr1[] = {2,1,9,5,4,2,3,8};
		int arr2[] = {6,3,2,8,7,5,1,0};
		int arr3[] = new int[20];
        int count =0;
        
        for(int i=0; i<arr1.length; i++) {
        	arr3[i]= arr1[i];
        	count++;
        }
        for(int i=0; i<arr2.length; i++) {
        	arr3[count++]= arr2[i];
        }
        
        for(int i=0; i<arr3.length; i++) {
        	System.out.println("The merged array is:"+ arr3[i]);
        }
	}

}
