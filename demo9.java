import java.util.Scanner;

public class demo9 {
       public static void main(String[] args) {
        Calc c1 = new Calc();
        Message m1 = new Message();
        m1.start();;
        c1.start();
    }
}

class Calc extends Thread{
    public void run(){
        int a, b, sum;
        Scanner sc = new Scanner(System.in);
           System.out.println("Enter 1st number");
           a = sc.nextInt();
           System.out.println("Enter 2nd number");
           b = sc.nextInt();
           sum = a + b;
           System.out.println("Sum of two numbers is " + sum);
           sc.close();
    }
}
class Message extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("*************");
            Thread.sleep(2000);
        }
    }
}