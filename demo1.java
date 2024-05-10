interface Shape{
    void getArea(int a, int b);
}
class Rectangle implements Shape{
    int length;
    int breadth;
    public void getArea(int length, int breadth){
        int area = length * breadth;
        System.out.println("Area of Rectangle is " + area);
    }

}
class Circle implements Shape{
    int radius;
    int a = 1;
    public void getArea(int radius, int  a){
        float area = 3.14f * radius * radius;
        System.out.println("Area of circle is " + area);
    }

}

class Triangle implements Shape{
    int breadth;
    int height;
    public void getArea(int breadth, int height){
        float area = 0.5f * breadth * height;
        System.out.println("Area of Triangle is " + area);
    }
}
public class demo1{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();
       
        Triangle t1 = new Triangle();
        r1.getArea(35, 22);
        c1.getArea(21, 0);
     
        t1.getArea(25, 32);
        
    }
}