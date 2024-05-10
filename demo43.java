import java.util.ArrayList;


public class demo43 {
    public static void main(String[] args) {
        Student7 s1 = new Student7();
        Student7 s2 = new Student7();
        Student7 s3 = new Student7();

        s1.name = "Jyoti Ranjan Mohanta";
        s1.roll = "FOS-MCA-2022-24-005";
        s1.qual = "Zoology hons";

        s2.name = "Digvijay Nayak";
        s2.roll = "FOS-MCA-2022-24-009";
        s2.qual = "Physiscs hons";

        s3.name = "Jashobanta Mohanty";
        s3.roll = "FOS-MCA-2022-24-004";
        s3.qual = "Mathematics hons";

        ArrayList<Student7> allu = new ArrayList<>();
        allu.add(s1);
        allu.add(s2);
        allu.add(s3);

        System.out.println(allu);
        
       
    }
    
}
class Student7{
    String name;
    String roll;
    String qual;

    @Override
    public String toString(){
        return name + "\n" + roll + "\n" + qual + "\n";
    }

}
