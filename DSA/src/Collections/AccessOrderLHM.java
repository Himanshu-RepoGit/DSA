package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class AccessOrderLHM  {
	int capacity=3;
	LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>(capacity, 0.75f, true){
		   @Override
           protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
               return size() > capacity;
           }
	};
}


class LRUCache extends LinkedHashMap<Integer, String>{
	int capacity;
	public LRUCache(int capacity) {
	super(capacity, 0.75f, true);
	this.capacity=capacity;
	}
	  @Override
      protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
          return size() > capacity;
      }
}