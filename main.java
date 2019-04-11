import java.util.Scanner;

class name{
    String name;
}
class marks extends name{
    int marks;
}
class result extends marks{
    public static void finals(String n,int m){
        System.out.println("Marks of "+n+" is "+m);
    }
}
public class main {
    public static void main(String[] args){
        name n=new name();
        marks m=new marks();
        result r=new result();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        n.name=sc.next();
        System.out.println("Enter marks:");
        m.marks=sc.nextInt();
        r.finals(n.name,m.marks);
        System.out.println("Made by:Chaitanya Sharma");
    }
}
