package sorting;

public class countingSort {
	/*
	 * This algorithm is linear time comp.
	 */
	public static void counting_sort(int [] unsort,int [] sorted)
	{
		int [] tmp=new int[getMax(unsort)+1];//+1 means the number in unsort  just be the index of tmp
		// counting the frequency of number
		for(int t:unsort)
			tmp[t]++;
		//calculating the culmulative sum----that is the number of greater or equal than the current
		for(int i=1;i<tmp.length;i++)
			tmp[i]+=tmp[i-1];
		//from the last down to first to keep the algorithm steady
		for(int i=unsort.length-1;i>=0;i--)
		{
			sorted[tmp[unsort[i]]-1]=unsort[i];
			tmp[unsort[i]]--;
		}
			
	}
	public static int getMax(int [] arr)
	{
		int max=-100;
		for(int t:arr)
		{
			if(t>max)
				max=t;
		}
		return max;
	}
}
