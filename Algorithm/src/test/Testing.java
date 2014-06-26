package test;
import karatmult.karatimp;
import sorting.mergeSort;
public class Testing {

	public static void main(String [] args)throws Exception
	{
 
		int [] unsort={8,3,6,2,1,9,5,30,100,35,21,16,22,3};
		int [] sorted=new int [unsort.length];
		mergeSort.merge_sort(unsort, 0, unsort.length, sorted);
		for(int i:sorted)
			System.out.print(i+" ");
		System.out.println();
	}
}
