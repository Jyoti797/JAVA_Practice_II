import java.util.Scanner;

public class demo14 {
    public static void main(String[] args) {
        System.out.println("Main THread Started");
        JassyThread j1 = new JassyThread();
        JassyThread j2 = new JassyThread();
       j1.setName("CALC");
       j2.setName("PRINT");
       j1.start();
       j2.start();
        
    }
    
}
class JassyThread extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        if (name.equals("CALC")) {
            calc();
        } else {
            impMessage();
        }
       
    }
    public void calc(){
        System.out.println("-------------------------------------");
        System.out.println("Calculation started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        sc.close();
        int sum = a+b;
        System.out.println("Sum of two numbers is " + sum);
        System.out.println("Calculation ended");
        System.out.println("-----------------------------------------");

    }
    public void impMessage(){
        System.out.println("Displaying important message");
        try {
            for(int i = 0; i<4; i++){
                System.out.println("Puneet Superstar");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.out.println("OOPS ! Something went wrong");
        }

    }
}
