public class ProducerThread extends Thread{

    Company c;
    ProducerThread(Company company){
        this.c=company;
    }
    @Override
    public void run(){
        int i = 1;
        while(true){
            this.c.produceItem(i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
