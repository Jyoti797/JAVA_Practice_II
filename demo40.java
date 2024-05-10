import java.util.*;
import java.util.Map.*;


public class demo40 {
    public static void main(String[] args) {
        Student6 s1 = new Student6();
        Student6 s2 = new Student6();
        Student6 s3 = new Student6();
        Student6 s4 = new Student6();
        Student6 s5 = new Student6();
        s1.name = "Jyoti Ranjan Mohanta";
        s1.roll = "FOS-MCA-2022-24-005";
        s1.qual = "Zoology hons";

        s2.name = "Digvijay Nayak";
        s2.roll = "FOS-MCA-2022-24-009";
        s2.qual = "Physics hons";

        s3.name = "Aviram Mohapatra";
        s3.roll = "FOS-MCA-2022-24-021";
        s3.qual = "Chemistry hons";

        s4.name = "Prakash Ku Sahoo";
        s4.roll = "FOS-MCA-2022-24-015";
        s4.qual = "B.Com";

        s5.name = "Sujanika Priyadarshini";
        s5.roll = "FOS-MCA-2022-24-007";
        s5.qual = "Botany hons";

        // HashMap <Integer, Student6> map = new HashMap<>();
        // map.put(1, s1);
        // map.put(2, s2);
        // map.put(3, s3);
        // map.put(4, s4);
        // map.put(5, s5);

        // Set jumanji = map.entrySet();
        // Iterator itr = jumanji.iterator();

        // while(itr.hasNext()){
        //     Map.Entry data = (Entry) itr.next();
        //     System.out.println(data.getValue());
        // }

        ArrayList<Student6> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);

       for(Student6 obj : al){
         obj.disp();
       }
  
   
     }
}
class Student6{
    String name;
    String roll;
    String qual;

    public void disp(){
        System.out.println("NAME : " + name);
        System.out.println("Roll Number : " + roll);
        System.out.println("Qualification : " + qual);
        System.out.println("");
    }
}

