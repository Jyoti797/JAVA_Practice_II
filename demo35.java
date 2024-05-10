import java.util.ArrayList;
import java.util.Iterator;

public class demo35 {
    public static void main(String[] args) {
        Student5 sonu = new Student5();
        Student5 jyoti = new Student5();
        jyoti.name = "Jyoti Ranjan Mohanta";
        jyoti.rollNum = "FOS-MCA-2022-24-005";

        sonu.name = "Bibekanada Barik";
        sonu.rollNum = "FOS-MCA-2022-24-003";

        ArrayList <Student5> al = new ArrayList<Student5>();
        al.add(jyoti);
        al.add(sonu);

      
        

        
    }
}
class Student5{
    String name;
    String rollNum;
}
class Employee5{
    String name;
    int empId;
}