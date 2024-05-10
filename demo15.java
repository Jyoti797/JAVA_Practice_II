public class demo15 {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        Child t1 = new Child();
        t1.start();
        
    }
    
}
class Child extends Thread{
    public void run(){
        System.out.println("Child thread executing");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("OOPS ! Something went wrong");
        }
        System.out.println("Child thread task completed");
    }
}