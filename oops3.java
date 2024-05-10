public class oops3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(15, 20);
        int result1 = r1.areaOfRectangle();
        System.out.println("Area of rectangle 1 is " + result1);
        
        
    }
    
}
class Rectangle{
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int areaOfRectangle (){
        int a = (int) this.length * this.breadth;
        return a;
    }

}
