package sorting;

public class heapSort {

	public static void heapAdjust_max(int [] arr,int ind,int len)
	{
		int left=2*ind;
		int right=2*ind+1;
		int max=ind;
		if(left<len && arr[max]<arr[left])
			max=left;
		if(right<len && arr[max]<arr[right])
			max=right;
		if(max!=ind)
		{
			int t=arr[ind];
			arr[ind]=arr[max];
			arr[max]=t;
		}else{
			return;
		}
//		for(int t:arr)
//			System.out.print(t+" ");
//		System.out.println();
		heapAdjust_max(arr,max,len);
	}
	public static void heap_sort(int [] unsort)
	{
		for(int i=unsort.length/2;i>=0;i--)
			heapAdjust_max(unsort,i,unsort.length);
		//System.out.println("unsorting");
		for(int i=unsort.length-1;i>0;i--)
		{
			int t=unsort[i];
			unsort[i]=unsort[0];
			unsort[0]=t;
			heapAdjust_max(unsort,0,i);
		}
	}
	public static void heapAdjust_min(int [] arr,int ind,int len)
	{
		int left=2*ind;
		int right=2*ind+1;
		int min=ind;
		if(left<len && arr[min]>arr[left])
			min=left;
		if(right<len && arr[min]>arr[right])
			min=right;
		if(min!=ind)
		{
			int t=arr[ind];
			arr[ind]=arr[min];
			arr[min]=t;
		}else{
			return;
		}
//		for(int t:arr)
//			System.out.print(t+" ");
//		System.out.println();
		heapAdjust_max(arr,min,len);
	}
	
}
