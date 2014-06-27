package sorting;

public class radixSort {

	public static void radix_sort(int [] unsort,int radix)
	{
		//Using 2-D array store the traversed arrary
		int [][] bucket = new int[radix][unsort.length];
		
		int r=1;
		for(int i=0;i<getMaxLen(unsort);i++)
		{
			//Using count to record the count number of the specific bit
			int []count= new int[unsort.length];
			for(int t:unsort)
			{
				bucket[t%(10*r)/r][count[t%(10*r)/r]]=t;
				count[t%(10*r)/r]++;
			}//recording
			int c=0;
			for(int j=0;j<radix;j++)
			{
				if(count[j]!=0)
				{
					for(int t=0;t<count[j];t++)
					{
						//System.out.println(c);
						unsort[c++]=bucket[j][t];
						
					}
				}
			}
			r*=10;
		}
		
		
	}
	/*
	 * get the length of the number
	 * */
	public static int getLen(int num)
	{
		int count=0;
		while(num!=0)
		{
			num/=10;
			count++;
		}
			
		return count;
	}
	/*
	 * get the max length of the input arrary;
	 */
	public static int getMaxLen(int [] arr)
	{
		int max=0;
		for(int t:arr)
		{
			int len=getLen(t);
			if(len>max)
				max=len;
		}
		return max;	
	}
}
