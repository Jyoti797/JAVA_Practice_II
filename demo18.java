public class demo18 {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        int result= 0;
        try {
            result = a/b;
            System.out.println("Inside try block");
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }
        System.out.println(result);
        System.out.println("Dhanyabaaad");
    }
    
}
