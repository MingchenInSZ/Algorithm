package sorting;
import java.lang.Math.*;
public class mergeSort {
	/*
	 * Merge the arr[start,mid-1] and arr[mid,end]
	 */
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
		//copy the changed number into unsort array
		for(;start<k;start++)
			unsort[start]=sorted[start];
	}
	public static void merge_sort(int [] unsort,int start,int end,int [] sorted)
	{
	  if(end-start<2)
		  return;
	  int mid = (start+end)/2;
	  //merge the subs then the whole
	  merge_sort(unsort,start,mid,sorted);
	  merge_sort(unsort,mid,end,sorted);
	  merge(unsort,start,mid,end,sorted);
	}
	public static void merge_sort_bottom_up(int [] unsort,int start,int end,int [] sorted)
	{
		for(int wid=1;wid<unsort.length;wid *=2)
		{
			for(int i=0;i<unsort.length;i=i+2*wid)
			{
				merge(unsort,i,Math.min(i+wid,unsort.length),Math.min(i+2*wid, unsort.length),sorted);
			}
			for(int i=0;i<unsort.length;i++)
				unsort[i]=sorted[i];
		}
	}
}
