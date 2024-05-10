public class demo7 {
    public static void main(String[] args) {
        int num = 25;
        int d = 0;
        int result = 1;
        try {
            result = num / d;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(result);
    }
    
}
