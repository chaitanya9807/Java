import java.util.Scanner;

public class sorting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an array");
        int a[]=new int[10];
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<10;i++){
            temp=0;
            for(int j=0;j<10;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The sorted array is:");
        for(int i=0;i<10;i++){
            System.out.print(a[i]+" ");
        }
    }
}
