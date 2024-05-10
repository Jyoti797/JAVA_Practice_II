import java.util.Scanner;

public class demo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number");
        try {
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }
        sc.close();
        System.out.println(num);


    }
    
}
