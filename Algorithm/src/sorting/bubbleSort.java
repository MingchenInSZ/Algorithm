package sorting;

public class bubbleSort {

	public static void bubble_sort(int [] unsort)
	{
		for(int i=0;i<unsort.length;i++)
		{
			boolean change=false;
			for(int j=0;j<unsort.length-i-1 ;j++)
			{
				if(unsort[j]>unsort[j+1])
				{
					int t=unsort[j];
					unsort[j]=unsort[j+1];
					unsort[j+1]=t;
					change=true;
				}
			}
			if(!change)return;
		}
	}
}
