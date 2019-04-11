import java.util.Scanner;

class name1{
    String name;
}
interface marks1{
    public void getmarks();
}
class result1 extends name1 implements marks1{
    public void getmarks() {
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.println("Enter marks:");
        marks=sc.nextInt();
        show(marks);
    }
    public void show(int marks){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        name=sc.next();
        System.out.println("Marks of "+name+" is "+ marks);
    }
}
public class main1 {
    public static void main(String[] args){
        result1 r=new result1();
        r.getmarks();
        System.out.println("Made By Chaitanya Sharma");
    }
}
