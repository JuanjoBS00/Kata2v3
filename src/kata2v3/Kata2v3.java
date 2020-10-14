package kata2v3;

import java.util.Iterator;
import java.util.Map;

public class Kata2v3 {
    
    public static void main(String[] args) {
       
       int[] data = {1, 4, 3, 7, 5, 4, 2, 7, 8, 34, 3, 9, 12, 5, 4, 12, 12, 12, 12};
       
       Histogram meta_histogram = new Histogram(data);
        
        Map<Integer, Integer> histogram;
        histogram =  meta_histogram.getHistogram();
        
       Iterator <Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
       while (entries.hasNext()){
           Map.Entry<Integer, Integer> entry = entries.next();
           System.out.println("key = "+ entry.getKey() + " value = "+ entry.getValue());
       }
        
    }
    
}
