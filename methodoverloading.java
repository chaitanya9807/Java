import java.util.Scanner;

public class methodoverloading {
    public static int multiply(int a, int b){
        return(a*b);
    }
    public static float multiply(float a, float b){
        return(a*b);
    }
    public static int multiply(int a, int b,int c){
        return(a*b*c);
    }
    public static void main(String[] args){
        int i,j,k;
        float x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integers:");
        i=sc.nextInt();
        j=sc.nextInt();
        System.out.println(multiply(i,j)+" is the product of "+i+" and "+j);
        System.out.println("Enter two float values:");
        x=sc.nextFloat();
        y=sc.nextFloat();
        System.out.println(multiply(x,y)+" is the product of "+x+" and "+y);
        System.out.println("Enter three integers:");
        i=sc.nextInt();
        j=sc.nextInt();
        k=sc.nextInt();
        System.out.println(multiply(i,j,k)+" is the product of "+i+" , "+j+" and "+k);
        System.out.println("Made By:Chaitanya Sharma");
    }

}
