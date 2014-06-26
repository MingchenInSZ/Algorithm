package test;
import karatmult.karatimp;
import sorting.*;
public class Testing {

	public static void main(String [] args)throws Exception
	{
 
		int [] unsort={8,3,6,2,1,9,5,30,100,35,21,16,22,3};
		int [] sorted=new int [unsort.length];
		//mergeSort.merge_sort_bottom_up(unsort, 0, unsort.length, sorted);
		//bubbleSort.bubble_sort(unsort);
		//selectSort.select_sort(unsort);
		//insertSort.insert_sort(unsort);
		quickSort.quick_sort(unsort, 0, unsort.length);
		for(int i:unsort)
			System.out.print(i+" ");
		System.out.println();
	}
}
