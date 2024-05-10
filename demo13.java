import java.util.Scanner;

public class demo13 {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        Calc1 c1 = new Calc1();
        Message2 m2 = new Message2();
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();

    }
    
}
class Calc1 implements Runnable{
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("Calculation task started");
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of two numners is " + sum);
        System.out.println("Calculation task ended");
        sc.close();
        System.out.println("-------------------------------------");
    }

}
class Message2 implements Runnable{
    public void run(){
        System.out.println("Disdplaying important message");
        try {
            for(int i = 0; i<4; i++){
                System.out.println("MISSION IMPOSSIBLE");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.out.println("OOPS ! Something went wrong");
        }

    }
}
