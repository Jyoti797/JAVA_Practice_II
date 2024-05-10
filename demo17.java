public class demo17 {
    public static void main(String[] args) {
        Alpha a = new Alpha();
        Beta b = new Beta();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
        
    }
}
class Alpha implements Runnable{
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i = 0; i <3; i++){
            System.out.println(name);
        }
    }
}
class Beta implements Runnable{
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i = 0; i<3; i++){
            System.out.println(name);
        }
    }
}
