//import jdk.internal.module.SystemModuleFinders;

public class Acc_modpr1 {
    private int a=24;
    // Private Accessifiers cannot be accesed even by child class
    // But can be indirectly accessed   
    int PrintNumber()
    {
        return a;
    }
    private int Method_1(int a)
    {
        System.out.println("Perimeter");
        return this.a*a;
    }
    int Method_2(int b)
    {
        return Method_1(b);
    }

    public static void main(String[] args) {
        Acc_modpr1 obj=new Acc_modpr1();
        int b=obj.Method_1(2);
        System.out.println(b);

    }

}
// class SubClass extends Acc_modpr1
// {
//     Acc_modpr1 obj=new Acc_modpr1();
    
// }
