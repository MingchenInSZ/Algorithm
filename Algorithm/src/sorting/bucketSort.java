package sorting;
import java.util.*;
public class bucketSort {

	public static void bucket_sort(double [] unsort,double [] sorted)
	{
		int len=unsort.length;
		HashMap<Integer,ArrayList<Double>> hmap= new HashMap<Integer,ArrayList<Double>>();
		for(double d:unsort)
		{
			int ind=(int)Math.floor(len*d);
			if(!hmap.containsKey(ind))
				hmap.put(ind, new ArrayList<Double>());
			ArrayList<Double> t=hmap.get(ind);
			t.add(d);
			hmap.put(ind,t);
		}
		int c=0;
		for(Integer ind:hmap.keySet())
		{
			ArrayList<Double> t=hmap.get(ind);
			if(t.size()>0)
			{
				Double [] tmp=new Double[t.size()];
				t.toArray(tmp);
				insertSort.insert_sort(tmp);
				for(Double D:tmp)
					sorted[c++]=D;
			}
		}
		
	}
}