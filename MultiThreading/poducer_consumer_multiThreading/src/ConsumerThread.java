public class ConsumerThread extends Thread{

    Company c;

    ConsumerThread(Company company){
        this.c=company;
    }
    @Override
    public void run(){
        int i=1;
        while(true){
            this.c.consumeItem();
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                throw new RuntimeException();
            }
        }
    }
}
