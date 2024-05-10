public class demo25 {
    public static void main(String[] args) {
        Hari2 obj = new Hari2();
        try {
            obj.a();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }
    }
}
class Hari2{
    public void a() throws Exception 
    {
        System.out.println("Inside A");
        b();
    }
    public void b() throws Exception 
    {
        int a = 123;
        int b = 0;
        int result = 0;
        result = a/b;
        System.out.println(result);
     
    }
}
