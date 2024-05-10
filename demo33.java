public class demo33 {
    public static void main(String[] args) {

        
    }
}

class Queue{
    int x;
    boolean valueInX = false;
    public void put (int j){
        try {
            if (valueInX == true) {
                wait();
            } else {
                x = j;
                System.out.println("I have produced value x " + x);
                
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }
    }
}
