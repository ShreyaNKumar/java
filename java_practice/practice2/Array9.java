package practice2;
import java.util.Arrays;
public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,2,0,5,9,7,8,6,4};
		int k=3,i,j;
		
		//for(i=0;i<a.length;i++) {
			//for(j=i+1;j<a.length;j++)
			//if(a[j]<a[i]) {
				//int t;
				//t = a[i];
				//a[i]=a[j];
				//a[j]=t;
				
			//}
		//}
		//or
		Arrays.sort(a);
		
		
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nThe Kth smallest element is: ");
		System.out.println(a[k-1]);
		
		

	}

}
