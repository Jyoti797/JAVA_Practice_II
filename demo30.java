import java.util.ArrayList;


public class demo30 {
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

        ArrayList <String> Mazumdar = new ArrayList<String>();
        Mazumdar.add("Biswajit Mazumdar");
        Mazumdar.add("FOS-MCA-22-24-008");
        Mazumdar.add("Sri Sri University");
        Mazumdar.add("Bachlor in Computer Applications");

        for(int i = 0; i<jyoti.size(); i++){
            System.out.println(jyoti.get(i));
        }

        for(Object x : Aviram){
            System.out.println(x);
        }
        for(Object x : Diga){
            System.out.println(x);
        }
        for(Object x : Mazumdar){
            System.out.println(x);
        }        
    }
}
