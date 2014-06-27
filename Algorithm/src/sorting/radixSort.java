package sorting;

public class radixSort {

	public static void radix_sort(int [] unsort,int radix)
	{
		int [][] bucket = new int[radix][unsort.length];
		
		int r=1;
		for(int i=0;i<getMaxLen(unsort);i++)
		{
			int []count= new int[unsort.length];
			for(int t:unsort)
			{
				bucket[t%(10*r)/r][count[t%(10*r)/r]]=t;
				count[t%(10*r)/r]++;
			}
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
