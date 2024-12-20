package UBS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class BlackListedIps {
//[1,0,0,1,1,0,0]
	public static void main(String[] args) {
		List<String> blackListedips=Arrays.asList("*111.*" , "123.*" , "34.*");
		List<String> requests=Arrays.asList("123.1.23.34", "121.1.23.34", "121.1.23.34", "34.1.23.34","121.1.23.34", "12.1.23.34", "121.1.23.34");
		List<Integer> result=validateRequest(new ArrayList<String>(blackListedips), new ArrayList<String>(requests));
		result.forEach(System.out::print);
	}
	public static List<Integer> validateRequest(List<String> blacklistedips, List<String> requests){
    List<Integer> result = new ArrayList<Integer>();
    List<Pattern> patterns=new ArrayList<>();
    Map<String,List<Integer>> ipRequests=new HashMap<>();
    for(String ips:blacklistedips) {
    	String regex=ips.replace(".", "\\.").replace("*", ".*");
    	
    	patterns.add(Pattern.compile(regex));
    }
    for(int i=0;i<requests.size();i++) {
    	String request=requests.get(i);
    	int currentTime=i+1;
    	boolean isBlackListed=false;
    	for(Pattern patt:patterns) {
    		if(patt.matcher(request).matches()) {
    			isBlackListed=true;
    			break;
    		}
    	}
    	if(isBlackListed) {
    		result.add(1);
    	}
    	else {
    		List<Integer> timestamps=ipRequests.getOrDefault(request, new ArrayList<Integer>());
    		timestamps.removeIf(timestamp->currentTime-timestamp>=5);
    		timestamps.add(currentTime);
    		ipRequests.put(request, timestamps);
    		if(timestamps.size()>2) {
    			timestamps.removeLast();
    			result.add(1);
    		}
    		else {
    			result.add(0);
    		}
    	}
    }
    
    
		return result;
	}
	
}
