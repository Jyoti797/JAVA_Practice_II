import java.util.ArrayList;

public class demo28 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhijit");
        names.add("Sourav");
        names.add("Sonu");
        names.add("Jassy");
        names.add("Jyoti");

        System.out.println(names.contains("Jyoti"));
        System.out.println(names.indexOf("Jyoti"));
        System.out.println("Size of the array list is " + names.size());
        names.clear();
        System.out.println(names);
        
    }
}
