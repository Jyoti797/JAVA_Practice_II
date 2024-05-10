public class demo10{
    public static void main(String[] args) {
        System.out.println("Before Changing");
        String name1 = Thread.currentThread().getName();
        System.out.println("Name of the thread is " + name1);
        System.out.println("Priority of thread is " + Thread.currentThread().getPriority());
        System.out.println("------------------------------------------");
        System.out.println("After changing");
        Thread t1 = new Thread();
        t1.setName("Jyoti Ranjan Mohanta");
        t1.setPriority(1);
        String name2 = t1.getName();
        System.out.println("Nmae of the thread is " + name2);
        System.out.println("Priority of thread is " + t1.getPriority());
        

    }
}