public class demo16 {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        Printing p = new Printing();
        Thread t1 = new Thread(p);
        t1.start();
        try {
             t1.join();
        } catch (Exception e) {
            System.out.println("ERROR 404 Not found");
        }
        System.out.println("Main thread finished the work");
    }
}
class Printing implements Runnable{
    public void run(){
        try {
            for(int i = 0; i < 4; i++){
                System.out.println("Puneet Superstar");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
