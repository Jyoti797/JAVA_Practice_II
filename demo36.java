import java.util.HashMap;

public class demo36 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Shubhmann Gill");
        map.put(45, "Rohit Sharma");
        map.put(18, "Virat Kohli");
        map.put(17, "Rishabh Pant");
        map.put(33, "Hardik Pandaya");
        map.put(9, "Ishan Kishan");
        map.put(7, "MS Dhoni");
        map.put(10, "Sachin Ramesh Tendulkar");



        System.out.println("size of the map is " + map.size());
        System.out.println("elements in the map is");
        System.out.println(map);

        if(map.containsKey(10)){
            String name = map.get(10);
            System.out.println("value for key 10 is " + name);
        }

    }
    
}
