import java.util.Scanner;

public class demo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = 100;
        try {
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }
       finally{
        sc.close();
        System.out.println("Resource closed");
       }

    }
    
}
