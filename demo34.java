import java.util.ArrayList;

public class demo34 {
    public static void main(String[] args) {
        //type safety
        String arr[] = new String[10];
        arr[0] = "Jyoti Ranjan Mohanta";
        arr[1] = "Abhijit Mohanty";
        arr[2] = "Digvijay Nayak";
        arr[3] = "Bibekananda Barik";
    
        ArrayList <String> al = new ArrayList<String>();
        
        // String n1 = (String) al.get(0);
        // String n2 = (String) al.get(1);
        // String n3 = (String) al.get(2);
        // String n4 = (String) al.get(4);
        
  

        System.out.println(al);

    }
    
}
