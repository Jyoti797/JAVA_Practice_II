public class demo6 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Aviram Mohapatra";
        e1.bs = 20000;
       e1.calculateSalary();
    }
}
interface ssu{
    void calculateSalary();
}
class Employee implements ssu{
    String name;
    int bs,grossSalary, netSalary;
    float ta,da,hra,pf;
    public void calculateSalary(){
        this.ta = 0.15f * this.bs;
        this.da = 0.18f * this.bs;
        this.hra = 0.2f * this.bs;
        this.pf = 0.25f * this.bs;
        this.grossSalary = (int) (this.bs+this.ta+this.da+this.hra+this.pf);
        this.netSalary = grossSalary - (int)pf;
        System.out.println("Gross salary of " + this.name + " is :" + this.grossSalary);
        System.out.println("Net salary of " + this.name + " is :" + this.netSalary);
    }
}
