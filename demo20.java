public class demo20 {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        int result = 0;
        int[] arr = {1,2,3,4,5,6,7};
        String name = null;
        try {
            result = a/b;
            System.out.println(arr[1]);
            System.out.println(name.length());
        } catch (ArithmeticException e) {
          System.out.println("You can not divide a number by zero");
        }
        catch( ArrayIndexOutOfBoundsException e){
          System.out.println("Stay in your limit");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }
        System.out.println(result);
        System.out.println("Dhanyabaaad");
    }
    
}
