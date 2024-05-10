
public class demo3 {
    public static void main(String[] args) {
        Spacecraft s1 = new Spacecraft();
        Airplane a1 = new Airplane();
        s1.fly();
        a1.fly();
    }
}
interface Flyable{
    void fly();
}
class Spacecraft implements Flyable{
    public void fly(){
        System.out.println("Spacecraft is flying");
    }
}
class Airplane implements Flyable{
    public void fly(){
     System.out.println("Airplane is flying");   
    }
}
