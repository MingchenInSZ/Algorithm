package test;
import karatmult.karatimp;
import sorting.*;
import Aux.*;
public class Testing {

	public static void main(String [] args)throws Exception
	{
 
		int [] unsort={8,3,6,2,1,9,23,5,30,29,35,21,16,22,3};
		int [] sorted=new int [unsort.length];
		//mergeSort.merge_sort_bottom_up(unsort, 0, unsort.length, sorted);
		//bubbleSort.bubble_sort(unsort);
		//selectSort.select_sort(unsort);
		//insertSort.insert_sort(unsort);
		//quickSort.quick_sort(unsort, 0, unsort.length);
		//heapSort.heap_sort(unsort);
		//radixSort.radix_sort(unsort, 10);
		//testCode();
		//countingSort.counting_sort(unsort, sorted);
		for(int i:sorted)
			System.out.print(i+" ");
		System.out.println();
	}
	public  static void testCode()
	{
		/*
		 * You can test any code here
		 */
		double [] unsort={0.12,0.56,0.23,0.18,0.19,0.29,0.34,0.37,0.58,0.67};
		double [] sorted= new double[unsort.length];
		bucketSort.bucket_sort(unsort, sorted);
		for(double d:sorted)
			System.out.println(d+" ");
		System.out.println();
		
		
	}
}
