public class demo19 {
    public static void main(String[] args) {
        int a = 15;
        int b = 3;
        int result = 0;
        int [] values = {1,2,3,4,5,6,7};
        try {
            result = a/b;
            System.out.println(values[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong ");
            System.out.println(e.getMessage());
        }
        System.out.println(result);
        System.out.println("Dhanyabaad");
    }
    
}
