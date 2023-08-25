public class Main {
    public static void main(String[] args){

        System.out.println("Main is executing!");
        Thread1 myThread = new Thread1("thread1");/*creating an obj of your own thread
        which is overriding run() method of Thread class*/
        myThread.start();
        //using Lambda func
        Thread thread2 = new Thread(()-> {
            for (int i = 0; i < 5; i++)
                System.out.println("Inside " + Thread.currentThread().getName() + " " + i);
        },"thread2");//passing a runnable instance in Thread class
        thread2.start();
        System.out.println("Main is existing!");
    }
}