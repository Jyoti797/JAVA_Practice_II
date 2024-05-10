import java.util.Scanner;


public class demo12 {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        Calc c1 = new Calc();
        Message m1 = new Message();
        m1.start();
        c1.start();
     
        
    }
}
class Calc extends Thread{
    public void run(){
        int a, b, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Calculation started");
        System.out.println("Enter 1st number");
        a = sc.nextInt();
        System.out.println("Enter 2nd number");
        b = sc.nextInt();
        sum = a + b;
        System.out.println("Sum of two numbers is " + sum);
        System.out.println("Calculation ended");
        System.out.println("-----------------------------------");
        sc.close();;

    }
}
class Message extends Thread{
        public void run(){
            System.out.println("Displaying important message");
            try {
                for(int i = 0; i<3; i++){
                    System.out.println("Puneet Superstar");
                    Thread.sleep(3000);
                }
            } catch (Exception e) {
                System.out.println("Something Went wrong");
            }
            System.out.println("Displaying message task ended");
        }
}