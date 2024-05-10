import java.util.Scanner;

public class demo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 100;
        System.out.println("Enter a number");
        try {
            num = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        } 
       finally{
        System.out.println(num);
        sc.close();
        System.out.println("Resource closed");
       }
        
    }
    
}
