public class demo8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int result;
        try {
            result = arr[10];
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Normal Termination of programme");
    }
    
}
