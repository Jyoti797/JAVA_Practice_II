public class demo24 {
    public static void main(String[] args) {
        Hari1 obj = new Hari1();
        obj.a();

        
    }
}
class Hari1{
    public void a(){
        System.out.println("Inside A");
        b();
    }
    public void b(){
        int a = 15;
        int b = 0;
        int result = 0;
        try {
            result = a/b;
        } catch (Exception e) {
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println(result);
        }

    }
}
