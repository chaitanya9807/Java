import java.util.Scanner;

public class factorial {
    static int fact(int n){
        if(n!=0){
            return n*fact(n-1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.println("Factorial of "+n+" is "+fact(n));
        System.out.println("Made By:Chaitanya Sharma");
    }
}
