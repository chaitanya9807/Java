class A1 implements Runnable{

    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println("From thread :"+i);
    }

}
public class Thread_using_runnable_Interface {


    public static void main(String[] args) {

        System.out.println("Made By Akshat Mangal");
        A1 runnable = new A1();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("End of main thread");
    }

}
