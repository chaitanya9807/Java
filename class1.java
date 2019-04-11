import java.util.Scanner;
class Test{

    int a;

    void enter(){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the value of a\n");
        a=scan.nextInt();
    }

    void print(){
        System.out.print("The value of a is:"+a);
    }

}
public class class1 {
    public static void main(String[] args) {
        Test T1= new Test();
        T1.enter();
        T1.print();
    }

}
