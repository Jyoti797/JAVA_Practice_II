public class demo26 {
    public static void main(String[] args) {
        int a = 56;
        int b = 7;
        try{
            if (b < 0) {
                throw new JyotiException("Negative number");
                
            } else {
                int result = a/ b;
                System.out.println(result);
            }
        }
        catch(Exception e){
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }
        
    }
}
class JyotiException extends Exception{
   public JyotiException(String msg){
    super(msg);
   }
}
