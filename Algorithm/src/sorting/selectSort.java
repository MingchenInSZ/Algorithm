package sorting;

public class selectSort {

	public static void select_sort(int [] unsort)
	{
		for(int i=0;i<unsort.length-1;i++)
		{
			int min = i;
			for(int j=i+1;j<unsort.length;j++)
			{
				if(unsort[j]<unsort[min])
					min=j;
			}
			if(min!=i)
			{
				int t=unsort[i];
				unsort[i]=unsort[min];
				unsort[min]=t;
			}
		}
	}
}
