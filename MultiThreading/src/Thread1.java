public class Thread1 extends Thread{

    @Override
    public void run(){
        //whatever code we want to execute via this thread we write it under run() method by overriding it

        for(int i=0;i<=5;i++){
            System.out.println("Inside "+Thread.currentThread().getName()+" "+i);
        }
    }

    public Thread1(String threadName){
        super(threadName);
    }
}
