import java.util.*;
import java.util.Map.*;



public class demo37 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Abhijit Mohanty");
        map.put(3, "Bibekananda Barik");
        map.put(4, "Jashobanta Mohanty");
        map.put(5, "Jyoti Ranjan Mohanta");
        map.put(6, "Jabili Yellenini");
        map.put(7, "Sujanika Priyadarshini");
        map.put(8, "Biswajit Mazumdaar");
        map.put(9, "Digvijay Nayak");
        map.put(10, "Chinmay Mohapatra");
        map.put(11, "Soumya Subhradeep Bhoi");
        map.put(12, "Asish Kant Arya Shivam");
        map.put(13, "Aayushi Sathpathy");
        map.put(14, "Subhasmita Behera");
        map.put(15, "Prakash Kumar Sahoo");
        map.put(16, "Sourav Saiman Jena");

    //    System.out.println(map);
    //    System.out.println(map.get(14));
    //return keys
        
    
        Set keySet=map.keySet();
        Iterator itr1=keySet.iterator();
        while(itr1.hasNext()){
            Integer key = (Integer)itr1.next();
            System.out.println(key);
        }

        Collection values = map.values();
        Iterator itr2 = values.iterator();
        while(itr2.hasNext()){
            String names = (String)itr2.next();
            System.out.println(names);
        }








    }
    
}
