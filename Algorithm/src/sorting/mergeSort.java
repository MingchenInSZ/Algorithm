package sorting;

public class mergeSort {

	public static void merge(int [] unsort,int start,int mid,int end,int [] sorted)
	{
		int i=start,j=mid;
		int k=start;
		while(i<mid && j<end)
		{
			if(unsort[i]>unsort[j])
			{
				sorted[k++]=unsort[j++];
			}else
			{
				sorted[k++]=unsort[i++];
			}
		}
		while(i<mid)
		sorted[k++]=unsort[i++];
		while(j<end)
		sorted[k++]=unsort[j++];
//		for(int t:sorted)
//			System.out.print(t+" ");
//		System.out.println();
		for(;start<k;start++)
			unsort[start]=sorted[start];
	}
	public static void merge_sort(int [] unsort,int start,int end,int [] sorted)
	{
	  if(end-start<2)
		  return;
	  int mid = (start+end)/2;
	  
	  merge_sort(unsort,start,mid,sorted);
	  merge_sort(unsort,mid,end,sorted);
	  merge(unsort,start,mid,end,sorted);
	}
}
