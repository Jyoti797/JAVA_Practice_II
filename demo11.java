public class demo11 {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        JyotiThread j = new JyotiThread();
        j.start();   
    }
}
class JyotiThread extends Thread{
    public void run(){
        System.out.println("Child thread");
    }
}
