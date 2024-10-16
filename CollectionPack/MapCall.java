package CollectionPack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapCall {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();

		map.put(1, "Swaraj");
		map.put(2, "Shailesh");
		map.put(3, "Darne");
		
//		System.out.println(map);
		
//		Set set=map.entrySet();
//		Iterator iterator=set.iterator();
//		while(iterator.hasNext())
//		{
//			Map.Entry entry=(Entry) iterator.next();
//			System.out.println(entry);
//		}
		
		for(Map.Entry entry: map.entrySet())
		{
			System.out.println(entry);
		}
		
		
		
		
	}

}
