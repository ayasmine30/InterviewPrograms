package sample;

public class SortingArray {

	public static void main(String[] args) {
		int a[]= {10,5,7,2,0,9,3,6};
		int temp =0;
		for(int i=0; i<a.length; i++) {
			for(int j=i;j<a.length; j++) {
				if(a[i]>a[j]) {
				temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}

	}

}
