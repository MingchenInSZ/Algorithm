package sorting;

public class quickSort {

	public static void quick_sort(int [] unsort,int start,int end)
	{
	 if(end-start<=1)
		 return;
	 int i=start,j=end-1;
	 int val=unsort[start];//select the first as the pivot
	 int pivot=val;
	 while(i<j)
	 {
		 
		 while(unsort[j]>pivot && j>i)
			 j--;
		 if(i!=j)
		 unsort[i]=unsort[j];
		 while(unsort[i]<=pivot && i<j)
			 i++;
		 if(i!=j)
		 unsort[j]=unsort[i];
		 unsort[i]=val;//place the pivot in its order
	 }
//	 System.out.println("Start:"+start+" End:"+end);
//	 for(int t:unsort)
//		 System.out.print(t+" ");
//	 System.out.println();
	 //then iterate the sub-array
	 quick_sort(unsort,0,i);
	 quick_sort(unsort,i+1,end);
	}
}
