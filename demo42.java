import java.util.WeakHashMap;

public class demo42 {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2();
        Employee2 e2 = new Employee2();
        Employee2 e3 = new Employee2();

        e1.name = "Jyoti Ranjan Mohanta";
        e1.qual = "Zoology hons";
        e2.name = "Aviram Mohapatra";
        e2.qual = "Chemistry hons";
        e3.name = "Digvijay Nayak";
        e3.qual = "Physics hons";

        WeakHashMap<Integer, Employee2> map = new WeakHashMap<>();
        map.put(5, e1);
        map.put(20, e2);
        map.put(9, e3);

        System.out.println(map);
        
    }
    
}
class Employee2{
     String name;
     String qual;
     @Override
     public String toString(){
        return name + " : " + qual;
     }
    

}
