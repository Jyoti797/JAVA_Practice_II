import java.util.*;

public class demo29 {
    public static void main(String[] args) {
        ArrayList<String> jyoti = new ArrayList<String>();
        jyoti.add("Jyoti Ranjan Mohanta");
        jyoti.add("FOS-MCA-22-24-005");
        jyoti.add("Sri Sri University");
        jyoti.add("B.Sc  Zoology Hons");
        
        ArrayList <String> Aviram = new ArrayList<String>();
        Aviram.add("Aviram Mohapatra");
        Aviram.add("FOS-MCA-22-24-019");
        Aviram.add("Sri Sri University");
        Aviram.add("B.Sc Chemistry");
       
        ArrayList <String> Diga = new ArrayList<String>();
        Diga.add("Digvijay Nayak");
        Diga.add("FOS-MCA-22-24-009");
        Diga.add("Sri Sri University");
        Diga.add("B.Sc Physics");

        ArrayList <Object> Students = new ArrayList<Object>();
         Students.addAll(jyoti);
        Students.addAll(Aviram);
        Students.addAll(Diga);
        System.out.println(Students);
    }
    
}
