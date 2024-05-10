import java.util.*;

public class demo44 {
    public static void main(String[] args) {
        // Gen<Integer> g = new Gen<Integer> (10);
        // g.disp();
        
        // Gen <String> g1 = new Gen<String>("Physics wallha");
        // g1.disp();

    }
    
}

class Gen<T>{
    T obj;
    public Gen(T obj){
        this.obj = obj;
    }

    public void disp(){
        System.out.println("The type of data is " + obj.getClass().getName());
        
    }

    public T getObj(){
        return obj;
    }
}

