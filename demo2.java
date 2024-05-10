interface Animal{
    void bark();
}
class Dog implements Animal{
    public void bark(){
        System.out.println("Dog is barking");
    }
}
public class demo2 {
 
    public static void main(String[] args) {
        Dog lucky = new Dog();
        lucky.bark();
        
    }
    
}
