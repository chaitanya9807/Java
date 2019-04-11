class A extends Thread{


    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println("From thread A :"+i);
    }


}

class B extends Thread{

    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println("From thread B :"+i);
    }


}
public class thread_using_class {
    public static void main(String[] args) {
        System.out.println("Made By Akshat Mangal");
        A threadA = new A();
        B threadB = new B();
        System.out.println("Starting thread A");
        threadA.start();
        System.out.println("Starting thread B");
        threadB.start();
    }

}
