public class demo5{
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.drive();
        model3.electric();
        model3.music();
    }
}
interface Car {
    void drive();
    void electric();
    void ac();
    void music();
}
class Tesla implements Car{
    public void  drive(){
        System.out.println("Tesla has auto pilot feature");
    }
    public void  electric(){
       System.out.println("Tesla is completely electric veichle having 500km range");
    }
    public void ac(){
        System.out.println("Tesla has Air Conditioned feature");
    }
    public void music(){
        System.out.println("Tesla uses JBL music system");
    }
}
