package GenaralJava;

import java.util.Map.Entry;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortTreeMapByValue {
	
	public SortTreeMapByValue() {
	//return;
	}
public static void main(String[] args) {
	TreeMap<String, Integer> treeMap=new TreeMap<String, Integer>();
	  treeMap.put("John", 25);  
      treeMap.put("Alice", 30);  
      treeMap.put("Bob", 20);  
      treeMap.put("Eve", 35);  
      List<Entry<String,Integer>> li =new ArrayList<>(treeMap.entrySet()); 
      Comparator<Map.Entry<String, Integer>> comparator = 
    		    (o1, o2) -> o1.getValue()-o2.getValue();
    		    li.sort(comparator);
    		    for (Entry<String, Integer> entry : li) {
    	            System.out.println(entry.getKey() + ": " + entry.getValue());
    	        }		    

}
}
