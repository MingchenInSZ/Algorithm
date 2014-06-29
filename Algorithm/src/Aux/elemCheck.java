package Aux;
import java.util.*;
public class elemCheck {

	public static int getDifNum(int [] arr)
	{
		Set<Integer> tset = new HashSet<Integer>();
		for(int t:arr)
			tset.add(t);
		return tset.size();
	}
	public static void getRepNum(int [] arr)
	{
	  HashMap<Integer,Integer> hmap= new HashMap<Integer,Integer>();
	  Set<Integer> tset = new HashSet<Integer>();
	  for(int t:arr)
	  {
		  if(!tset.contains(t))
		  {
			  tset.add(t);
		  }else{
			  if(hmap.containsKey(t))
				  hmap.put(t, hmap.get(t)+1);
			  else{
				  hmap.put(t, 2);
			  }
			  
		  }
	  }
	  for(Integer t:hmap.keySet())
	  {
		  System.out.println(t+" "+hmap.get(t));
	  }
	}
	public static int [] getEvenAndOdd(int []arr)
	{
		int [] count = new int[2];
		for(int t:arr)
			count[t%2]++;
		return count;
	}
	
}
