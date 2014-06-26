package sorting;

public class insertSort {

	public static void insert_sort(int [] unsort)
	{
		for(int i=1;i<unsort.length;i++)
		{
			int cur=unsort[i],ind=i;
			while(ind>0 && unsort[ind-1]>cur)
			{
				unsort[ind]=unsort[--ind];
			}
			unsort[ind]=cur;
		}
	}
}
