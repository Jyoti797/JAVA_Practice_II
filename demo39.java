import java.util.*;
import java.util.Map.*;



public class demo39 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Chennai Super Kings");
        map.put(2, "Gujrat Titans");
        map.put(3, "Lucknow Supergiants");
        map.put(4, "Mumbai Indians");
        map.put(5, "Royal Challangers Banglore");
        map.put(6, "Kings XI Punjab");
        map.put(7, "Rajasthan Royals");
        map.put(8, "Delhi Capitals");
        map.put(9, "Kolkata Knight Riders");
        map.put(10, "Sun Risers Hyderbad");

        // Set keySet = map.keySet();
        // Iterator itr3 = keySet.iterator();
        // while(itr3.hasNext()){
        //     Integer x = (Integer) itr3.next();
        //     System.out.println(x);
        // }

        // Collection values = map.values();
        // Iterator itr1 = values.iterator();
        // while(itr1.hasNext()){
        //     String name = (String) itr1.next();
        //     System.out.println(name);
        // }

        Set jumanji = map.entrySet();
        Iterator itr = jumanji.iterator();

        while(itr.hasNext()){
            Map.Entry data = (Entry) itr.next();
            System.out.println(data.getKey() + " : " + data.getValue());
        }

    







        
    }
    
}
