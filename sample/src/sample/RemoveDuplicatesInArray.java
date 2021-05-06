package sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 10,90,50,30,80,69,62,100,49,10,50,30};
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i =0; i< arr.length;i++) {
        	set.add(arr[i]);
        }
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}

}
